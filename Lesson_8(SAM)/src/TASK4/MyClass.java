package TASK4;

import java.util.Comparator;

public class MyClass implements Comparable<MyClass>,Comparator<MyClass>{
    public int values=0;
    public MyClass(){
        values = (int)(Math.random()*100-50);
    }

    @Override
    public int compareTo(MyClass o) {
        return values-o.values;
    }

    @Override
    public int compare(MyClass o1, MyClass o2) {
        return o2.values-o1.values;
    }
}
