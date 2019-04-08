package com.company;

import javafx.print.Collation;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        switch (args[0]) {
            case "1":
                task1();
                break;
            case "3":
                task3();
                break;
            case "4":
                task4();
                break;
            case "5":
                task5();
                break;
            case "6":
                task6();
                break;
            case "7":
                task7();
                break;
        }
    }

    public static void task1() {
        ArrayList<Integer> list = new ArrayList<>(), buf = new ArrayList<>(), uniq = new ArrayList<>();
        Random random = new Random();
        int n = (int) (Math.random() * 30);
        System.out.println("A");
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt() % 10);
        }
        System.out.println(list);
        System.out.println("B");
        buf.addAll(list);
        for (Integer i : list) {
            int count = 0;
            while (buf.contains(i)) {
                count++;
                buf.remove(i);
            }
            if (count == 1) {
                uniq.add(i);
            }
        }
        System.out.println(uniq);
    }

    public static void task3() {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(i);
        }

        System.out.println(set);
        for (int i = 5; i < 15; i++) {
            set.add(i);
        }
        System.out.println(set);
    }

    public static void task4() {
        MyInteger a = new MyInteger(3);
        MyInteger b = new MyInteger(3);
        MyInteger c = new MyInteger(3);
        HashSet<MyInteger> set = new HashSet<>();
        set.add(a);
        set.add(b);
        set.add(c);
        for (MyInteger i : set) {
            System.out.print(i.value + " ");
        }
    }

    public static void task5() {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int n = (int) (Math.random() * 10);
        System.out.println(n);
        final int MAX_VALUE = 100;
        for (int i = 0; i < n; i++) {
            int m = (int) (Math.random() * 10);
            System.out.print(m + " !");
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                list.add((int) (Math.random() * MAX_VALUE));
            }
            map.put(i, list);
        }
        System.out.println();
        for (Integer i : map.keySet()) {
            ArrayList<Integer> list = new ArrayList<>();
            list = map.get(i);
            for (Integer j : list) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void task6() {
        ArrayList<Integer> list = new ArrayList<>();
        int n = (int) (Math.random() * 50);
        for (int i = 0; i < n; i++) {
            list.add((int) (Math.random() * 10) + 2);
        }
        list.set((int) (Math.random() * (n / 2)), 1);
        list.set((int) (Math.random() * (n / 2)) + n / 2, 1);
        System.out.println(list);
    }

    public static void task7() {
        ArrayList<MyClass> list = new ArrayList<>();
        int n = (int) (Math.random() * 10);
        for (int i = 0; i < n; i++) {
            MyClass x = new MyClass((int) (Math.random() * 50), (int) (Math.random() * 50));
            list.add(x);
        }
        System.out.println(n);

        for (MyClass i : list) {
            System.out.print(i.value1 + " " + i.value2 + ", ");
        }
        System.out.println();
        list.sort(new MyClass(1, 2));
        Iterator<MyClass> it = list.iterator();
        showArrayList(it);


    }

    public static void showArrayList(Iterator<MyClass> it) {
        if (it.hasNext()) {
            MyClass x = it.next();
            System.out.print(x.value1 + " " + x.value2 + ", ");
            showArrayList(it);
        }
    }
}
