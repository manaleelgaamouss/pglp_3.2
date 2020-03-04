package exo3.ocp;

public class Vendeur extends Employe{
	
	 private double commission;
	 public Vendeur(double salaire, double annee_courant, double annee_entree,double commission) {
		super(salaire, annee_courant, annee_entree);
		this.commission=commission;
	}

	public double salaire() {
   	  return super.salaire()+commission;
     }
}
