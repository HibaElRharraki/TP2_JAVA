package exercice4;

interface SujetEvenement {
    void ajouterObservateur(ObservateurEvenement observateur);
    void retirerObservateur(ObservateurEvenement observateur);
    void notifierObservateurs(String evenement, Object donnees);
}
