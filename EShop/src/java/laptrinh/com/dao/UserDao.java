package laptrinh.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import laptrinh.com.connection.DBConnection;
import laptrinh.com.model.User;

public class UserDao {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public List<User> getAllUser() throws SQLException {

        List<User> listUsers = new ArrayList<User>();
        String query = "select * from Users";
        try {
            con = new DBConnection().GetConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                listUsers.add(new User(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4)));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listUsers;
    }

    public User Login(String username, String password) {
        String query = "SELECT * FROM eshop.users where Phone=? and Password=?";
        try {
            con = new DBConnection().GetConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new User(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public User CheckUserExist(String username) {
        String query = "SELECT * FROM eshop.users where Phone=?";
        try {
            con = new DBConnection().GetConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new User(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void InsertUser(String user, String pass) {
        String query = "INSERT INTO `Users` (Phone,Password,Role) VALUES (?,?,0)";
        try {
            con = new DBConnection().GetConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public static void main(String[] args) throws SQLException {
//        UserDao userDao = new UserDao();
//        userDao.InsertUser("1234", "123456");
//        List<User> list = userDao.getAllUser();
//        for (User a : list) {
//            System.out.println(a.toString());
//        }
//        //System.out.println(user.toString());
//
//    }
}
