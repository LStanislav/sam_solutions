package TASK5;

public interface LogingSupport {
    default void log(String msg, Object obj){
        System.out.println("Class: " + obj.getClass().getName());
        System.out.println("Message: " + msg);
        System.out.println();
    }
    void log();
}
