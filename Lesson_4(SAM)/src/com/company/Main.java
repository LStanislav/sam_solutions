package com.company;

import java.util.Arrays;
import java.util.Scanner;

import static com.company.MyLib.*;

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
            case "7":
                task7();
                break;
        }
    }

    static void task1(){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String mas[] = str.split(" ", 1000);
        int KOL=0,kol=0;
        for (String i: mas) {
            if (!i.equals("")){
                KOL++;
                if (isPalindrom(i)){
                    kol++;
                }
            }
        }
        System.out.println(kol + " " + ((float)kol/(float)KOL)*100.0);
    }
    static void task2(){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String mas[] = str.split(" ", 1000);
        str="";
        for (String i:mas){
            str=str.concat(i);
        }
        System.out.println((isPalindrom(str)?("YES"):("NO")));
    }
    static void task3(){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int i=0, kol=0;
        while (i<str.length()-2){
            if ((str.charAt(i)==str.charAt(i+1)) && (str.charAt(i+1)==str.charAt(i+2))){
                kol++;
                i+=2;
            }
            i++;
        }
        System.out.println(kol);
    }
    static void task4(){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String mas[] = str.split(" ", 1000);
        int l = 0, r=mas.length-1;
        while (l<r){
            while (mas[l].equals("")) l++;
            while (mas[r].equals("")) r--;
            String buf = mas[l];
            mas[l]=mas[r];
            mas[r]=buf;
            l++; r--;
        }
        int end=mas.length-1;
        while (mas[end].equals("")) end--;
        System.out.print("!");
        for (int i=0; i<mas.length; i++) {
            String x=mas[i];
            if (!x.equals("")){
               if (i!=end) System.out.print(x+" ");
               else System.out.print(x);
            } else System.out.print(" ");
        }
        System.out.print("!");
    }
    static void task5(){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String mas[] = str.split(" ", 1000);
        //Arrays.sort(mas,compare());
        int smas[] = new int [mas.length];
        int k=0;
        for(int i=0; i<mas.length; i++){
            if (!mas[i].equals("")) {
                smas[k] = Integer.parseInt(mas[i]);
                k++;
            }
        }
        Arrays.sort(smas);
        System.out.println(Arrays.toString(smas));
        int i=0;
        k=mas.length-k;
        while ((i<str.length()) && (i<str.length())){
            while (str.charAt(i)==' ') {
                System.out.print(' ');
                i++;
            }
            if (i<str.length()){
                System.out.print(smas[k]);
                k++;
            }
            while ((i<str.length()) && (str.charAt(i)!=' ')) i++;
        }
    }
    static void task6(){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        str=str.concat("!");
        String buf="";
        int sum=0;
        int i=0;
        while (i<str.length()){
            if (isDigit(str.charAt(i))){
               buf=buf+str.charAt(i);
            }
            else {
                if (!buf.equals("")){
                    sum+=Integer.parseInt(buf);
                    System.out.println(buf);
                    buf="";
                }
            }
            i++;
        }
        System.out.println("Sum = " + sum);
    }
    static void task7(){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        boolean flag1=false;// small alpha
        boolean flag2=false;// big alpha
        boolean flag3=false;// digits
        boolean flag4=(str.length()>=8?(true):(false));// length

        for (int i=0; i<str.length(); i++){
            if ((str.charAt(i)>='a')&&(str.charAt(i)<='z')){ flag1 = true;}
            if ((str.charAt(i)>='A')&&(str.charAt(i)<='Z')){ flag2 = true;}
            if ((str.charAt(i)>='0')&&(str.charAt(i)<='9')){ flag3 = true;}
        }
        if (flag1 && flag2 && flag3 && flag4) {
            System.out.println("Good password");
        } else {
            System.out.println("Bed password");
            if (!flag1) System.out.println("low alpha missing");
            if (!flag2) System.out.println("up alpha missing");
            if (!flag3) System.out.println("digit missing");
            if (!flag4) System.out.println("short password");
        }
    }
}
