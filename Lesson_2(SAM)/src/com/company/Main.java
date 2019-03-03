package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       for (String arg: args){
           System.out.println(arg);
       }
       if (args.length>0) {
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
               case "5":
                   task5();
                   break;
               case "6":
                   task6();
                   break;
               case "7":
                   task7();
                   break;
               case "8":
                   task8();
                   break;
               case "9":
                   task9();
                   break;
               case "10":
                   task10();
                   break;
           }
       }
    }

    public static void task1(){
        int i=0,x=13;
        int mas[] = new int[100];
        while (i<100){
            if ((x % 13==0) || (x % 17==0)){
                mas[i]=x;
                i++;
            }
            x++;
        }
        System.out.println(Arrays.toString(mas));
    }

    public static void task2(){
        System.out.println("Count: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int mas[] = new int[n];
        int index_min = 0, index_max = 0, max, min;
        int sum = 0;
        final int INF= 10000;
        min = INF;
        max = -INF;

        for(int i=0; i<n; i++){
            mas[i]=(int)(Math.random()*100);
            if (mas[i]>max){
                index_max=i;
                max=mas[i];
            }
            if (mas[i]<min){
                index_min=i;
                min=mas[i];
            }
        }
        for (int i=Math.min(index_min,index_max); i<=Math.max(index_min,index_max); i++){
            sum+=mas[i];
        }
        System.out.println(Arrays.toString(mas));
        System.out.println("Sum: " + sum);
    }

    public static void task3(){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int i=2;
        boolean flag = false;
        while (i<=Math.sqrt(x)){
            if (x % i ==0) {
                flag = true;
                break;
            }
            i++;
        }
        if (flag){
            System.out.println("NOOOO: " + i);
        } else{
            System.out.println("Yeees");
        }
    }

    public static void task4(){
        Scanner in = new Scanner(System.in);
        int n, m, x, delta;
        System.out.println("X: ");
        x = in.nextInt();
        System.out.println("delta: ");
        delta = in.nextInt();
        System.out.println("n: ");
        n = in.nextInt();
        System.out.println("m: ");
        m = in.nextInt();

        int mas[][] = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                mas[i][j] = in.nextInt();
            }
        System.out.println("part 1:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                if (mas[i][j]==x){
                    System.out.println("i=" + (i+1) + " j=" + (j+1));
                    break;
                }
            }
        for (int i=0; i<n; i++)
            for (int j=0; j<m; j++){

            }
        System.out.println("part 2:");
        loop1: for (int i=0; i<n; i++){
                loop2: for (int j=0; j<m; j++){
                    if (mas[i][j]==x){
                        System.out.println("i=" + (i+1) + " j=" + (j+1) + "\nilteration=" + (i*m+j+1));
                        break loop1;
                    }
                }
        }
        System.out.println("part 3:");
        int kol=0;
        for (int i=0; i<n; i++)
            for (int j=0; j<m; j++){
                if ((mas[i][j]>=x-delta) && (mas[i][j]<=x+delta)) continue;
                kol++;
            }
        System.out.println("kol=" + kol);
    }

    public static void task5(){
        int mas[] = new int [3];
        for (int i=0; i<3; i++){
            mas[i]=(int)(Math.random()*89)+10;
        }
        System.out.println(Arrays.toString(mas));
        int buf[] = Arrays.copyOf(mas, mas.length);
        //System.out.println(Arrays.toString(buf));
        Arrays.sort(buf);
        System.out.println(Arrays.toString(buf));
        if (Arrays.equals(mas,buf)) {
            System.out.println("sorting");
        }else
        {
            System.out.println("unsorting");
        }

    }

    public static void task6(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int mas[][] = new int[n+10][n+10];
        for (int i=0; i<n; i++){
            int d = Math.abs(i-n/2);
            for(int j=n/2-d; j<n/2+d+(n%2); j++){
                mas[i][j]=1;
            }
        }
        for (int i=0; i<n; i++){
            int d = Math.abs(i-n/2);
            for(int j=0; j<n; j++){
                System.out.print(mas[i][j]);
            }
            System.out.println();
        }
        //System.out.println(Arrays.toString(mas));
    }

    public static void task7(){
        int mas[] = new int [4];
        int i=0;
        while (i<4){
            mas[i]=(int)(Math.random()*89)+10;
            i++;
        }
        System.out.println(Arrays.toString(mas));
        int buf[] = Arrays.copyOf(mas, mas.length);
        //System.out.println(Arrays.toString(buf));
        Arrays.sort(buf);
        System.out.println(Arrays.toString(buf));
        if (Arrays.equals(mas,buf)) {
            System.out.println("sorting");
        }else
        {
            System.out.println("unsorting");
        }
    }

    public static void task8(){
        int mas[] = new int [3];
        int i=0;
        do {
            mas[i]=(int)(Math.random()*89)+10;
            i++;
        } while(i<3);
        System.out.println(Arrays.toString(mas));
        int buf[] = Arrays.copyOf(mas, mas.length);
        //System.out.println(Arrays.toString(buf));
        Arrays.sort(buf);
        System.out.println(Arrays.toString(buf));
        if (Arrays.equals(mas,buf)) {
            System.out.println("sorting");
        }else
        {
            System.out.println("unsorting");
        }
    }

    public static void task9(){
        String mast[] = {"Hearts", "Spades", "Clubs", "Diamonds"};
        String value[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        for (int i=0; i<10; i++) {
            int ind1 = (int) (Math.random() * 13);
            int ind2 = (int) (Math.random() * 4);
            System.out.println(ind1 + " " + ind2);
            System.out.println(value[ind1] + " " + mast[ind2]);
        }
    }

    public static void task10(){
        String mast[] = {"Hearts", "Spades", "Clubs", "Diamonds"};
        String value[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String cards[] = new String[52];
        int k=0;
        for (int i=0; i<4; i++)
            for (int j=0; j<13; j++){
                cards[i*13+j]=value[j] + " " + mast[i];
            }
        System.out.println("Введите количество перетусовок: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i=0; i<n; i++){
            //System.out.println(cards[i]);
            int l = (int)(Math.random()*52);
            int r = (int)(Math.random()*52);
            String buf = cards[l];
            cards[l]=cards[r];
            cards[r]=buf;
            //System.out.println(l+" "+r);
        }
        for (int i=0; i<52; i++){
            System.out.println(cards[i]);
        }
    }
}