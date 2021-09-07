package MyPackage;

public class MoodAnalyzer {
	public String analyzeMood(String msg) {
		if(msg.contains("SAD"))
			return "SAD";
		else 
			return "HAPPY";
	}
	public static void main(String args[]) {
		MoodAnalyzer m1=new MoodAnalyzer();
		System.out.println(m1.analyzeMood("why u are SAD always..."));
		
	}

}
