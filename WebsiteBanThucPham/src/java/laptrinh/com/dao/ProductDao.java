package laptrinh.com.dao;

import java.sql.*;
import java.util.*;
import laptrinh.com.connection.DBConnection;
import laptrinh.com.model.Category;
import laptrinh.com.model.Product;

public class ProductDao {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public List<Product> getAllProduct() throws SQLException {

        List<Product> listProducts = new ArrayList<Product>();
        String query = "select * from products";
        try {
            con = new DBConnection().GetConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                listProducts.add(new Product(rs.getInt("productId"),
                        rs.getInt("categoryId"),
                        rs.getString("name"),
                        rs.getString("description"),
                        rs.getDouble("price"),
                        rs.getString("image")));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listProducts;
    }

    public Product getProductById(int id) throws SQLException {

        String query = "SELECT * FROM  eshop.products  as a where a.ProductId=?";
        try {
            con = new DBConnection().GetConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(rs.getInt("productId"),
                        rs.getInt("categoryId"),
                        rs.getString("name"),
                        rs.getString("description"),
                        rs.getDouble("price"),
                        rs.getString("image"));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Product> getProductByCid(int id) throws SQLException {
        List<Product> listProducts = new ArrayList<Product>();
        String query = "SELECT * FROM  eshop.products  as a where a.CategoryId=?";
        try {

            con = new DBConnection().GetConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                listProducts.add(new Product(rs.getInt("productId"),
                        rs.getInt("categoryId"),
                        rs.getString("name"),
                        rs.getString("description"),
                        rs.getDouble("price"),
                        rs.getString("image")));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listProducts;
    }

    public List<Product> SearchByName(String name) {
        List<Product> listProducts = new ArrayList<Product>();
        String query = "Select * From eshop.products as a where a.Name like ?";
        try {

            con = new DBConnection().GetConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, "%" + name + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                listProducts.add(new Product(rs.getInt("productId"),
                        rs.getInt("categoryId"),
                        rs.getString("name"),
                        rs.getString("description"),
                        rs.getDouble("price"),
                        rs.getString("image")));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listProducts;
    }

    public Product getProduct(String txt) {
        String query = "SELECT * FROM  eshop.products  as a where a.ProductId=?";
        List<Product> list = new ArrayList<>();
        try {
            con = new DBConnection().GetConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, txt);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(rs.getInt("productId"),
                        rs.getInt("categoryId"),
                        rs.getString("name"),
                        rs.getString("description"),
                        rs.getDouble("price"),
                        rs.getString("image"));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public static void main(String[] args) throws SQLException {
//        ProductDao dao= new ProductDao();
//        List<Product> list=dao.SearchByName("thịt");
//        for(Product p:list){
//            System.out.println(p.toString());
//        }
        ProductDao dao = new ProductDao();
        Product p = dao.getProduct("2");
        System.out.println(p.toString());
    }
}
