package com.garage;

public class Vehicule {
	protected String marque;
	protected String modele;
	protected int annee;
	
	public Vehicule(String ma,String mo,int a) {
		this.marque=ma;
		this.modele=mo;
		this.annee=a;
	}
	
	public void afficherDetails() {
		System.out.println("Marque: "+marque+",Modèle: "+modele+",Année: "+annee);
	}
	
	

}
