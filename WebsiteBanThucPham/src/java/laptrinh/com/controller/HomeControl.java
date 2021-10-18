
package laptrinh.com.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import laptrinh.com.dao.CategoryDao;
import laptrinh.com.dao.ProductDao;
import laptrinh.com.model.Category;
import laptrinh.com.model.Product;

public class HomeControl extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            ProductDao productDao = new ProductDao();
            CategoryDao categoryDao=new CategoryDao();
            
            List<Product>listProducts=productDao.getAllProduct();
            List<Category> listCategorys=categoryDao.getAllCategory();
            
            request.setAttribute("listP", listProducts);
            request.setAttribute("ListC", listCategorys);
            request.getRequestDispatcher("home.jsp").forward(request, response);
        } catch (SQLException ex) {
            
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

   
}
