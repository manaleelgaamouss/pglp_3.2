package exo3.ocp;

public class Manager extends Employe{

	public Manager(int salaire, int annee_courant, int annee_entree) {
		super(salaire, annee_courant, annee_entree);
	}

	public int salaire_Man(int nbrordres) {
	   	  return super.salaire_Emp()+(100*nbrordres);
	     }
}
