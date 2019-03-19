package TASK1;

public interface TeamPlayer extends Athlete{
    void playSport();
    default void showStatistics(){
        System.out.println("showStatistics");
    }
}
