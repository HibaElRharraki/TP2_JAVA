package com.garage;

public class Voiture extends Vehicule {
	private int nombreDePortes;

	public Voiture(String ma, String mo, int a,int n) {
		super(ma, mo, a);
		this.nombreDePortes=n;	
	}
	
	@Override
	public void afficherDetails() {
		super.afficherDetails();
		System.out.println("nombre de porte "+nombreDePortes);
	}

}
