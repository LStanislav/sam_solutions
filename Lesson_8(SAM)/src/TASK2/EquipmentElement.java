package TASK2;

import java.time.LocalTime;
import java.util.Date;

public class EquipmentElement {
    private String name;
    private String inv_number;
    Date dateTime;

    public EquipmentElement(String name) {
        this.name=name;
        dateTime = new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInv_number() {
        return inv_number;
    }

    public void setInv_number(String inv_number) {
        this.inv_number = inv_number;
    }
}
