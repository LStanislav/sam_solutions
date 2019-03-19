package TASK4;

public enum RGB {
    black(0, 0, 0),
    white(255, 255, 255),
    red(255, 0, 0),
    green(0, 255, 0),
    blue(0, 0, 255),
    yellow(255, 255, 0),
    pink(255, 0, 255),

    purple(255, 100, 255),
    gray(11, 22, 33),
    brown(44, 55, 66),
    orange(77, 88, 99);

    private double r;
    private double g;
    private double b;

    public double getB() {
        return b;
    }

    public double getG() {
        return g;
    }

    public double getR() {
        return r;
    }

    RGB(double r, double g, double b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public String getHex() {
        String res = "";
        res += Integer.toHexString((int) r) + Integer.toHexString((int) g) + Integer.toHexString((int) b);
        return res;
    }

    public RGB nextColor(){
        RGB[] rgb = values();
        if (this.ordinal()==10)
            return rgb[0];
        return rgb[this.ordinal()+1];
    }
    public RGB previousColor(){
        RGB[] rgb = values();
        if (ordinal()==0)
            return rgb[10];
        return rgb[this.ordinal()-1];
    }

}
