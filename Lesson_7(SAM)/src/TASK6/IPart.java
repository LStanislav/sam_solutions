package TASK6;

public interface IPart {//abstract
    default String getPartName(){
        return this.getClass().getName();
    }
}
