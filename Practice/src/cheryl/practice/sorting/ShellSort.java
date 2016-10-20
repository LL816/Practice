package cheryl.practice.sorting;

/**
 * Created by Cheryl on 2016/10/20.
 * input: 20,2,6,8,1,14,6,22,9,25,21,22
 * Shell sort
 */
public class ShellSort {
    public static void run(int[] input){



        for(int i=0;i<input.length;i++){
            System.out.print(input[i]);
            System.out.print("; ");
        }

    }

    public static void main(String... args){
        //       int[] input ={20,2,6,8,1,14,6,22,9,25,21,22};
        int[] input ={1,2,3,4,5,6};
        ShellSort.run(input);
    }
}

