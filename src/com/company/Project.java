package com.company;

public class Project {
     private String nomProjet;
     private Developer [] equipe;
     private int nombreDeveloppeurs;
     
     public Project(String nom) {
    	 this.nomProjet=nom;
    	 equipe =new Developer[5];
    	 nombreDeveloppeurs=0;
     }
     
     public void ajouterDeveloppeur(Developer dev) {
    	 if(nombreDeveloppeurs<equipe.length) {
    		 equipe[nombreDeveloppeurs]=dev;
    		 nombreDeveloppeurs++;
    	 }
    	 else {
    		 System.out.println("L'equipe complete ,Impossible d'ajouter!");
    	 }
     }
     
     public void afficherEquipe() {
    	 System.out.println(nomProjet);
    	 for(int i=0;i<nombreDeveloppeurs;i++) {
    		System.out.println(equipe[i].getNom());
    	 }
     }
     
     
     
}
