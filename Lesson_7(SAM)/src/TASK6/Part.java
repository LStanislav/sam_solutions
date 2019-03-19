package TASK6;

public class Part implements IPart {
    private int executedHours;
    protected int maxHours;

    public void setMaxHours(int maxHours) {
        this.maxHours = maxHours;
    }

    public int getExecutedHours() {
        return executedHours;
    }

    public int getMaxHours() {
        return maxHours;
    }

    public void addExecutedHours(int hours) {
        this.executedHours += hours;
    }
}
