
package laptrinh.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import laptrinh.com.connection.DBConnection;
import laptrinh.com.model.CartItem;
import laptrinh.com.model.Product;

public class CartItemDao {
     Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public List<CartItem> getAllCartItem() throws SQLException {

        List<CartItem> list = new ArrayList<CartItem>();
        String query = "select * from products";
        try {
            con = new DBConnection().GetConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new CartItem(rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getDouble(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9)));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
public static void main(String[] args) throws SQLException {
        CartItemDao dao= new CartItemDao();
        List<CartItem> list=dao.getAllCartItem();
        for(CartItem p:list){
            System.out.println(p.toString());
        }
    }
}
