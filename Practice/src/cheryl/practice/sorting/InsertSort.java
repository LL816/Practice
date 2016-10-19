package cheryl.practice.sorting;

/**
 * Created by Cheryl on 2016/10/19.
 * insert sort
 * input: 20,2,6,8,1,14,6,22,9,25,21,22
 */
public class InsertSort {

    public static void run(int[] input){
 /*       int i=0;
        int j;

        while(i<input.length-1){
            j=i+1;
            for(int k=0;k<=i;k++){
                if(input[k]>input[j]){
                    int temp = input[j];
                    for(int m=j;m>k;m--){
                        input[m]=input[m-1];
                    }
                    input[k]=temp;
                }
            }
            i=j;
        }
*/
        for(int i=1;i<input.length;i++){
            if(input[i]<input[i-1]){
                int j=i-1;
                int temp=input[i];
                while(temp<input[j]){
                    input[j+1]=input[j];
                    j--;
                    if(j<0){
                        break;
                    }
                }
                input[j+1]=temp;
            }
        }

        for(int n=0;n<input.length;n++){
            System.out.print(input[n]);
            System.out.print("; ");
        }
    }

    public static void main(String... args){
        int[] input ={20,2,6,8,1,14,6,22,9,25,21,22};
  //      int[] input ={4,2,3,4,5,6};
        InsertSort.run(input);
    }
}
