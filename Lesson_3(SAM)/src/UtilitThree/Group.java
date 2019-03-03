package UtilitThree;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Group {
    Group(String iden){
        this.identificator = iden;
        starosta=0;
    }
    private String identificator;
    private int starosta;
    public Student students[] = new Student[0];
    public String getIdentificator(){return identificator;}
    public Student getStarosta(){return students[starosta];}
    Student[] getStudents(){return students;}
    public void setIdentificator(String iden){identificator=iden;}
    public void setStudents(Student mas[]){
        students = Arrays.copyOf(mas, mas.length);
    }
    public void pushStudent(String name, String surname, String telNumber){
        Student newSt = new Student(name,surname,telNumber);
        students = Arrays.copyOf(students, students.length+1);
        students[students.length-1] = newSt;
        newSt.setGroup(this.identificator);
    }
    public void setStarosta(int x){
        if ((x>=0) && (x<students.length)) starosta = x;
    }
}
