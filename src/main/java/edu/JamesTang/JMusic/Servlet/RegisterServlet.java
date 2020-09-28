package edu.JamesTang.JMusic.Servlet;

import edu.JamesTang.JMusic.dao.UserDao;
import edu.JamesTang.JMusic.dao.UserDaoImplements;
import edu.JamesTang.JMusic.entity.MyUser;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RegisterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String password=req.getParameter("password");
        String id=req.getParameter("id");

        MyUser user=new MyUser(name,password,id);

        UserDao ud=new UserDaoImplements();
        if(ud.register(user)){
            req.setAttribute("name",name);
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }else {
            PrintWriter out=resp.getWriter();
            out.print("<script>alert('注册失败!');window.location.href='register.jsp'</script>");
        }
    }
}
