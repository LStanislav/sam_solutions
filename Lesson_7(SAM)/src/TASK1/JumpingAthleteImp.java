package TASK1;

public class JumpingAthleteImp implements JumpingAthlete {

    @Override
    public void highJump() {
        System.out.println("highJump");
    }

    @Override
    public void longJump() {
        System.out.println("longJump");
    }

    @Override
    public void trippleJump(){
        System.out.println("trippleJump");

    }


    @Override
    public void participate() {
        highJump();
        longJump();
        trippleJump();
    }
}
