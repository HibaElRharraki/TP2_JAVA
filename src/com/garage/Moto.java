package com.garage;

public class Moto extends Vehicule {
	
	private int cylindre;

	public Moto(String ma, String mo, int a ,int c) {
		super(ma, mo, a);
		this.cylindre=c;
		
	}
	
	@Override
	public void afficherDetails() {
		super.afficherDetails();
		System.out.println("Cylindre "+cylindre);
	}
	
	

}
