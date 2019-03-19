package com.company;

import TASK1.Pair;
import TASK2.CompanyList;
import TASK2.EquipmentElement;
import TASK2.UserElement;

import java.lang.annotation.ElementType;
import java.util.Arrays;
import TASK3.Stack;
import TASK4.GenericQuickSort;
import TASK4.MyClass;

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
        // write your code here
    }

    public static void task1() {
        Pair<Integer, Character> keys[] = new Pair[10];
        for (int i = 0; i < 10; i++) {
            //System.out.println(i+" "+((char)(i+96)));
            keys[i] = new Pair<>(i, (char) (i + 97));
            System.out.println(keys[i].first + " " + keys[i].second);
        }
        System.out.println(encrypt(1111, keys));
        System.out.println(decoding("bcde",keys));
    }

    public static StringBuilder encrypt(int cod, Pair<Integer, Character> keys[]) {
        StringBuilder res = new StringBuilder();
        int m;
        while (cod > 0) {
            m = cod % 10;
            cod /= 10;
            for (Pair<Integer, Character> i : keys) {
                if (i.first == m) {
                    res.append(i.second);
                    break;
                }
            }
        }
        return res.reverse();
    }
    public static int decoding(String str, Pair<Integer, Character> keys[]){
        int res = 0;
        for (int i=0; i<str.length(); i++){
            for (Pair<Integer, Character> j : keys){
                if (j.second==str.charAt(i)){
                    res=res*10+j.first;
                    break;
                }
            }
        }
        return res;
    }

    public static void task2(){
        CompanyList<UserElement> userList = new CompanyList<>();
        UserElement a = new UserElement("FIO1");
        userList.addNewElement(a);

        a = new UserElement("FIO3");
        userList.addNewElement(a);

        a = new UserElement("FIO2");
        userList.addNewElement(a);

        for (int i=0; i<userList.getLength(); i++){
            System.out.println(userList.getElement(i).getFio());
        }

        CompanyList<EquipmentElement> equipmentList = new CompanyList<>();
        EquipmentElement b = new EquipmentElement("1");
        equipmentList.addNewElement(b);
        b = new EquipmentElement("3");
        equipmentList.addNewElement(b);
        b = new EquipmentElement("4");
        equipmentList.addNewElement(b);
        System.out.println(equipmentList.remove().getName());
        for (int i=0; i<equipmentList.getLength(); i++){
            System.out.println(equipmentList.getElement(i).getName());
        }
        System.out.println(equipmentList.hasNext());
        System.out.println(equipmentList.next().getName());

    }
    public static void task3() {
        Stack<String> myStack = new Stack<>();
        System.out.println(myStack.empty());
        System.out.println(myStack.full());
        myStack.push("a");
        myStack.push("b");
        myStack.push("ddd");
        myStack.printStack();
        System.out.println(myStack.empty());
        myStack.pop();
        myStack.printStack();
        System.out.println(myStack.pop());
        myStack.printStack();
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.empty());
    }
    public static void task4(){
        MyClass mas[] = new MyClass[10];

        for (int i=0; i<mas.length; i++) {
            mas[i] = new MyClass();
            System.out.print(mas[i].values + " ");
        }
        System.out.println();
        GenericQuickSort<MyClass> a = new GenericQuickSort<MyClass>();
        //Arrays.sort(mas, new MyClass());
        a.qsort(mas,0,mas.length-1);
        for (int i=0; i<mas.length; i++) {
            System.out.print(mas[i].values + " ");
        }
    }
}
