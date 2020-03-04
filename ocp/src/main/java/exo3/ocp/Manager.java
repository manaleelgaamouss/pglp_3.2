package exo3.ocp;

public class Manager extends Employe{

	private int nbrordres;
	public Manager(int salaire, int annee_courant, int annee_entree,int nbrordres) {
		super(salaire, annee_courant, annee_entree);
		this.nbrordres=nbrordres;
	}

	public int salaire() {
	   	  return super.salaire()+(100*nbrordres);
	     }
}
