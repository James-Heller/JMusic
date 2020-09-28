package edu.JamesTang.JMusic.Servlet;

import edu.JamesTang.JMusic.dao.UserDao;
import edu.JamesTang.JMusic.dao.UserDaoImplements;
import edu.JamesTang.JMusic.entity.MyUser;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String pwMD5= MyUser.getMD5(req.getParameter("password"));
        UserDao ud=new UserDaoImplements();

        if(ud.login(name,pwMD5)){
            req.getRequestDispatcher("/success.jsp");
        }else {
            req.getRequestDispatcher("/login.jsp");
        }
    }
}
