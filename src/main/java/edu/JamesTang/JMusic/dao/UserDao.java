package edu.JamesTang.JMusic.dao;

import edu.JamesTang.JMusic.entity.MyUser;

import java.util.List;

public interface UserDao {

    boolean login(String name,String passwordMD5);
    boolean register(MyUser user);
    List<MyUser> getUserList();
    boolean delete(String id);
    boolean update(String name, String id);

}
