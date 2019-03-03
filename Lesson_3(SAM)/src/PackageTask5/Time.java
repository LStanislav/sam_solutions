package PackageTask5;

public class Time {
    public Time(int sec){
        hours = sec / 3600;
        sec%=3600;
        minutes = sec / 60;
        seconds= sec % 60;
    }
    public Time (int h, int m, int s){
        hours=h;
        minutes=m;
        seconds=s;
    }

    private int seconds;
    private int minutes;
    private int hours;

    public int getHours() { return hours; }
    public int getMinutes() { return minutes; }
    public int getSeconds() { return seconds; }

    public void setHours(int hours) { this.hours = hours; }
    public void setMinutes(int minutes) { this.minutes = minutes; }
    public void setSeconds(int seconds) { this.seconds = seconds; }

    public int getAllSeconds(){return hours*3600+minutes*60+seconds;}

    public void showShortTime(){
        System.out.printf("%4d:%2d:%2d\n",hours,minutes,seconds);
    }
    public void showFullTime(){
        System.out.println("Hours = " + hours + " Minutes = " + minutes + " Seconds = " + seconds);
    }
}
