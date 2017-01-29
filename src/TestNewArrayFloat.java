package com.company;

import java.util.Arrays;

/**
 * Created by vadym on 29.01.17.
 */
public class TestNewArrayFloat {
    public static void main(String[] args) {
        NewArray<Float> list = new NewArray();
        list.add(1.5f);
        list.add(2);
        list.add(3.56f);
        list.add(3.0);
        list.add(4);
        System.out.println("List size before removing: " + list.size());
        System.out.println("Element with 4-th index is " + list.get(4));
        list.remove(3);
        System.out.print("List after removing: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println("List length after removing: " + list.size());
        list.remove(1.5f);

        System.out.println("List after removing \"1.5f\": ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("List length after removing: " + list.size());
    }
}
