package model;

public class Sach {
	private String id;
	private String tenSach;
	private double giaSach;
	private int namXuatBan;
	
	public Sach(String id, String tenSach, double giaSach, int namXuatBan) {
		this.id = id;
		this.tenSach = tenSach;
		this.giaSach = giaSach;
		this.namXuatBan = namXuatBan;
	}

	public Sach() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTenSach() {
		return tenSach;
	}

	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	public double getGiaSach() {
		return giaSach;
	}

	public void setGiaSach(double giaSach) {
		this.giaSach = giaSach;
	}

	public int getNamXuatBan() {
		return namXuatBan;
	}

	public void setNamXuatBan(int namXuatBan) {
		this.namXuatBan = namXuatBan;
	}

	@Override
	public String toString() {
		return "Sach [id=" + id + ", tenSach=" + tenSach + ", giaSach=" + giaSach + ", namXuatBan=" + namXuatBan + "]";
	}

}
