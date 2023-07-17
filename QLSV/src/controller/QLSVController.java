package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;

import model.SinhVien;
import view.QLSVView;

public class QLSVController implements ActionListener{
	private QLSVView view;
	

	public QLSVController() {
		this.view = new QLSVView();
	}

	public QLSVController(QLSVView view) {
		this.view = view;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String cm = e.getActionCommand();
		JOptionPane.showMessageDialog(view, "bạn vừa nhấn nút " +cm);
		if(cm.equals("Thêm")) {
			this.view.resetView();
//			this.view.getModel().setLuaChon("Thêm");
		}else if (cm.equals("Lưu")) {
			try {
				this.view.thucHienThem();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}else if(cm.equals("Sửa")) {
			this.view.hienThiThongTinSinhVien();
		}else if(cm.equals("Xóa")) {
			this.view.thucHienXoa();
		}else if(cm.equals("Hủy bỏ")) {
			this.view.resetView();
		}else if(cm.equals("Tìm Kiếm")) {
			this.view.thucHienTimKiem();
		}
		
	}

}
