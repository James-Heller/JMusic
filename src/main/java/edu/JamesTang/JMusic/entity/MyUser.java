package edu.JamesTang.JMusic.entity;

import java.security.MessageDigest;

public class MyUser {

    private static final String salt= "&%5123***&&%%$$#@";

    private String name;
    private String passwordMD5;
    private String ID;

    public MyUser(String name,String password,String ID){

        this.name=name;
        this.passwordMD5=getMD5(password);
        this.ID=ID;
    }


    public MyUser(String name,String ID){
        this.name=name;
        this.ID=ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPasswordMD5(String passwordMD5) {
        this.passwordMD5 = getMD5(passwordMD5);
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public String getPasswordMD5() {
        return passwordMD5;
    }

    public String getID() {
        return ID;
    }

    public static String getMD5(String password){
        try{
            password=password+salt;
            MessageDigest m=MessageDigest.getInstance("MD5");
            m.update(password.getBytes("UTF-8"));
            byte[] s= m.digest();
            String result="";

            for(int i=0;i<s.length;i++){
                result +=Integer.toHexString((0x000000FF & s[i]) | 0xFFFFFF00).substring(6);
            }
            return result;
        }catch (Exception e){
            e.printStackTrace();
        }

        return "";
    }


}
