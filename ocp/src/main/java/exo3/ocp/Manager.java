package exo3.ocp;

public class Manager extends Employe{

	private double nbrordres;
	public Manager(double salaire, double annee_courant, double annee_entree,double nbrordres) {
		super(salaire, annee_courant, annee_entree);
		this.nbrordres=nbrordres;
	}

	public double salaire() {
	   	  return super.salaire()+(100*nbrordres);
	     }
}
