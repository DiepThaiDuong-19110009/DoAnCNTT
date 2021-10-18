package laptrinh.com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import laptrinh.com.dao.UserDao;
import laptrinh.com.model.User;

@WebServlet(name = "SignUpControl", urlPatterns = {"/SignUp"})
public class SignUpControl extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        String repass = request.getParameter("repass");

        if (!pass.equals(repass)) {
            request.setAttribute("message", "Mật khẩu chưa giống");
            request.getRequestDispatcher("register.jsp").forward(request, response);
        } else {
            UserDao userDao = new UserDao();
            User a = userDao.CheckUserExist(user);
            if (a == null) {
                userDao.InsertUser(user, pass);
                response.sendRedirect("HomeControl");
            } else {
                request.setAttribute("message", "Tài khoản đã tồn tại");
                request.getRequestDispatcher("register.jsp").forward(request, response);
            }
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
