package UtilitThree;

public class Student{
    Student(String name, String surname,  String telNumber){
        this.name=name;
        this.surname=surname;
        this.telNumber = telNumber;
    }
    private String name;
    private String surname;
    private String telNumber;
    private String groupID;
    public String getName(){ return name;}
    public String getSurname(){ return surname;}
    public String getTelNumber(){ return telNumber;}
    public String getGroupID(){return groupID;}

    public void setGroup(String gr){groupID = gr;}
    public void setName(String name){this.name=name;}
    public void setSurname(String surname){this.surname=surname;}
    public void setTelNumber(String telNumber){this.telNumber=telNumber;}
}
