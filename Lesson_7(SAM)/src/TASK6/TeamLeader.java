package TASK6;

public class TeamLeader implements IWorker {
    TeamLeader(){

    }
    public void report(House x){
        for (Part i: x.parts){
            System.out.println(i.getPartName()+" : " + i.getExecutedHours() + "/" + i.getMaxHours());
        }
    }
}
