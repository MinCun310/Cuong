package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.QLSVModel;
import model.SinhVien;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.QLSVController;

import javax.swing.JScrollPane;
import javax.swing.JScrollBar;

import java.util.Set;
import java.util.TreeSet;

public class QLSVView extends JFrame {

	private JPanel contentPane;
	private QLSVModel model;
	private JTextField txtTen;
	private JTextField txtNgaySinh;
	private JTextField txtEmail;
	private JTextField txtSDT;
	private JTextField txtMSSV;
	private final ButtonGroup btnGioiTinh = new ButtonGroup();
	private JTable table;
	private JLabel lblCount;
	private JRadioButton rdbtnNam;
	private JRadioButton rdbtnNu;

	public QLSVModel getModel() {
		return model;
	}

	public void setModel(QLSVModel model) {
		this.model = model;
	}

	public JTextField getTxtTen() {
		return txtTen;
	}

	public void setTxtTen(JTextField txtTen) {
		this.txtTen = txtTen;
	}

	public JTextField getTxtNgaySinh() {
		return txtNgaySinh;
	}

	public void setTxtNgaySinh(JTextField txtNgaySinh) {
		this.txtNgaySinh = txtNgaySinh;
	}

	public JTextField getTxtEmail() {
		return txtEmail;
	}

	public void setTxtEmail(JTextField txtEmail) {
		this.txtEmail = txtEmail;
	}

	public JTextField getTxtSDT() {
		return txtSDT;
	}

	public void setTxtSDT(JTextField txtSDT) {
		this.txtSDT = txtSDT;
	}

	public JTextField getTxtMSSV() {
		return txtMSSV;
	}

	public void setTxtMSSV(JTextField txtMSSV) {
		this.txtMSSV = txtMSSV;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public ButtonGroup getBtnGioiTinh() {
		return btnGioiTinh;
	}

	public JLabel getCount() {
		return getCount();
	}

	public void setCount(JLabel count) {
		lblCount = count;
	}

	public JRadioButton getRdbtnNam() {
		return rdbtnNam;
	}

	public void setRdbtnNam(JRadioButton rdbtnNam) {
		this.rdbtnNam = rdbtnNam;
	}

	public JRadioButton getRdbtnNu() {
		return rdbtnNu;
	}

	public void setRdbtnNu(JRadioButton rdbtnNu) {
		this.rdbtnNu = rdbtnNu;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLSVView frame = new QLSVView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QLSVView() {
		this.model = new QLSVModel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 702, 567);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		ActionListener action = new QLSVController(this);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUẢN LÝ SINH VIÊN");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(262, 34, 193, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MSSV");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(83, 80, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tên");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(83, 109, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Ngày sinh");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(83, 138, 85, 19);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Giới tính");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(83, 168, 68, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Email");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_4.setBounds(83, 197, 46, 14);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("SĐT");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_5.setBounds(83, 229, 46, 14);
		contentPane.add(lblNewLabel_1_5);
		
		txtTen = new JTextField();
		txtTen.setBounds(174, 108, 205, 20);
		contentPane.add(txtTen);
		txtTen.setColumns(10);
		
		txtNgaySinh = new JTextField();
		txtNgaySinh.setColumns(10);
		txtNgaySinh.setBounds(174, 140, 205, 20);
		contentPane.add(txtNgaySinh);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(174, 196, 205, 20);
		contentPane.add(txtEmail);
		
		txtSDT = new JTextField();
		txtSDT.setColumns(10);
		txtSDT.setBounds(174, 228, 205, 20);
		contentPane.add(txtSDT);
		
		txtMSSV = new JTextField();
		txtMSSV.setColumns(10);
		txtMSSV.setBounds(174, 79, 205, 20);
		contentPane.add(txtMSSV);
		
		JButton btnThem = new JButton("Thêm");
		btnThem.addActionListener(action);
		btnThem.setBounds(440, 108, 89, 23);
		contentPane.add(btnThem);
		
