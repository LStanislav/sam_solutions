package UtilitThree;

import java.util.Arrays;
import java.util.Collections;

public class Department {
    Department(){}
    public Department(String name){ this.name=name; }
    private String name;
    public Group[] groups = new Group[0];
    public String getName(){return name;}
    public Group[] getGroups(){return groups;}
    public void setName(String name){ this.name = name; }
    public void pushGroup(String ident){
        Group newGr = new Group(ident);
        groups = Arrays.copyOf(groups, groups.length+1);
        groups[groups.length-1]=newGr;
    }
}
