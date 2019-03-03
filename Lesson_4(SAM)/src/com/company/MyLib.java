package com.company;

public class MyLib {
    public static boolean isPalindrom(String x){
        boolean res = true;
        for(int i=0; i<x.length()/2; i++){
            if (x.charAt(i)!=x.charAt(x.length()-i-1)) {
                res=false;
                break;
            }
        }
        return res;
    }
    public static boolean isDigit(char x){
        if ((x>='0') && (x<='9')) return true;
        else return false;
    }
    public static boolean compare(String x, String y){
        int sumx=0, sumy=0;
        for (int i=0; i<x.length(); i++){
            sumx+=(int)x.charAt(i)-48;
        }
        for (int i=0; i<y.length(); i++){
            sumy+=(int)y.charAt(i)-48;
        }
        return sumx>sumy;
    }
}

