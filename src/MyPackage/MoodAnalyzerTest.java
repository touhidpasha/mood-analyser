package MyPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoodAnalyzerTest {

	@Test
	public void test() {
		MoodAnalyzer m=new MoodAnalyzer();
		try {
			assertEquals(m.analyzeMood(null),"HAPPY");
		} catch (MoodAnalysisException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//jnit test case
	}

}


		
		