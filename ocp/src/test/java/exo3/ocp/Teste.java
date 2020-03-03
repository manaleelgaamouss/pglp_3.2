package exo3.ocp;
import static org.junit.Assert.*;

import org.junit.Test;

public class Teste {
	
	Employe emp;
	Vendeur ven;
	
	@Test
	public void testNotNull() {
		emp = new Employe(2100,2020,2010);
		assertNotNull(emp);
	}
	
	@Test
	public final void test_salaireVen() {
		ven = new Vendeur(2100,2020,2010);
		assertEquals(1820,ven.salaire_Ven(300));
	}
	
	@Test
	public final void test_salaireEmp() {
		emp = new Employe(2100,2020,2010);
	    assertTrue(emp.salaire_Emp()==1520);
	}

	@Test
	public final void test_salaireTotal() {
		emp = new Employe(2100,2020,2010);
	    assertFalse(emp.salaire_total()==23344);
	}


}
