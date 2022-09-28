package com.example.restapi;

public class Job {
    private int Id;
    private String NameJob;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNameJob() {
        return NameJob;
    }

    public void setNameJob(String nameJob) {
        NameJob = nameJob;
    }

    public Job(int id, String nameJob) {
        Id = id;
        NameJob = nameJob;
    }
}
