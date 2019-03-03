package PackageTask6;

public class Bank {
    public Bank(int b2, int b5, int b10){
        b20=b2;
        b50=b5;
        b100=b10;
    }
    private int b20, b50, b100;
    public void depositMoney(int b2, int b5, int b10){
        b20+=b2;
        b50+=b5;
        b100+=b10;
    }
    public boolean withdrawMoney(int money){
        int max20 = money / 20;
        int max50 = money / 50;
        int max100 = money / 100;
        for (int i=0; i<=max20; i++){
            for (int j=0; j<=max50; j++){
                for (int u=0; u<=max100; u++){
                    if (i*20+j*50+u*100==money){
                        System.out.println("\tkol20 = " + i + "\n\tkol50 = " + j + "\n\tkol100 = " + u);
                        b20-=i;
                        b50-=j;
                        b100-=u;
                        return true;
                    }
                }
            }
        }
        System.out.println("Bank have not enough money!");
        return false;
    }
    public void showBankMoney(){
        System.out.println("kol20 = " + b20 + "\nkol50 = " + b50 + "\nkol100 = " + b100);
    }
}
