package com.example.restapi.callapi;

public class error {
    private int code;
    private String info;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public error(int code, String info) {
        this.code = code;
        this.info = info;
    }
}
