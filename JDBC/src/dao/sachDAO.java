package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Year;
import java.time.YearMonth;
import java.util.ArrayList;

import com.mysql.cj.xdevapi.Result;

import database.JDBCUtil;
import model.Sach;

public class sachDAO implements DAOInterface<Sach> {
	
	public static sachDAO getInstance() {
		return new sachDAO();
	}

	@Override
	public int insert(Sach t) {
		int ketQua = 0;
		try {
			// Bước 1: Tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();
			
			// Bước 2: Tạo ra đối tượng statement
			Statement st = con.createStatement();
			
			// Bước 3: Thực thi câu lệnh SQL
			String sql = "INSERT INTO sach(id, tenSach, giaSach, namXuatBan)" +
					" VALUES ('"+t.getId()+"','"+t.getTenSach()+"','"+ t.getGiaSach()+"','"+ t.getNamXuatBan()+"') ";
			
			
			ketQua = st.executeUpdate(sql);
			
			// Bước 4: Xử lý kết quả
			System.out.println("Bạn đã thực thi: " + sql);
			System.out.println("Có " + ketQua + " dòng bị thay đổi");
			
			//Bước 5: Ngắt kết nối
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public int update(Sach t) {
		int ketQua = 0;
		try {
			// Bước 1: Tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();
			
			// Bước 2: Tạo ra đối tượng statement
			Statement st = con.createStatement();
			
			// Bước 3: Thực thi câu lệnh SQL
			String sql = "UPDATE sach" +
					" SET " +
					"tenSach='" +t.getTenSach()+ "'" +
					", giaSach='" +t.getGiaSach()+ "'" +
					", namXuatBan='" +t.getNamXuatBan()+"'" +
					" WHERE id = '"+t.getId()+"'";
			
			
			ketQua = st.executeUpdate(sql);
			
			// Bước 4: Xử lý kết quả
			System.out.println("Bạn đã thực thi: " + sql);
			System.out.println("Có " + ketQua + " dòng bị thay đổi");
			
			//Bước 5: Ngắt kết nối
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public int delete(Sach t) {
		int ketQua = 0;
		try {
			// Bước 1: Tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();
			
			// Bước 2: Tạo ra đối tượng statement
			Statement st = con.createStatement();
			
			// Bước 3: Thực thi câu lệnh SQL
			String sql = "DELETE FROM sach" +
					" WHERE id = '"+t.getId()+"'";
			
			
			ketQua = st.executeUpdate(sql);
			
			// Bước 4: Xử lý kết quả
			System.out.println("Bạn đã thực thi: " + sql);
			System.out.println("Có " + ketQua + " dòng bị thay đổi");
			
			//Bước 5: Ngắt kết nối
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public ArrayList<Sach> selectAll() {
		ArrayList<Sach> ketQua = new ArrayList<Sach>();
		try {
			// Bước 1: Tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();
			
			// Bước 2: Tạo ra đối tượng statement
			Statement st = con.createStatement();
			
			// Bước 3: Thực thi câu lệnh SQL
			String sql = "SELECT * FROM sach";
			System.out.println(sql);
			ResultSet rs = st.executeQuery(sql);
			
			// Bước 4: Xử lý kết quả
			while (rs.next()) {
				String id = rs.getString("id");
				String tenSach = rs.getString("tenSach");
				double giaSach = rs.getDouble("giaSach");
				int namXuatBan = rs.getInt("namXuatBan");
				
				Sach sach = new Sach(id, tenSach, giaSach, namXuatBan);
				ketQua.add(sach);
			}
			
			// Bước 5: Ngắt kết nối
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public Sach selectById(Sach t) {
		Sach ketQua = null;
		try {
			// Bước 1: Tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();
			
			// Bước 2: Tạo ra đối tượng statement
			Statement st = con.createStatement();
			
			// Bước 3: Thực thi câu lệnh SQL
			String sql = "SELECT * FROM sach where id = '"+t.getId()+"'";
			System.out.println(sql);
			ResultSet rs = st.executeQuery(sql);
			
			// Bước 4: Xử lý kết quả
			while (rs.next()) {
				String id = rs.getString("id");
				String tenSach = rs.getString("tenSach");
				double giaSach = rs.getDouble("giaSach");
				int namXuatBan = rs.getInt("namXuatBan");
				
				ketQua = new Sach(id, tenSach, giaSach, namXuatBan);
				
			}
			
			// Bước 5: Ngắt kết nối
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public ArrayList<Sach> selectByCondition(String Condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
