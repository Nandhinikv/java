package org.polymorphism;

public class Overloading {
	private void cub(int interest , String name) {
		System.out.println("name"+name+"interestrate"+interest);
		// TODO Auto-generated method stub

	}
	private void sbi(String name , int fdinterest) {
		System.out.println("name="+name+"fdinterest="+fdinterest);
		// TODO Auto-generated method stub

	}
	private void bob(String name , int interest  , int fdinterest) {
		System.out.println("name="+name+"interest="+interest+"fdinterest"+fdinterest);
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		Overloading ol= new Overloading();
		ol.bob("savings", 4, 8);
		ol.cub(7, "savings");
		ol.sbi("fd", 8);
		
		

	}

}
