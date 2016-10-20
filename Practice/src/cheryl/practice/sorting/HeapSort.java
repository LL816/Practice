package cheryl.practice.sorting;

/**
 * Created by Cheryl on 2016/10/20.
 * input: 20,2,6,8,1,14,6,22,9,25,21,22
 * HeapSort
 */
public class HeapSort {

    public static void run(int[] input){
        buildHeap(input);
        int size=input.length;

        while (size>0){
            System.out.print(input[0]);
            System.out.print("; ");

            int temp=input[0];
            input[0]=input[size-1];
            size--;
            maxify(input,0,size);
        }

    }

    private static void buildHeap(int[] input) {
        int lastParentNode=input.length/2-1;
        for(int i=lastParentNode;i>=0;i--){
            maxify(input,i,input.length);
        }

    }

    private static void maxify(int[] input, int i,int size) {
        int largest=i;
        int left =2*i+1;
        int right =2*i+2;
        if(left<size&&input[largest]<input[left]){
            largest=left;
        }
        if(right<size&&input[largest]<input[right]){
            largest=right;
        }
        int temp;
        if(largest!=i){
            temp = input[i];
            input[i]=input[largest];
            if(largest!=left){
                input[right]=temp;
            }
            else {
                input[left]=temp;
            }
            maxify(input,largest,size);
        }
    }

    public static void main(String... args){
        int[] input ={20,2,6,8,1,14,6,22,9,25,21,22};
 //       int[] input ={3,2,3,4,5,6};
        HeapSort.run(input);
    }
}
