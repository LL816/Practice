/**
 * Created by Cheryl on 2016/10/18.
 * list all combinations of array elements: {1,2}-> 1,2,12,21
 */
import java.util.ArrayList;
import java.util.List;

public class listArrCombination {
    static int count=0;
    public static void main(String... args){
        ArrayList<Character> a = new ArrayList<Character>();
        a.add('1');
        a.add('2');
        a.add('3');
        a.add('4');
        a.add('5');
        printAll(a);
    }

    private static void printAll( ArrayList<Character> a) {
        List<Character> subArr = new ArrayList<Character>(a);
        List<Character> prefix = new ArrayList<Character>();
        if(a.isEmpty()){
            System.out.println("empty array");
            return;
        }

        iterSubArr( subArr,  prefix);
        System.out.print("count:" + count);
    }

    private static void iterSubArr(List<Character> subArr, List<Character> prefix) {
        for(int i=0;i<subArr.size();i++){
            char temp = subArr.get(0);
            subArr.set(0,subArr.get(i));
            subArr.set(i, temp);
            prefix.add(subArr.get(0));
            printPrefix(prefix);

            iterSubArr(subArr.subList(1,subArr.size()),prefix);
            subArr.set(i, subArr.get(0));
            subArr.set(0,temp);
            prefix.remove(prefix.size()-1);
        }

    }
    private static void printPrefix(List<Character> prefix){
        count = count+1;

        for(int i=0;i<prefix.size();i++){
            System.out.print(prefix.get(i));
            System.out.print(' ');
        }
        System.out.println(';');

    }
}
