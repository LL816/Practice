package cheryl.practice.sorting;

/**
 * Created by Cheryl on 2016/10/20.
 * input: 20,2,6,8,1,14,6,22,9,25,21,22
 * Merge sort
 */
public class MergeSort {
    public static void run(int[] input) {
        divide(input,0,input.length);

        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
            System.out.print("; ");
        }
    }

    private static void divide(int[] input, int head, int tail) {
        if(head<(tail-1)) {
            int seperator = (head + tail) / 2;
            divide(input, head, seperator);
            divide(input, seperator, tail);
            merge(input,head,seperator,tail);
        }
    }

    private static void merge(int[] input, int head, int seperator, int tail) {
        int[] temp=new int[tail-head];
        int k=0;
        int i=head;
        int j=seperator;
        while(k<(tail-head) && i<seperator && j<tail){
            if(input[i]<input[j]){
                temp[k]=input[i];
                k++;
                i++;

            }
            else{
                temp[k]=input[j];
                k++;
                j++;
            }
        }
        while (k<(tail-head) ){
            if(i>=seperator&&j<tail){
                temp[k]=input[j];
                j++;
                k++;
            }
            else if(j>=tail && i<seperator){
                temp[k]=input[i];
                i++;
                k++;
            }
        }
        int m=head;
        for(int n=0;n<temp.length;n++){
            input[m]=temp[n];
            m++;
        }
    }


    public static void main(String... args){
        int[] input ={20,2,6,8,1,14,6,22,9,25,21,22};
   //     int[] input ={1,2,3,4,5,6};
        MergeSort.run(input);
    }
}
