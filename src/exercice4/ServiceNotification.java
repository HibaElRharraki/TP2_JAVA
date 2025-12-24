package exercice4;

class ServiceNotification implements ObservateurEvenement {
    private String typeService;
    
    public ServiceNotification(String typeService) {
        this.typeService = typeService;
    }
    
    @Override
    public void mettreAJour(String evenement, Object donnees) {
        if (typeService.equals("EmailSender")) {
            System.out.println("[Service Email]: Envoi d'un email pour l'événement '" + evenement + "'");
            if (donnees instanceof Utilisateur) {
                ((Utilisateur) donnees).recevoirNotification(
                    "Message spécifique pour l'e-mail lié à l'événement " + evenement
                );
            }
        } else if (typeService.equals("SMSSender")) {
            System.out.println("[Service SMS]: Envoi d'un SMS pour l'événement '" + evenement + "'");
            if (donnees instanceof Utilisateur) {
                ((Utilisateur) donnees).recevoirNotification(
                    "Message spécifique pour le SMS lié à l'événement " + evenement
                );
            }
        } else {
            System.out.println("[Service " + typeService + "]: Traitement de l'événement '" + evenement + "'");
        }
    }
}