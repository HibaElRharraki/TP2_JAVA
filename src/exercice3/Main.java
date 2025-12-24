package exercice3;

public class Main {
    
    public static void main(String[] args) {
       
        
        
        
        Forme[] formes = new Forme[4];
        formes[0] = new Cercle(5.0);
        formes[1] = new Rectangle(4.0, 6.0);
        formes[2] = new Cercle(3.5);
        formes[3] = new Rectangle(7.0, 2.5);
        
        
        for (int i = 0; i < formes.length; i++) {
            System.out.println("Forme " + (i + 1) + ":");
            formes[i].afficherType();
            System.out.println("Aire : " + formes[i].calculerAire());
        }
        
     
        
        for (int i = 0; i < formes.length; i++) {
            System.out.println("Forme " + (i + 1) + ":");
            formes[i].afficherType();
            System.out.println("Aire : " + formes[i].calculerAire());
            
            if (formes[i] instanceof Cercle) {
                Cercle cercle = (Cercle) formes[i];
                System.out.println("Rayon : " + cercle.getRayon());
            } else if (formes[i] instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) formes[i];
                System.out.println("Longueur : " + rectangle.getLongueur());
                System.out.println("Largeur : " + rectangle.getLargeur());
            }
        }
        
       
        testerCast();
        
        //  Scénario d'erreur
       
        testScenarioErreur();
    }
    
    // Méthode pour tester l'upcast et le downcast
    public static void testerCast() {
       
        Cercle monCercle = new Cercle(7.0);
        System.out.println("Cercle créé avec rayon : " + monCercle.getRayon());
        
        
        Forme maforme = monCercle;
        System.out.println(" Upcast réussi : Cercle -> Forme");
        maforme.afficherType();
        System.out.println("Aire : " + maforme.calculerAire());
        
      
        System.out.println("Tentative de downcast : Forme -> Cercle");
        if (maforme instanceof Cercle) {
            Cercle cercleRetrouve = (Cercle) maforme;
            System.out.println(" Downcast réussi !");
            System.out.println("Rayon récupéré : " + cercleRetrouve.getRayon());
        } else {
            System.out.println(" Downcast échoué : l'objet n'est pas un Cercle");
        }
    }
    
    // Méthode pour tester le scénario d'erreur
    public static void testScenarioErreur() {
       
        Forme maForme = new Cercle(4.0);
        System.out.println("Forme créée (en réalité un Cercle)");
        maForme.afficherType();
        
       
        System.out.println("Tentative de downcast : Forme (Cercle) -> Rectangle");
        if (maForme instanceof Rectangle) {
            Rectangle rect = (Rectangle) maForme;
            System.out.println(" Downcast réussi (ne devrait pas arriver ici)");
            System.out.println("Longueur : " + rect.getLongueur());
        } else {
            System.out.println(" Downcast impossible : l'objet est un Cercle, pas un Rectangle");
            System.out.println("   Le instanceof a protégé contre une ClassCastException !");
        }
        
        
        System.out.println(" Démonstration : Downcast forcé sans vérification");
        try {
            Rectangle rect = (Rectangle) maForme;  
            System.out.println("Longueur : " + rect.getLongueur());
        } catch (ClassCastException e) {
            System.out.println(" ClassCastException attrapée !");
            System.out.println("   Message : " + e.getMessage());
            System.out.println("   Conclusion : Toujours vérifier avec instanceof avant un downcast !");
        }
    }
}
