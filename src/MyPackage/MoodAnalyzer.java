package MyPackage;

 class MoodAnalysisException extends Exception{
	public MoodAnalysisException(String msg){
		super(msg);
	}
}

 
 
public class MoodAnalyzer {
	
	/*MoodAnalyzer(String msg){ //parameterized constructor
		try{if(msg.contains("SAD"))
			System.out.println( "SAD");
		else if(msg.contains("HAPPY"))
			System.out.println( "HAPPY");}
		catch(Exception MoodAnalysisException) {
			System.out.println( "dear user u have entered invalid mood");
		}
		
	}
	
	
	public MoodAnalyzer() {
		// TODO Auto-generated constructor stub
	}

*/
	
	  
	  
	    // method to check the age  
	   /* static void validate (String msg) throws MoodAnalysisException{    
	       if(msg==null){  
	  
	        // throw an object of user defined exception  
	        throw new MoodAnalysisException("HAPPY");    
	       }  
	        
	     }    
	*/
	
	public String analyzeMood(String msg) throws MoodAnalysisException{
		try{if(msg.contains("SAD"))
			return "SAD";

		else if(msg.contains("HAPPY"))
			return( "HAPPY");
		else if(msg.equals(""))
				throw new MoodAnalysisException("you have entered empty input");
		}
		catch(NullPointerException ex)
		{
			throw new MoodAnalysisException("you have entered null value");	
		}
		return null;
	}
	
	public static void main(String args[]) throws MoodAnalysisException {
		MoodAnalyzer m1=new MoodAnalyzer();
		//MoodAnalyzer m2=new MoodAnalyzer("be HAPPY ,don't worry");//calling parameterized construnctor
		
		System.out.println(m1.analyzeMood(null));
		
		
	}

}
