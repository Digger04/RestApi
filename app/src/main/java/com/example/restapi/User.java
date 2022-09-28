package com.example.restapi;

import java.util.List;

public class User {
    private String Name;
    private int Id;
    private Info Info;
    private List<Job> jobList;

    public User(String name, int id, com.example.restapi.Info info, List<Job> jobList) {
        Name = name;
        Id = id;
        Info = info;
        this.jobList = jobList;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public com.example.restapi.Info getInfo() {
        return Info;
    }

    public void setInfo(com.example.restapi.Info info) {
        Info = info;
    }

    public List<Job> getJobList() {
        return jobList;
    }

    public void setJobList(List<Job> jobList) {
        this.jobList = jobList;
    }
}
