package exo3.ocp;

public class Vendeur extends Employe{
	
	 public Vendeur(int salaire, int annee_courant, int annee_entree) {
		super(salaire, annee_courant, annee_entree);
	}

	public int salaire_Ven(int commission) {
   	  return super.salaire_Emp()+commission;
     }
}
