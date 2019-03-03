package UtilitThree;

import java.util.Arrays;

public class University {
    public Department[] departments = new Department[0];
    public void addDepartment(String name){
        Department newD = new Department(name);
        departments = Arrays.copyOf(departments, departments.length+1);
        departments[departments.length-1]=newD;
    }
    public Department[] getDepartments(){ return departments; }
    public void showDepartments(){
        for (Department i: departments ) {
            System.out.println(i.getName());
        }
    }

    public void showGroups(){
        for (Department i: departments ) {
            for(Group j:i.getGroups()){
                System.out.println(j.getIdentificator());
            }
        }
    }
    public void showStudents(){
        for (Department i: departments ) {
            for(Group j:i.getGroups()){
                for(Student u:j.students){
                    System.out.println(u.getName() + " " + u.getSurname());
                }
            }
        }
    }
    public void showStarosts(){
        for (Department i: departments ) {
            for(Group j:i.getGroups()){
                System.out.println(j.getStarosta().getName() + " " + j.getStarosta().getSurname() + " " + j.getIdentificator());
            }
        }
    }
    public void searchStudent(String surname){
        for (Department i: departments ) {
            for(Group j:i.getGroups()){
                for(Student u:j.students){
                    if (u.getSurname()==surname)
                        System.out.println(u.getName() + " " + u.getSurname() + " " + u.getGroupID() + " " + u.getTelNumber());
                }
            }
        }
    }
}

