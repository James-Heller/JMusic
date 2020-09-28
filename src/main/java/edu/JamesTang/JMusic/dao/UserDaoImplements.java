package edu.JamesTang.JMusic.dao;

import edu.JamesTang.JMusic.entity.MyUser;
import edu.JamesTang.JMusic.util.DBConnect;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImplements implements UserDao{


    @Override
    public boolean login(String name, String passwordMD5) {
        String sql="SELECT * FROM user WHERE name='"+name+"' AND passwordMD5='"+passwordMD5+"'; ";
        boolean flag=false;
        DBConnect.init();
        ResultSet rs=DBConnect.selectSql(sql);
        try {
            while(rs.next()){
                if(rs.getString("name").equals(name) && rs.getString("passwordMD5").equals(passwordMD5)){
                    flag=true;
                }
            }
            DBConnect.closeConn();
        }catch (SQLException e){
            e.printStackTrace();
        }

        return flag;
    }

    @Override
    public boolean register(MyUser user) {
        boolean flag=false;
        String sql="INSERT INTO user(name, passwordMD5, id) VALUES ('"+user.getName()+"', '"+user.getPasswordMD5()+"', '"+user.getID()+"')";
        DBConnect.init();

        int i=DBConnect.addUpdateDelete(sql);
        if(i>0){
            flag=true;
        }

        DBConnect.closeConn();
        return flag;
    }

    @Override
    public List<MyUser> getUserList() {
        List<MyUser> list=new ArrayList<>();
        String sql="SELECT * FROM user";
        DBConnect.init();
        ResultSet rs=DBConnect.selectSql(sql);
        try{
            while (rs.next()){
                String name=rs.getString("name");
                String pwMD5=rs.getString("passwordMD5");
                String id=rs.getString("id");
                MyUser user=new MyUser(name,id);
                user.setPasswordMD5(pwMD5);
                list.add(user);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        DBConnect.closeConn();
        return list;
    }

    @Override
    public boolean delete(String id) {
        boolean flag=false;
        DBConnect.init();
        String sql="DELETE FROM user WHERE id='"+id+"'";
        int i=DBConnect.addUpdateDelete(sql);
        if(i>0){
            flag=true;
        }
        DBConnect.closeConn();
        return flag;
    }

    @Override
    public boolean update(String name, String id) {
        boolean flag=false;
        String sql="UPDATE user set name='"+name+"' WHERE id= '"+id+"' ";
        DBConnect.init();
        int i=DBConnect.addUpdateDelete(sql);
        System.out.println("1"+" "+i);
        if(i>0){
            flag=true;
        }

        DBConnect.closeConn();
        return flag;
    }
}
