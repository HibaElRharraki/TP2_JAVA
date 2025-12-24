package exercice3;

public class Cercle extends Forme {
	private double rayon;

	public Cercle(double r) {
		this.rayon=r;
	}

	@Override
	public double calculerAire() {
		return Math.PI*rayon*rayon;
	}
	
    @Override 
    public void afficherType() {
    	System.out.println("Type: Cercle");
    	
    }
	
    public double getRayon() {
        return rayon;
    }
}

