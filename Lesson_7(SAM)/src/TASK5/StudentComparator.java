package TASK5;

import java.util.Comparator;

public enum StudentComparator implements LogingSupport, Comparator<Student> {
    COMPARATOR;

    @Override
    public void log() {
        System.out.println("simple log");
    }

    @Override
    public int compare(Student o1, Student o2) {
        return (int)(o1.getAverageScore()-o2.getAverageScore());
    }
}
