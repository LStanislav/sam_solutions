package TASK6;

public class House {
    public Part parts[] = new Part[11];
    public House() {
        parts[0] = new Basement();
        parts[1] = new Wall();
        parts[2] = new Wall();
        parts[3] = new Wall();
        parts[4] = new Wall();
        parts[5] = new Door();
        parts[6] = new Window();
        parts[7] = new Window();
        parts[8] = new Window();
        parts[9] = new Window();
        parts[10] = new Roof();
    }
}
