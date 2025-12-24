package exercice3;

public class Rectangle extends Forme {
	private double largeur;
	private double longueur;
	
    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }
    
    
    @Override
    public double calculerAire() {
        return longueur * largeur;
    }
    
    
    @Override
    public void afficherType() {
        System.out.println("Type : Rectangle");
    }
    
    public double getLongueur() {
        return longueur;
    }
    
    public double getLargeur() {
        return largeur;
    }

}
