package model;

import java.io.Serializable;

public class Staff implements Serializable {
    private String ID;
    private String staffName;
    private String staffaddresss;
    private String phoneNumber;
    private String staffEmail;

    public Staff() {
    }

    public Staff(String ID, String staffName, String staffaddresss, String phoneNumber, String staffEmail) {
        this.ID = ID;
        this.staffName = staffName;
        this.staffaddresss = staffaddresss;
        this.phoneNumber = phoneNumber;
        this.staffEmail = staffEmail;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffaddresss() {
        return staffaddresss;
    }

    public void setStaffaddresss(String staffaddresss) {
        this.staffaddresss = staffaddresss;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStaffEmail() {
        return staffEmail;
    }

    public void setStaffEmail(String staffEmail) {
        this.staffEmail = staffEmail;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "ID='" + ID + '\'' +
                ", staffName='" + staffName + '\'' +
                ", staffaddresss='" + staffaddresss + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", staffEmail='" + staffEmail + '\'' +
                '}';
    }
}
