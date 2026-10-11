package com.abstraction;

public interface Payment  {
	public void transaction();
	public void cost();
    public static  void cost(int n) {
		System.out.println("cost"+n);
	}



	
}
