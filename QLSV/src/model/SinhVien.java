package model;

import java.util.Date;
import java.util.Objects;

public class SinhVien {
	private String maSinhVien;
	private String tenSinhVien;
	private Date ngaySinh;
	private boolean gioiTinh;
	private String email;
	private int soDienThoai;
	
	public SinhVien() {
		
	}

	public SinhVien(String maSinhVien, String tenSinhVien, Date ngaySinh, boolean gioiTinh, String email, int soDienThoai) {
		super();
		this.maSinhVien = maSinhVien;
		this.tenSinhVien = tenSinhVien;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.email = email;
		this.soDienThoai = soDienThoai;
	}

	public String getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getTenSinhVien() {
		return tenSinhVien;
	}

	public void setTenSinhVien(String tenSinhVien) {
		this.tenSinhVien = tenSinhVien;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public boolean isGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getSoDienThoai() {
		return soDienThoai;
	}
	
	public void setSoDienThoai(int soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	

	@Override
	public String toString() {
		return "SinhVien [maSinhVien=" + maSinhVien + ", tenSinhVien=" + tenSinhVien + ", ngaySinh=" + ngaySinh
				+ ", gioiTinh=" + gioiTinh + ", email=" + email + ", soDienThoai=" + soDienThoai + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, gioiTinh, maSinhVien, ngaySinh, soDienThoai, tenSinhVien);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SinhVien other = (SinhVien) obj;
		return Objects.equals(email, other.email) && gioiTinh == other.gioiTinh
				&& Objects.equals(maSinhVien, other.maSinhVien) && Objects.equals(ngaySinh, other.ngaySinh)
				&& soDienThoai == other.soDienThoai && Objects.equals(tenSinhVien, other.tenSinhVien);
	}

}