		JButton btnXoa = new JButton("Xóa");
		btnXoa.addActionListener(action);
		btnXoa.setVerticalAlignment(SwingConstants.BOTTOM);
		btnXoa.setBounds(440, 137, 89, 23);
		contentPane.add(btnXoa);
		
		JButton btnSua = new JButton("Sửa");
		btnSua.addActionListener(action);
		btnSua.setBounds(440, 169, 89, 23);
		contentPane.add(btnSua);
		
		rdbtnNam = new JRadioButton("Nam");
		btnGioiTinh.add(rdbtnNam);
		rdbtnNam.setBounds(174, 166, 46, 23);
		contentPane.add(rdbtnNam);
		
		rdbtnNu = new JRadioButton("Nữ");
		btnGioiTinh.add(rdbtnNu);
		rdbtnNu.setBounds(227, 166, 46, 23);
		contentPane.add(rdbtnNu);
		
		JLabel lblNewLabel_2 = new JLabel("Danh sách sinh viên");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(46, 259, 143, 22);
		contentPane.add(lblNewLabel_2);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"MSSV", "H\u1ECD t\u00EAn", "Ng\u00E0y sinh", "Gi\u1EDBi t\u00EDnh", "Email", "S\u1ED1 \u0111i\u1EC7n tho\u1EA1i"
			}
		));
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 292, 634, 200);
		contentPane.add(scrollPane);
		
		JButton btnLuu = new JButton("Lưu");
		btnLuu.addActionListener(action);
		btnLuu.setBounds(440, 196, 89, 23);
		contentPane.add(btnLuu);
		
		JButton btnHuyBo = new JButton("Hủy bỏ");
		btnHuyBo.addActionListener(action);
		btnHuyBo.setBounds(440, 225, 89, 23);
		contentPane.add(btnHuyBo);
		
		lblCount = new JLabel("Count:");
		lblCount.setBounds(46, 503, 46, 14);
		contentPane.add(lblCount);
		
		JButton btnTimKiem = new JButton("Tìm Kiếm");
		btnTimKiem.addActionListener(action);
		btnTimKiem.setBounds(440, 78, 89, 23);
		contentPane.add(btnTimKiem);
		
		this.setVisible(true);
	}

	public void resetView() {
		txtMSSV.setText("");
		txtTen.setText("");
		txtNgaySinh.setText("");
		txtEmail.setText("");
		txtSDT.setText("");
		btnGioiTinh.clearSelection();
		
	}
	
	public void themSinhVienVaoTable(SinhVien sv) {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		model_table.addRow(new Object[] { sv.getMaSinhVien() + "",
				sv.getTenSinhVien(),
				sv.getNgaySinh().getDate() + "/" + (sv.getNgaySinh().getMonth() + 1) + "/"+ (sv.getNgaySinh().getYear() + 1900),
				(sv.isGioiTinh() ? "Nam" : "Nữ"),sv.getEmail().toString(),
				sv.getSoDienThoai()+""  });
	}

	public void themSinhVien(SinhVien sv) {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		if (!this.model.kiemTraTonTai(sv)) {
			this.model.insert(sv);
			this.themSinhVienVaoTable(sv);
			this.countSinhVien(sv);
		}else if(this.model.kiemTraTonTai(sv)) {
			this.model.update(sv);
			int soLuongDong = model_table.getRowCount();
			for (int i = 0; i < soLuongDong; i++) {
				String id = model_table.getValueAt(i, 0) + "";
				if (id.equals(sv.getMaSinhVien() + "")) {
					model_table.setValueAt(sv.getMaSinhVien() + "", i, 0);
					model_table.setValueAt(sv.getTenSinhVien() + "", i, 1);
					model_table.setValueAt(sv.getNgaySinh().getDate() + "/" + (sv.getNgaySinh().getMonth() + 1) + "/"
							+ (sv.getNgaySinh().getYear() + 1900) + "", i, 2);
					model_table.setValueAt((sv.isGioiTinh() ? "Nam" : "Nữ"), i, 3);
					model_table.setValueAt(sv.getEmail() + "", i, 5);
					model_table.setValueAt(sv.getSoDienThoai() + "", i, 6);
				}
			}
		}
		
	}
	
	public SinhVien getSinhVienDangChon() {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();
		
		String maSinhVien = String.valueOf(model_table.getValueAt(i_row, 0));
		String tenSinhVien = String.valueOf(model_table.getValueAt(i_row, 1));
		String s = model_table.getValueAt(i_row, 2)+ "";
		Date ngaySinh = new Date(s);
		boolean gioiTinh = getBtnGioiTinh().equals("Nam");
		String email = String.valueOf(model_table.getValueAt(i_row, 4));
		int soDienThoai = Integer.valueOf(model_table.getValueAt(i_row, 5)+ "");
		
		SinhVien sv = new SinhVien(maSinhVien, tenSinhVien, ngaySinh, gioiTinh, email, soDienThoai);
		return sv;
	}

	public void hienThiThongTinSinhVien() {
		SinhVien sv = getSinhVienDangChon();
		this.getTxtMSSV().setText(sv.getMaSinhVien());
		this.getTxtTen().setText(sv.getTenSinhVien());
		String s = (sv.getNgaySinh().getDate() + "/" + (sv.getNgaySinh().getMonth() + 1) + "/"
				+ (sv.getNgaySinh().getYear() + 1900)+"");
		this.getTxtNgaySinh().setText(s +"");
		if (sv.isGioiTinh()) {
			getRdbtnNam().setSelected(true);
		} else {
			getRdbtnNu().setSelected(true);
		}
		this.getTxtEmail().setText(sv.getEmail());
		this.getTxtSDT().setText(sv.getSoDienThoai() +"");
	}

	public void countSinhVien(SinhVien sv) {
		try {
			lblCount.setText("Count: " + this.model.count());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void thucHienThem() {
		//Get dữ liệu
		String maSinhVien = String.valueOf(this.getTxtMSSV().getText());
		String tenSinhVien = String.valueOf(this.getTxtTen().getText());
		Date ngaySinh = new Date(this.getTxtNgaySinh().getText());
		boolean gioiTinh = true;
		if(this.getRdbtnNam().isSelected()) {
			gioiTinh = true;
		}else if(this.getRdbtnNu().isSelected()){
			gioiTinh = false;
		}
		String email = String.valueOf(this.getTxtEmail().getText());
		int soDienThoai = Integer.valueOf(this.getTxtSDT().getText());
		
		SinhVien sv = new SinhVien(maSinhVien, tenSinhVien, ngaySinh, gioiTinh, email, soDienThoai);
		this.themSinhVien(sv);
	}

	public void thucHienXoa() {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();
		int luaChon = JOptionPane.showConfirmDialog(this,"Bạn có chắc chắn xóa dòng đã chọn");
		if (luaChon == JOptionPane.YES_OPTION);{
			SinhVien sv = getSinhVienDangChon();
			this.model.delete(sv);
			this.countSinhVien(sv);
			model_table.removeRow(i_row);
		}
	}

	public void thucHienTimKiem() {
		SinhVien svFind = this.model.findSinhVienByID(txtMSSV.getText());
        if(svFind != null){
            setModel(svFind);;
        }else{
            JOptionPane.showMessageDialog(this,"khong tim thay");
        }
	}
	public void setModel(SinhVien sv){
        txtMSSV.setText(sv.getMaSinhVien());
        txtTen.setText(sv.getTenSinhVien());
        txtNgaySinh.setText(sv.getNgaySinh().getDate() + "/" + (sv.getNgaySinh().getMonth() + 1) + "/"
				+ (sv.getNgaySinh().getYear() + 1900)+"");
        if (sv.isGioiTinh()) {
			getRdbtnNam().setSelected(true);
		} else {
			getRdbtnNu().setSelected(true);
		}
        txtEmail.setText(sv.getEmail());
        txtSDT.setText(sv.getSoDienThoai()+"");
        
    }
}
