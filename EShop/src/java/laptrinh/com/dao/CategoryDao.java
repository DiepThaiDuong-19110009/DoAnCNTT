package laptrinh.com.dao;

import java.sql.*;
import java.util.*;
import laptrinh.com.connection.DBConnection;
import laptrinh.com.model.*;

public class CategoryDao {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public List<Category> getAllCategory() throws SQLException {

        List<Category> listCategorys = new ArrayList<Category>();
        String query = "select * from category";
        try {
            con = new DBConnection().GetConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                listCategorys.add(new Category(
                        rs.getInt("categoryId"),
                        rs.getString("name"),
                        rs.getString("description")));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listCategorys;
    }
    
     public Category getCategoryDetail(int id) throws SQLException {

        String query = "SELECT * FROM  eshop.category  as a where a.CategoryId=?";
        try {
            con = new DBConnection().GetConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Category(
                        rs.getInt("categoryId"),
                        rs.getString("name"),
                        rs.getString("description"));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
