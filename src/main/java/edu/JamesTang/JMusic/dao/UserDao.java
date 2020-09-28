package edu.JamesTang.JMusic.dao;

import edu.JamesTang.JMusic.entity.MyUser;

import java.util.List;

public interface UserDao {

    boolean login(String name,String passwordMD5);
    boolean register(MyUser user);
    public List<MyUser> getUserList();
    public boolean delete(String id);
    public boolean update(String name,String id);

}
