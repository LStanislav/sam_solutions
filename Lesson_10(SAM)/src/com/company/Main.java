package com.company;

import TASK1.MyFile;
import com.sun.org.apache.xerces.internal.impl.io.UTF8Reader;
import com.sun.xml.internal.stream.writers.UTF8OutputStreamWriter;

import java.io.*;
import java.util.Scanner;

import static TASK1.MyFile.*;

public class Main {

    public static void main(String[] args) {
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
        }
    }

    public static void task1() {
        //String startPath = System.getProperty("user.dir");
        String startPath = "C://SomeDir";

        System.out.println(startPath);
        File currentFile = new File(startPath);
        while (true) {
            Scanner in = new Scanner(System.in);
            String b = in.nextLine() + " ";
            String[] buf = b.split(" ", 3);
            String comand = buf[0];
            File trash;
            switch (comand) {
                case "ls":
                    trash = new File(buf[1]);
                    if ((!buf[1].equals("")) && (trash.exists()) && (trash.isDirectory())) {
                        ls(trash);
                    } else ls(currentFile);
                    break;
                case "cd":
                    trash = new File(buf[1]);
                    if ((!buf[1].equals("")) && (trash.exists()) && (trash.isDirectory())) {
                        currentFile = trash;
                        System.out.println(buf[1]);
                    } else System.out.println("Incorrect path!");
                    break;
                case "rm":
                    trash = new File(buf[1]);
                    System.out.println(buf[1]);
                    //System.out.println(trash.delete()?("success"):("not success") + trash.exists() + trash.isFile());
                    if ((!buf[1].equals("")) && (trash.exists()) && (trash.isFile())) {
                        System.out.println(trash.delete() ? ("success") : ("not success"));
                    } else System.out.println("Incorrect path!");
                    break;
                case "rmdir":
                    trash = new File(buf[1]);
                    if ((!buf[1].equals("")) && (trash.exists()) && (trash.isDirectory())) {
                        System.out.println(trash.delete() ? ("success") : ("not success"));
                    } else System.out.println("Incorrect path!");
                    break;
                case "cat":
                    try {
                        /*FileReader fileReader = new FileReader(buf[1]);
                        int x=0;
                        x=fileReader.read();
                        while (x!=-1) {
                            System.out.print((char) x);
                            x = fileReader.read();
                        }*/
                        FileInputStream fileInputStream = new FileInputStream(buf[1]);
                        byte[] buff = new byte[1000];
                        fileInputStream.read(buff);
                        String str = new String(buff, "utf8");
                        System.out.println(str);
                        String str2 = new String(buff, "cp1251");
                        System.out.println(str2);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case "find":
                    find(currentFile, buf[1].trim());
                    break;
                case "touch":
                    try (FileWriter fileWriter = new FileWriter(currentFile.getAbsoluteFile() + "\\" + buf[1])) {
                        System.out.println(buf[2]);
                        fileWriter.write(buf[2]);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    break;
                case "cp":
                    cp(currentFile, buf[1].trim());
                    break;
                case "exit":
                    return;
            }
        }
    }

    public static void task2() {

    }

    public static void task3() {

    }
}
