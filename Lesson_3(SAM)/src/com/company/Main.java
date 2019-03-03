package com.company;


import PackageTask4.Library;
import PackageTask5.Time;
import PackageTask6.Bank;
import UtilitOne.Belarus;
import UtilitThree.University;
import UtilitTwo.UtilitTwo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        //Belarus a = new Belarus();
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

    static void task1(){
        System.out.println(Belarus.shortInfo());
        System.out.println(Belarus.fullInfo());
    }
    static void task2(){
        Scanner in = new Scanner(System.in);
        System.out.println("количество рублей: ");
        int x = in.nextInt();
        UtilitTwo.formatMoney(x);
        System.out.println("год: ");
        x = in.nextInt();
        System.out.println(UtilitTwo.isLeapYear(x)?("Yes"):("No"));
        int inMas[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int outMas[] = UtilitTwo.linearizeArray(inMas);
        System.out.println(Arrays.toString(outMas));
    }
    static void task3(){
        University BSUIR = new University();
        BSUIR.addDepartment("IEF");
        BSUIR.departments[0].pushGroup("772303");
        BSUIR.departments[0].groups[0].pushStudent("Dushka", "Chelikov", "+22334425");
        BSUIR.departments[0].groups[0].pushStudent("Zlyka", "Chelikov", "+2233442523");
        BSUIR.addDepartment("CSiS");
        BSUIR.departments[1].pushGroup("123456");
        BSUIR.departments[1].groups[0].pushStudent("Olen","Kabzonov","+111111111");
        BSUIR.departments[1].groups[0].pushStudent("Oligofren","Senichkin","+222222222");
        BSUIR.departments[1].groups[0].pushStudent("Kek", "Chelikov", "+22334425");

        BSUIR.departments[1].groups[0].setStarosta(1);
        BSUIR.showDepartments();
        BSUIR.showGroups();
        BSUIR.showStudents();
        BSUIR.showStarosts();
        BSUIR.searchStudent("Chelikov");
    }
    static void task4(){
        Library nationalLibrary = new Library();
        nationalLibrary.pushBook("12","fd", 1999);
        nationalLibrary.pushBook("23","fd", 1999);
        nationalLibrary.pushBook("34","ff", 2000);
        nationalLibrary.pushBook("45","ff", 2001);
        nationalLibrary.searchBook(2000, 2001);
        nationalLibrary.showAuthors();
        nationalLibrary.showBooks();
    }
    static void task5(){
        Time time = new Time(120433);
        time.showShortTime();
        time.showFullTime();
        System.out.println(time.getAllSeconds());
        System.out.println(time.getMinutes());
    }
    static void task6(){
        Bank belarus = new Bank(10,10,10);
        belarus.depositMoney(10,10,10);
        belarus.showBankMoney();
        belarus.withdrawMoney(1000);
        belarus.showBankMoney();
        belarus.withdrawMoney(520);
        belarus.showBankMoney();
        belarus.withdrawMoney(524);
        belarus.showBankMoney();
    }
}
