

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by vadym on 29.01.17.
 */
public class TestNewArrayString {
    public static void main(String[] args) {
        NewArraySimple<String> list = new NewArraySimple<>();
        list.add("Zero");
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        System.out.println("List size before removing: " + list.size());
        System.out.println("Element with 4-th index is " + list.get(4));
        list.remove(3);
        System.out.print("List after removing: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println("List length after removing: " + list.size());
        list.remove("Zero");

        System.out.println("List after removing \"Zero\": ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println("List length after removing: " + list.size());


    }
}
