package com.garage;

public class GarageTest {

	public static void main(String[] args) {
		Voiture v=new Voiture("Peugeot","208",2021,4);
		
		Moto m=new Moto("Honda","CBR 600RR",2021,599);
		
		v.afficherDetails();
		m.afficherDetails();
		
		

	}

}
