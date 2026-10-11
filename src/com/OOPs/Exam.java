package com.OOPs;

public class Exam {

	int sno;

	static String itemname;

	public Exam() {
	}

	public Exam(int snos, String itemnames) {

		this.sno = snos;

		this.itemname = itemnames;

	}

	public void setItemName(String name) {

		this.itemname = name;

	}

	public int getSno() {

		return sno;

	}

	public void displayMethod() {

		System.out.println("sno:" + sno);

		System.out.println("itemname:" + itemname);

	}

	public static void main(String[] args) {

		Exam ex = new Exam(101, "pen");

		ex.displayMethod();

		System.out.println(ex.itemname);

//		ex.setItemName("pencil");

		ex.itemname = "eraser";

		ex.displayMethod();

		System.out.println(ex.getSno());

	}

}
