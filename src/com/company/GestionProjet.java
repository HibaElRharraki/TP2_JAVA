package com.company;

public class GestionProjet {

	public static void main(String[] args) {
		Developer dev1 = new Developer("John Smith");
		Developer dev2 = new Developer("Emily Johnson");
		Developer dev3 = new Developer("Michael Brown");
        
        
        Project projet = new Project("Application Mobile");
        
        projet.ajouterDeveloppeur(dev1);
        projet.ajouterDeveloppeur(dev2);
        projet.ajouterDeveloppeur(dev3);
       
        
        projet.afficherEquipe();
	}

}
