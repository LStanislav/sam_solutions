package com.company;

import com.company.TASK1.DevideOn13;
import com.company.TASK2.ReturnBiggerString;
import com.company.TASK3.Discriminant;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        switch (args[0]) {
            case "1":
                task1();
                break;
            case "2":
                task2();
                break;
            case "3":
                task3();
                break;
            case "4":
                task4();
                break;
        }
    }

    public static void task1() {
        DevideOn13 a = x -> {
            return (x % 13 == 0) ? (true) : (false);
        };
        System.out.println(a.CanDevide(13));
    }

    public static void task2() {
        ReturnBiggerString a = (x, y) -> {
            return (x.length() > y.length()) ? (x) : (y);
        };
        System.out.println(a.biggerString("123", "12345"));
    }

    public static void task3() {
        Discriminant obj = (a, b, c) -> {
            return b * b - 4 * a * c;
        };
        System.out.println(obj.calculate(1,4,4));
    }
    public static void task4(){
        List<String> list1,list = Arrays.asList("a1", "a4", "a3", "a2", "a1", "a4", "b1", "b2");
        List<Integer> listInt;
        System.out.println(list.stream().anyMatch((s)->s.equals("a1")));

        System.out.println(list.stream().allMatch(s->s.contains("2")));

        System.out.println(list.stream().allMatch(s->!s.equals("a7")));

        list1 = list.stream().map((s)->s+="_1").collect(Collectors.toList());
        System.out.println(list1.toString());
        listInt  = list.stream().map((s)->Integer.parseInt(s.substring(1))).collect(Collectors.toList());
        System.out.println(listInt.toString());

        list.sort(String::compareTo);
        System.out.println(list.toString());

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.compareTo(o2)>0) return -1;
                else return 1;
               }
        });
        System.out.println(list.toString());

        list.sort(String::compareTo);
        System.out.println(list.stream().sorted(String::compareTo).distinct().collect(Collectors.toList()).toString());

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.compareTo(o2)>0) return -1;
                else return 1;
            }
        });
        System.out.println(list.stream().distinct().collect(Collectors.toList()).toString());

        String str = "";
        list.stream().peek((s)->s+="\\");
        list.add(1,"<b>");
        list.add(,"<b>");
    }
}
