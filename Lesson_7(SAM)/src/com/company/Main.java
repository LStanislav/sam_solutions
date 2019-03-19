package com.company;

import TASK1.Athlete;
import TASK1.SwimmingAthleteImp;
import TASK2.Week;
import TASK3.MathOperator;
import TASK4.RGB;
import TASK5.Student;
import TASK5.StudentComparator;
import TASK6.House;
import TASK6.IPart;
import TASK6.Team;
import TASK6.Wall;

import java.util.Arrays;

import static TASK5.StudentComparator.COMPARATOR;

public class Main {

    public static void main(String[] args) {
        switch (args[0]){
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
            case "5":
                task5();
                break;
            case "6":
                task6();
                break;

        }
    }
    public static void task1(){
        Athlete athlete[] = new Athlete[4];
        Athlete at = new SwimmingAthleteImp();
        ((SwimmingAthleteImp) at).swim();
        athlete[0] = new SwimmingAthleteImp();
        ((SwimmingAthleteImp)athlete[0]).swim();
    }
    public static void task2(){
        Week  a = Week.FRIDAY;
        Week  b = Week.SUNDAY;

        System.out.println(a.isWeekend());
        System.out.println(a.getAbreviation());
        System.out.println(a.getText());
        System.out.println(b.isWeekend());

    }
    public static void task3(){
        MathOperator a = MathOperator.DIVIDE;
        System.out.println(a.execute(6,3));
    }
    public static void task4(){
        RGB a = RGB.green;
        System.out.println((int)a.getB()+(int)a.getG()+(int)a.getR()+"!");
        System.out.println(a.getHex());
        System.out.println(a.nextColor());
        System.out.println(a.previousColor());
    }
    public static void task5(){
        StudentComparator comp = COMPARATOR;
        Student students[] = {new Student("Alex", 12, 5.6), new Student("Jim", 13, 9.2),
                new Student("Angeline", 16, 7.8)};
        Arrays.sort(students, comp);
        for(Student i: students){
            System.out.println(i.getAverageScore());
        }

    }
    public static void task6(){
        House myCottage = new House();
        Team myTeam = new Team();
        System.out.println(myCottage.parts[0].getPartName());
        myTeam.workers[0].work(myCottage);
        myTeam.workers[0].work(myCottage);
        myTeam.workers[0].work(myCottage);
        myTeam.teamLeader.report(myCottage);
    }
}
