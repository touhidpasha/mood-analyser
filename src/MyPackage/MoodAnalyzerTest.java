package MyPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoodAnalyzerTest {

	@Test
	public void test() {
		MoodAnalyzer m=new MoodAnalyzer();
		assertEquals(m.analyzeMood("now your HAPPY..."),"HAPPY");//jnit test case
	}

}


		
		