package UtilitOne;

public class Belarus{

    private Belarus(){}
    final public static String foundingDate = "1991";
    final public static String capital = "Minsk";
    final public static String money = "BYR";

    static class Lenguage{
        final public static String lenguage1 = "RUS";
        final public static String lenguage2 = "BY";
    }

    static class Districts{
        final public static String district1 = "Brest";
        final public static String district2 = "Grodno";
        final public static String district3 = "Homel";
        final public static String district4 = "Mohilev";
        final public static String district5 = "Vitebsk";
        final public static String district6 = "Minsk";
    }

    static class Neighbors{
        final public static String neighbor1 = "Poland";
        final public static String neighbor2 = "Lithuania";
        final public static String neighbor3 = "Litva";
        final public static String neighbor4 = "Russia";
        final public static String neighbor5 = "Ukrane";
    }

    public static String shortInfo(){
        return
        "Founding date: " + foundingDate +"\n" +
        "Capital: " + capital +"\n" +
        "Lenguages: " + "\n\t" + Lenguage.lenguage1 + "\n\t" + Lenguage.lenguage2 +"\n" +
        "Money: " + money;
    }
    public static String fullInfo(){
        String result = "";
        result+="Founding date: " + foundingDate+"\n";
        result+="Capital: " + capital +"\n";
        result+="Lenguages: " + "\n\t" + Lenguage.lenguage1 + "\n\t" + Lenguage.lenguage2 +"\n";
        result+="Money: " + money +"\n";

        result+="Districts:" +"\n";
        result+="\t"+Districts.district1 +"\n";
        result+="\t"+Districts.district2 +"\n";
        result+="\t"+Districts.district3 +"\n";
        result+="\t"+Districts.district4 +"\n";
        result+="\t"+Districts.district5 +"\n";
        result+="\t"+Districts.district6 +"\n";

        result+="Neighbors:" +"\n";
        result+="\t"+Neighbors.neighbor1 +"\n";
        result+="\t"+Neighbors.neighbor2 +"\n";
        result+="\t"+Neighbors.neighbor3 +"\n";
        result+="\t"+Neighbors.neighbor4 +"\n";
        result+="\t"+Neighbors.neighbor5;
        return result;
    }
}

