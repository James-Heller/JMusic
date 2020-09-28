package edu.JamesTang.JMusic.Servlet;

import edu.JamesTang.JMusic.dao.UserDao;
import edu.JamesTang.JMusic.dao.UserDaoImplements;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");

        UserDao ud=new UserDaoImplements();
        if(ud.delete(id)){
            req.getRequestDispatcher("operateSuccess.jsp").forward(req,resp);
        }else {
            req.getRequestDispatcher("operateFail").forward(req,resp);
        }
    }
}
