package org.java;

public class child implements parent1,parent2 {

	@Override
	public void gift3() {
		System.out.println("bike");
		
		
	}

	@Override
	public void gift4() {
		System.out.println("aeroplane");
	
		
	}

	@Override
	public void gift1() {
		System.out.println("ps5");
		
		
	}

	@Override
	
	public void gift2() {
		System.out.println("home");
		
	}
	public static void main(String[] args) {
		child c=new child();
		c.gift1();
		c.gift2();
        c.gift3();
        c.gift4();

}
}
