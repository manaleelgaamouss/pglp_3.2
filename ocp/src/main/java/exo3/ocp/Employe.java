package exo3.ocp;

import java.util.ArrayList;

public class Employe {
	
      private double salaire=1500;
      private double annee_courant;
      private double annee_entree;
      
      public Employe(double salaire,double annee_courant,double annee_entree) {
    	  this.salaire=salaire;
    	  this.annee_courant=annee_courant;
    	  this.annee_entree=annee_entree;
      }
      
      public double salaire() {
    	  if(annee_courant-annee_entree>=1) {
    		 salaire=salaire+20;
    	  }
    	  return salaire;
      }
      
      private ArrayList employes = new ArrayList();
      
      public double salaire_total() {
    	  double salaire_total=0;
    	  for(int i = 0; i < employes.size(); i++)
    	  {
    		  Employe emps = (Employe) employes.get (i) ;  
    		  salaire_total += emps.salaire();
      }
	return salaire_total;
      }
}


