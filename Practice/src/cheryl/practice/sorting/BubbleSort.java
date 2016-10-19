package cheryl.practice.sorting;

/**
 * Created by Cheryl on 2016/10/19.
 * Bubble Sort
 * input: 20,2,6,8,1,14,6,22,9,25,21,22
 */
public class BubbleSort {
    public static void run(int[] input){
        int temp,count=0;
        boolean exchanged=true;

        for(int i=0;i<input.length-1;i++){
            if(exchanged){
                exchanged=false;
            }
            else{
                break;
            }
            for(int j=0;j<input.length-1;j++) {
                count=count+1;
                if(input[j]>input[j+1]){
                    temp=input[j];
                    input[j]=input[j+1];
                    input[j+1]=temp;

                    if(!exchanged){
                        exchanged=true;
                    }
                }
            }
        }
        for(int i=0;i<input.length;i++){
            System.out.print(input[i]);
            System.out.print("; ");
        }
        System.out.println();
        System.out.print(count);
    }

    public static void main(String... args){
 //       int[] input ={20,2,6,8,1,14,6,22,9,25,21,22};
        int[] input ={1,2,3,4,5,6};
        BubbleSort.run(input);
    }
}
