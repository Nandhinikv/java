package org.abstraction;

public abstract class Pchild extends PartialAbstract {
	
	@Override
	public void cub() {
		System.out.println("IR=5%");
		
	}
	@Override
	public void sbi() {
		System.out.println("IR=7%");
		
	}
	public static void main(String[] args) {
		Pchild p= new Pchild() {
			
			
		};
		p.cub();
		p.sbi();
		p.BranchLocation();
		
	}
	
	

}
