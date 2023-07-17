package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class JDBCUtil {
	public static Connection getConnection() throws SQLException {
		Connection c = null;
		
		com.mysql.jdbc.Driver driver = new com.mysql.jdbc.Driver();
		
		try {
			//đăng ký  MySQL Driver với DriverManager 
			DriverManager.registerDriver(driver);
			
			//Các thông số
			String url = "jdbc:mySQL://localhost:3306/ontap";
			String username = "root";
			String password = "";
			
			//Tạo kết nối
			c = DriverManager.getConnection(url, username, password);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return c;
	}
	
	public static void closeConnection(Connection c) {
			try {
				if(c!=null) {
					c.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
	}

}
