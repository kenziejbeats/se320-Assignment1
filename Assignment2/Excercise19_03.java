import java.util.ArrayList;
import java.util.HashSet;

public class Excercise19_03{
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(24);
        list.add(14);
        list.add(42);
        list.add(25);

        ArrayList<Integer> newList = removeDuplicates(list);
        System.out.print(newList);

    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){

        HashSet<E> set = new HashSet<>(list);

        ArrayList<E> result = new ArrayList<>(set);

        return result;

    }
}