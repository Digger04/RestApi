package com.example.restapi;

public class Info {
    private String Adress;
    private String phone;

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Info(String adress, String phone) {
        Adress = adress;
        this.phone = phone;
    }
}
