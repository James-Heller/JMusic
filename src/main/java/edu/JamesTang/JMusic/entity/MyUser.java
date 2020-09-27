package edu.JamesTang.JMusic.entity;

import java.util.UUID;

public class MyUser {

    private String name;
    private String password;
    private UUID uid;


    public MyUser(String name,String password){
        this.name=name;
        this.password=password;
        this.uid=UUID.fromString(password);
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public UUID getUid() {
        return uid;
    }



}
