/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinh.com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import laptrinh.com.dao.CategoryDao;
import laptrinh.com.dao.ProductDao;
import laptrinh.com.model.Category;
import laptrinh.com.model.Product;

/**
 *
 * @author Admin
 */
@WebServlet(name = "CategoryDetail", urlPatterns = {"/CategoryDetail"})
public class CategoryDetail extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int categoryId=Integer.parseInt(request.getParameter("categoryId"));
        try {
            ProductDao productDao = new ProductDao();
            CategoryDao categoryDao = new CategoryDao();

            List<Product> listByCategoryId = productDao.getProductByCid(categoryId);
            List<Category> listCategorys = categoryDao.getAllCategory();
            
           
            request.setAttribute("listP", listByCategoryId);
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
