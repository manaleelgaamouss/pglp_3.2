package exo3.ocp;

public class Vendeur extends Employe{
	
	 private int commission;
	 public Vendeur(int salaire, int annee_courant, int annee_entree,int commission) {
		super(salaire, annee_courant, annee_entree);
		this.commission=commission;
	}

	public int salaire() {
   	  return super.salaire()+commission;
     }
}
