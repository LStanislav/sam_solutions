package TASK3;

import TASK2.CompanyList;
import TASK2.CompanyList.*;

import static java.lang.Math.min;

public class Stack<T> {
    public Stack() {
        T[] elements = (T[]) new Object[0];
        length = 0;
    }

    private int length = 0;
    final int MAXSIZE = 100;

    private T[] elements = (T[]) new Object[0];

    private T[] copyOf(T[] mas, int newLength){
        T[] buf = (T[]) new Object[newLength];
        for (int i=0; i<min(newLength,length); i++){
            buf[i]=mas[i];
        }
        mas=buf;
        return mas;
    }

    public void push(T el){
        if (length>=MAXSIZE) {
            System.out.println("Stack is full");
            return;
        }
        elements=copyOf(elements,length+1);
        elements[length]=(T)new Object();
        elements[length]=el;
        length++;
    }
    public T pop() {
        T res =(T) new Object();
        if (length>0) {
            res = elements[length - 1];
            elements = copyOf(elements, length - 1);
            length--;
        }
        return res;
    }
    public T peek() {
        T res =(T) new Object();
        if (length>0) {
            res = elements[length - 1];
        }
        return res;
    }
    public boolean empty(){
        return length==0;
    }
    public boolean full(){
        return length==MAXSIZE;
    }
    public void clear(){
        elements=copyOf(elements,0);
    }

    public T[] getElements() {
        return elements;
    }
    public void printStack(){
        for (T i: elements) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
