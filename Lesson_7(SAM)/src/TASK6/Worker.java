package TASK6;

public class Worker implements IWorker{
    private int executeHours;
    public Worker(){
        executeHours=0;
    }
    public void work(House x){
        for(Part i:x.parts){
            if (i.getMaxHours()>i.getExecutedHours()){
                executeHours++;
                i.addExecutedHours(1);
                break;
            }
        }
    }
}
