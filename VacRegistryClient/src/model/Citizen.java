package model;

import java.io.Serializable;

public class Citizen implements Serializable {

    private String citizenid;
    private String fullName;
    private String phoneNumber;

    public Citizen(String citizenid, String fullName, String phoneNumber) {
        this.citizenid = citizenid;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
    }

    public Citizen() {
    }

    public String getCitizenid() {
        return citizenid;
    }

    public void setCitizenid(String citizenid) {
        this.citizenid = citizenid;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
