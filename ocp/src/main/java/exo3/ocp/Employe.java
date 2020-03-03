package exo3.ocp;

import java.util.ArrayList;

public class Employe {
	
      private int salaire=1500;
      private int annee_courant;
      private int annee_entree;
      
      public Employe(int salaire,int annee_courant,int annee_entree) {
    	  this.salaire=1500;
    	  this.annee_courant=annee_courant;
    	  this.annee_entree=annee_entree;
      }
      
      public int salaire_Emp() {
    	  if(annee_courant-annee_entree>=1) {
    		 salaire=salaire+20;
    	  }
    	  return salaire;
      }
      
      private ArrayList employes = new ArrayList();
      
      public int salaire_total() {
    	  for(int i = 0; i < employes.size(); i++)
    	  {
    		  salaire+= (Integer)employes.get(i);
      }
	return salaire;
      }
}


