package test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import database.JDBCUtil;

public class TestJDBCUtil {

	public static void main(String[] args) throws SQLException {
		// Bước 1: tạo kết nối
		Connection connection = JDBCUtil.getConnection();
		
		try {
			// Bước 2: tạo đối tượng statement
			Statement st = connection.createStatement();
			
			// Bước 3: thực thi 1 câu lệnh
			String sql = "INSERT INTO persons(last_name, first_name, gender, dob, income)\r\n"
					+ "VALUES (\"Tran\", \"Tuan\", \"F\", \"1999-09-19\", 5000000)";
			
			int check = st.executeUpdate(sql);
			
			// Bước 4: Xử lý kết quả
			System.out.println("Số dòng thay đổi: " + check);
			if(check > 0) {
				System.out.println("Nhập dữ liệu thành công");
			}else {
				System.out.println("Nhập dữ liệu thất bại");
			}
			
			// Bước 5: ngắt kết nối
			JDBCUtil.closeConnection(connection);
			System.out.println(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
