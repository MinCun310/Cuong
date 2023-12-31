package model;

import java.util.ArrayList;

public class QLSVModel {
	private ArrayList<SinhVien> dsSinhVien;
	private String luaChon;

	public QLSVModel() {
		this.dsSinhVien = new ArrayList<SinhVien>();
		this.luaChon = "";
	}

	public String getLuaChon() {
		return luaChon;
	}

	public void setLuaChon(String luaChon) {
		this.luaChon = luaChon;
	}

	public QLSVModel(ArrayList<SinhVien> dsSinhVien) {
		this.dsSinhVien = dsSinhVien;
	}

	public ArrayList<SinhVien> getDsSinhVien() {
		return dsSinhVien;
	}

	public void setDsSinhVien(ArrayList<SinhVien> dsSinhVien) {
		this.dsSinhVien = dsSinhVien;
	}
	
	public void insert(SinhVien sinhVien) {
		this.dsSinhVien.add(sinhVien);
	}
	
	public int count() {
		return dsSinhVien.size();
	}
	
	public void delete(SinhVien sinhVien) {
		this.dsSinhVien.remove(sinhVien);
	}
	
	public void update (SinhVien sinhVien) {
		this.delete(sinhVien);
		this.insert(sinhVien);
	}

	public boolean kiemTraTonTai(SinhVien sv) {
		for (SinhVien sinhVien : dsSinhVien) {
			if(sinhVien.getMaSinhVien() == sv.getMaSinhVien())
				return true;
		}
		return false;
	}
	public SinhVien findSinhVienByID(String masv){
        for (SinhVien sv: dsSinhVien) {
            if (sv.getMaSinhVien().equalsIgnoreCase(masv)){
                return sv;
            }
        }
        return null;
    }
	
}
