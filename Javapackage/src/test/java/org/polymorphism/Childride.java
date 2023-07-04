package org.polymorphism;

public class Childride extends Overriding {
	
	@Override
	public void cub() {
		System.out.println("interest rate 7%");
		super.cub();
	}
	@Override
	public void bob() {
		System.out.println("interest rate 8%");
		super.bob();
	}
	private void sbi() {
		System.out.println("interest rate 5%");
	}

	public static void main(String[] args) {
		
		Childride cl=new Childride();
		cl.bob();
		cl.cub();
		cl.sbi();
		

	}

}
