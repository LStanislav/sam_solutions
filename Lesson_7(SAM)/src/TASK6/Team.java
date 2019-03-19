package TASK6;

public class Team {
    public Worker[] workers = new Worker[10];
    public TeamLeader teamLeader;
    public Team() {
        for (int i=0; i<10; i++){
            workers[i]= new Worker();
        }
        teamLeader = new TeamLeader();
    }
}
