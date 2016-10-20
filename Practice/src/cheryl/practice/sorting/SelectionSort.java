package cheryl.practice.sorting;

/**
 * Created by Cheryl on 2016/10/20.
 * 20,2,6,8,1,14,6,22,9,25,21,22
 * Selection sort
 */
public class SelectionSort {
    public  static void run(int[] input){

        int min;
        for(int i=0;i<input.length;i++){
            min = input[i];
            for(int j=i+1;j<input.length;j++){
                if(input[j]<min){
                    min=input[j];
                    input[j]=input[i];
                    input[i]=min;
                }
            }
        }

        for(int i=0;i<input.length;i++){
            System.out.print(input[i]);
            System.out.print("; ");
        }
    }


    public static void main(String... args){
        int[] input ={20,2,6,8,1,14,6,22,9,25,21,22};
//        int[] input ={6,2,3,4,5,6};
        SelectionSort.run(input);
    }
}
