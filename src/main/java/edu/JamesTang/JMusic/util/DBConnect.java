package edu.JamesTang.JMusic.util;

import java.sql.*;

public class DBConnect {
    static String url="jdbc:mysql://localhost:3306/JMusic?useSSL=false";
    static String user="root";
    static String pw="admin";
    static Connection conn=null;
    static PreparedStatement ps=null;
    static ResultSet rs=null;
    static Statement st=null;

    public static void init(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection(url,user,pw);
        }catch ( ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }

    public static int addUpdateDelete(String sql){
        int i=0;
        try{
            ps=conn.prepareStatement(sql);
            boolean flag=ps.execute();
            if(!flag){
                i++;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return i;
    }

    public static ResultSet selectSql(String sql){
        try{
            ps=conn.prepareStatement(sql);
            rs=ps.executeQuery();
        }catch (SQLException e){
            e.printStackTrace();
        }

        return rs;
    }

    public static void closeConn(){
        try{
            conn.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
