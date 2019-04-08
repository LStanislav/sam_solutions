package TASK1;

import java.io.*;

public class MyFile {
    private MyFile() {
    }

    public static void cd() {
    }

    public static void ls(File dir) {
        String str[] = dir.list();
        for (String i : str) {
            System.out.println(i);
        }
    }

    public static void cp(File dir, String task) {
        File trash = new File(task);
        File newFile = new File(dir, trash.getName());
        try (FileOutputStream fileOutputStream = new FileOutputStream(newFile.getAbsoluteFile());
             FileInputStream fileInputStream = new FileInputStream(trash.getAbsoluteFile());
        ) {
            newFile.createNewFile();
            int x;
            x = fileInputStream.read();
            while (x!=-1){
                fileOutputStream.write(x);
                x = fileInputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(trash.getName() + " " + trash.exists() + " " + newFile.exists() + " " + newFile.getAbsolutePath());
    }

    public static void find(File dir, String task) {
        boolean res = false;
        String str[] = dir.list();
        for (String i : str) {
            File trash = new File(dir.getAbsolutePath() + "\\" + i);
            //System.out.println(dir.getAbsolutePath()+"\\"+i + " " + trash.exists() + " " + trash.isFile());
            if (trash.isFile()) {
                System.out.print((i.contains(task)) ? (dir.getAbsolutePath() + "\\" + i + "\n") : (""));
            } else {
                if (trash.isDirectory())
                    find(trash, task);
            }
        }
    }
}
