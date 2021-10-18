
package laptrinh.com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import laptrinh.com.dao.UserDao;
import laptrinh.com.model.User;

@WebServlet(name = "LoginControl", urlPatterns = {"/login"})
public class LoginControl extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username=request.getParameter("user");
        String password=request.getParameter("password");
        UserDao userDao=new UserDao();
        User a=userDao.Login(username, password);
        if(a==null){
            request.setAttribute("message", "Số điện thoại hoặc mật khẩu chưa đúng");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
        else{
            HttpSession session=request.getSession();
            session.setAttribute("usersession", a);
            
            response.sendRedirect("HomeControl");
        }
        
    }

}
