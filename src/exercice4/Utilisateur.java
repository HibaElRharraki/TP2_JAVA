package exercice4;

class Utilisateur implements Notifiable {
    private String nom;
    private String email;
    
    public Utilisateur(String nom, String email) {
        this.nom = nom;
        this.email = email;
    }
    
    @Override
    public void recevoirNotification(String message) {
        System.out.println("[Utilisateur: " + nom + "] a reçu une notification: '" + message + "'");
    }
    
    public String getNom() {
        return nom;
    }
    
    public String getEmail() {
        return email;
    }
    
  
    public String toString() {
        return "Utilisateur{nom='" + nom + "', email='" + email + "'}";
    }
}
