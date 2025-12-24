package exercice4;

public class TestSystemeNotification {
    public static void main(String[] args) {
        
        
        // 1. Création des Utilisateurs
        Utilisateur alice = new Utilisateur("Alice", "alice@example.com");
        Utilisateur bob = new Utilisateur("Bob", "bob@example.com");
        
        // 2. Création des Services de Notification
        ServiceNotification serviceEmail = new ServiceNotification("EmailSender");
        ServiceNotification serviceSMS = new ServiceNotification("SMSSender");
        
        // 3. Création du Système de Surveillance
        SystemeSurveillance systemeSecurite = new SystemeSurveillance("SystemeSecuritePrincipale");
        
        // 4. Enregistrement des Observateurs
        systemeSecurite.ajouterObservateur(serviceEmail);
        systemeSecurite.ajouterObservateur(serviceSMS);
        
        System.out.println(" Alerte Critique pour Alice ---");
        // 5. Déclenchement d'Événements
        systemeSecurite.notifierObservateurs("alerteCritique", alice);
        
        System.out.println(" Nouvelle Commande pour Bob ---");
        systemeSecurite.notifierObservateurs("nouvelleCommande", bob);
        
        // Test supplémentaire : Retrait d'un observateur
        System.out.println(" Retrait du Service SMS ---");
        systemeSecurite.retirerObservateur(serviceSMS);
        
        System.out.println(" Nouvelle alerte après retrait du SMS ---");
        systemeSecurite.notifierObservateurs("alerteMaintenance", alice);
        
        
    }
}
