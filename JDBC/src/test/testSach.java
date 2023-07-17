package test;

import java.util.ArrayList;
import java.util.Iterator;

import dao.sachDAO;
import model.Sach;

public class testSach {

	public static void main(String[] args) {
		/* Test insert */

//		Sach sach1 = new Sach("LTC","lập trình C" , 60000, 2020);
//		sachDAO.getInstance().insert(sach1);
//
//		
//	 // Test update
//		Sach sach2 = new Sach("OOP","lập trình hướng đối tượng", 100000, 2020);
//		sachDAO.getInstance().update(sach2);
//		
//		// Test delete
//		Sach sach3 = new Sach("LTC","lập trình C", 50000, 2020);
//		sachDAO.getInstance().delete(sach3);
		
		ArrayList<Sach> list = sachDAO.getInstance().selectAll();
		for (Sach sach : list) {
			System.out.println(sach.toString());
		}

	}

}
