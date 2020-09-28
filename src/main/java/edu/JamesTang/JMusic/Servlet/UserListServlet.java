package edu.JamesTang.JMusic.Servlet;

import edu.JamesTang.JMusic.dao.UserDao;
import edu.JamesTang.JMusic.dao.UserDaoImplements;
import edu.JamesTang.JMusic.entity.MyUser;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class UserListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        UserDao ud=new UserDaoImplements();
        List<MyUser> list=ud.getUserList();
        req.setAttribute("all",list);
        req.getRequestDispatcher("showUserList.jsp").forward(req,resp);
    }
}
