
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class F6_2DArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // initialization if dont initalise the arraylist the by default the value will be null
        //  but we want every elemnet to be a arraylist itself thus we have to initalize
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // add element
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        // print list
        System.out.println(list);
        in.close();

    }
}
