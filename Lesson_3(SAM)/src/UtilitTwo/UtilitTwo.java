package UtilitTwo;

public class UtilitTwo {
    private UtilitTwo(){}
    public static void formatMoney(int x){
        if (x<0) {
            System.out.println("не верный ввод!");
            return;
        }
        System.out.print(x + " ");
        if ((x % 100>=10) && (x%100<=19)){
            System.out.println("рублей");
            return;
        }
        if (x % 10 ==1)
        {
            System.out.println("рубль");
            return;
        }
        if ((x % 10 >=2) && (x % 10<=4))
        {
            System.out.println("рубля");
            return;
        }
        System.out.println("рублей");
    }
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if ((year % 400==0) || (year % 100!=0)) return true;
            else return false;
        }
        else return false;
    }
    public static int[] linearizeArray(int mas[][]){
        int res[] = new int [mas.length*mas[0].length];
        int k=0;
        for(int i=0; i<mas.length; i++)
            for (int j=0; j<mas[i].length; j++){
                res[k]=mas[i][j];
                k++;
            }
        return res;
    }
}
