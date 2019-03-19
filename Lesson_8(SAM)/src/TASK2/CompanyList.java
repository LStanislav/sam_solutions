package TASK2;

import java.util.Arrays;

import static java.lang.Math.min;

public class CompanyList<T> implements Iterator<T>{
    private int length = 0;
    public CompanyList(){
        length=0;
        iterator=0;
    }
    T elements[] = (T[]) new Object[1];
    public void addNewElement(T newEl){
        elements=copyOf(elements,length+1);
        elements[length]=(T)new Object();
        elements[length]=newEl;
        length++;
    }

    public T[] copyOf(T[] mas, int newLength){
        T[] buf = (T[]) new Object[newLength];
        for (int i=0; i<min(newLength,length); i++){
            buf[i]=mas[i];
        }
        mas=buf;
        return mas;
    }

    public T[] getElements() {
        return elements;
    }

    public T getElement(int n){
        return elements[n];
    }

    public int getLength() {
        return length;
    }

    private int iterator=0;



    @Override
    public boolean hasNext() {
        return (iterator<length-1);
    }

    @Override
    public T next() {
        iterator++;
        return elements[iterator-1];
    }

    @Override
    public T remove() {
        T res = elements[length - 1];
        if (length>0) {
            elements = copyOf(elements, length - 1);
            length--;
        }
        return res;
    }
    void startIterator(){iterator=0;}
}

