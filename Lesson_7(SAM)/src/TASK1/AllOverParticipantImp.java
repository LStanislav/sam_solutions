package TASK1;

public class AllOverParticipantImp implements SwimmingAthlete,TeamPlayer, JumpingAthlete{
    @Override
    public void participate() {
        highJump();
        longJump();
        trippleJump();
        swim();
        playSport();
    }

    @Override
    public void highJump() {
        System.out.println("highJump");
    }

    @Override
    public void longJump() {
        System.out.println("longJump");
    }

    @Override
    public void trippleJump() {
        System.out.println("trippleJump");
    }

    @Override
    public void swim() {
        System.out.println("swim");
    }

    @Override
    public void playSport() {
        System.out.println("playSport");
    }
}
