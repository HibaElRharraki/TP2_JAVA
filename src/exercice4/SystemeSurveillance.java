package exercice4;

class SystemeSurveillance implements SujetEvenement {
    private String nomSysteme;
    private java.util.List<ObservateurEvenement> observateurs;
    
    public SystemeSurveillance(String nomSysteme) {
        this.nomSysteme = nomSysteme;
        this.observateurs = new java.util.ArrayList<>();
    }
    
    @Override
    public void ajouterObservateur(ObservateurEvenement observateur) {
        observateurs.add(observateur);
        System.out.println("[" + nomSysteme + "]: Observateur ajouté avec succès.");
    }
    
    @Override
    public void retirerObservateur(ObservateurEvenement observateur) {
        observateurs.remove(observateur);
        System.out.println("[" + nomSysteme + "]: Observateur retiré avec succès.");
    }
    
    @Override
    public void notifierObservateurs(String evenement, Object donnees) {
        System.out.println("\n[" + nomSysteme + "]: Notification des observateurs pour l'événement '" + evenement + "'...");
        for (ObservateurEvenement observateur : observateurs) {
            observateur.mettreAJour(evenement, donnees);
        }
        System.out.println("[" + nomSysteme + "]: Tous les observateurs ont été notifiés.\n");
    }
}
