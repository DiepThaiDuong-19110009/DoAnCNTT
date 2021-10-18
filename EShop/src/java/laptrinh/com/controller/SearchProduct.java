/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinh.com.controller;

import java.io.*;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import laptrinh.com.dao.CategoryDao;
import laptrinh.com.dao.ProductDao;
import laptrinh.com.model.Category;
import laptrinh.com.model.Product;

@WebServlet(name = "search", urlPatterns = {"/search"})
public class SearchProduct extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            response.setContentType("text/html");
            response.setCharacterEncoding("UTF-8");
            String search = request.getParameter("search");

            CategoryDao categoryDao = new CategoryDao();
            ProductDao productDao = new ProductDao();
            List<Product> list = productDao.SearchByName(search);
            List<Category> listCategorys = categoryDao.getAllCategory();
            request.setAttribute("listP", list);

            request.setAttribute("ListC", listCategorys);
            request.setAttribute("txtsearch",search);
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
