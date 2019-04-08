package com.company;

import java.util.Comparator;

public class MyClass implements Comparator<MyClass> {
    int value1;
    int value2;

    public MyClass(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    @Override
    public int compare(MyClass o1, MyClass o2) {
        return o2.value1-o1.value1;
    }
}
