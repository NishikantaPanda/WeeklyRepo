package testScript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Practice {

	@Test
	public void demo() {
		System.out.println("First Commit to GitHub in Ad.Sel Session");
	}
	
	@Test
	public void demo2() {
		SoftAssert sa = new SoftAssert();
		System.out.println("Hello from ProfessoR");
		sa.assertTrue(true);
		sa.assertAll();
	}
}
