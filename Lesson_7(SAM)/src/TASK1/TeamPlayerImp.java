package TASK1;

public class TeamPlayerImp implements TeamPlayer {
    @Override
    public void playSport() {
        System.out.println("playSport");
    }


    @Override
    public void participate() {
        playSport();
        showStatistics();
    }
}
