package org.abstraction;

public  class Fchildc implements FullyAbs {

	public void cub() {
		System.out.println("5%");
		
	}

	public void sbi() {
		System.out.println("6%");
	}
 public static void main(String[] args) {
	Fchildc c= new Fchildc();
	c.cub();
	c.sbi();
}
}
