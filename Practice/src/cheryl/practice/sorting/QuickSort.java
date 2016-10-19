package cheryl.practice.sorting;

/**
 * Created by Cheryl on 2016/10/19.
 * 20,2,6,8,1,14,6,22,9,25,21,22
 * Quick sort
 */
public class QuickSort {
    public static void run(int[] input){
        quickSort(input,0,input.length-1);


        for(int n=0;n<input.length;n++){
            System.out.print(input[n]);
            System.out.print("; ");
        }
}

    private static void quickSort(int[] input, int low,int high) {
        if (low<high){
            int flagLoc=sortPart(input,low,high);
            quickSort(input,low,flagLoc-1);
            quickSort(input,flagLoc+1,high);
        }
    }

    private static int sortPart(int[] input, int i, int j) {
        int flag=input[i];
        int flagLoc=i;

        while (i<j){
            while(i<j && input[j]>flag){
                j--;
            }
            if(i<j){
                int temp = input[j];
                input[j]=input[i];
                input[i]=temp;
                i++;
                flagLoc=j;
            }
            while (i<j && input[i]<flag){
                i++;
            }
            if(i<j){
                int temp =input[i];
                input[i]=input[j];
                input[j]=temp;
                j--;
                flagLoc=i;
            }

        }
        return flagLoc;
    }

    public static void main(String... args){
//        int[] input ={20,2,6,8,1,14,6,22,9,25,21,22};
        int[] input ={6,2,3,4,5,6};
        QuickSort.run(input);
    }
}