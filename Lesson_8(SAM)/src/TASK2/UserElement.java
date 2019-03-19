package TASK2;

import java.util.Date;

public class UserElement {
    private String fio;
    private String department;
    private String phone;
    Date dateTime;

    public UserElement(String fio) {
        this.fio = fio;
        dateTime = new Date();
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
