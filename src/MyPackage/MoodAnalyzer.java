package MyPackage;

public class MoodAnalyzer {
	
	MoodAnalyzer(String msg){ //parameterized constructor
		if(msg.contains("SAD"))
			System.out.println( "SAD");
		else if(msg.contains("HAPPY"))
			System.out.println( "HAPPY");
		
	}
	
	
	public MoodAnalyzer() {
		// TODO Auto-generated constructor stub
	}


	public String analyzeMood(String msg) {
		if(msg.contains("SAD"))
			return "SAD";
		
		else if(msg.contains("HAPPY"))
			return( "HAPPY");
		else 
			return null;
	}
	public static void main(String args[]) {
		MoodAnalyzer m1=new MoodAnalyzer();
		MoodAnalyzer m2=new MoodAnalyzer("be HAPPY ,don't worry");//calling parameterized construnctor
		System.out.println(m1.analyzeMood("why u are SAD always..."));
		
	}

}
