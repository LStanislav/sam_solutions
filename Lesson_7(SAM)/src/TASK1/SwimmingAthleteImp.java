package TASK1;

public class SwimmingAthleteImp implements SwimmingAthlete {
    @Override
    public void swim() {
        System.out.println("swim");
    }


    @Override
    public void participate() {
        swim();
    }
}
