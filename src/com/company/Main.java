package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Integer[] array = new Integer[10];
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(2);
            arrayList.add(random.nextInt(2));
            linkedList.add(random.nextInt(2));
        }

        System.out.println("Arrays: _________________________________");
        print(sorting(array));
        System.out.println("\nArrayList: _________________________________");
        print(sorting(arrayList));
        System.out.println("\nLinkedList: _________________________________");
        print(sorting(linkedList));
    }

    public static List<Integer> sorting(Integer[] array) {
        List<Integer> forArray = Arrays.asList(array);
        Collections.sort(forArray);
        return forArray;
    }

    public static List<Integer> sorting(ArrayList<Integer> arrayList) {
        Collections.sort(arrayList);
        return arrayList;
    }

    public static List<Integer> sorting(LinkedList<Integer> linkedList) {
       Collections.sort(linkedList);
       return linkedList;
    }

    public static void print(List<Integer> list) {
        for (Integer elements: list) {
            System.out.print(elements + " ");
        }
    }
}
