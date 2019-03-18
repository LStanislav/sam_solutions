package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
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
        }
    }

    public static void task1() {

        String str[] = {"123", null, "abc"};
        for (String i : str) {
            try {
                System.out.println(i.hashCode());
                if (i == null) throw new NullPointerException();
            } catch (NullPointerException e) {
                //e.printStackTrace();
                System.out.println("Error!");
            }
        }
    }

    public static void task2() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:/input.txt");
            fis.read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Scanner in = new Scanner(fis);
        while (in.hasNext()) {
            System.out.println(in.nextLine());
        }
    }

    public static void task3() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:/input.txt");
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException  e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Scanner in = new Scanner(fis);
        while (in.hasNext()) {
            System.out.println(in.nextLine());
        }
    }

    public static void task4() {
        BufferedReader br=null;
        try {
            br = new BufferedReader( new FileReader("D:/input.txt"));
            String s;
            while ((s=br.readLine())!=null){
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void task5() {
        try(BufferedReader br = new BufferedReader( new FileReader("D:/input.txt"))){
            String s;
            while ((s=br.readLine())!=null){
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void task6() {
    }
}
