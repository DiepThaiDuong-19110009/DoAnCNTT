package laptrinh.com.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection GetConnection() {
        final String jdbc = "com.mysql.jdbc.Driver";
        final String URL = "jdbc:mysql://localhost/eshop";
        final String USER = "root";
        final String PASS = "816390";
        Connection con = null;
        try {
            Class.forName(jdbc);
            con = DriverManager.getConnection(URL, USER, PASS);

        } catch (ClassNotFoundException ex) {
            System.out.println("Loi driver");
        } catch (Exception e) {
            System.out.println("Loi ket noi");
        } finally {
            return con;
        }
    }
//    	public static void main(String args[]) {
//		Connection con = GetConnection();
//		System.out.println(con);
//	}
}
