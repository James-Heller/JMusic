package edu.JamesTang.JMusic.Servlet;

import edu.JamesTang.JMusic.dao.UserDao;
import edu.JamesTang.JMusic.dao.UserDaoImplements;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class UpdateServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String ID=req.getParameter("id");
        String Name=req.getParameter("name");

        UserDao ud=new UserDaoImplements();
        if(ud.update(Name,ID)){
            req.getRequestDispatcher("/showUserList.jsp").forward(req,resp);
        }else {
            req.getRequestDispatcher("/operateFail,jsp").forward(req,resp);
            PrintWriter out=resp.getWriter();
            out.print("<script>alert('操作失败!');window.location.href='register.jsp'</script>");
        }
    }
}
