package med_sin;

public class SigletonBot {
	 	private static SigletonBot single_instance = null;
	 	private static IChat ichatMediator;
	    public String s;
	  
	    private SigletonBot()
	    {
	        s = "Hello I am a friendly Singleton bot";
	    }
	  
	    public static SigletonBot getInstance(IChat ichatMediators)
	    {
	        if (single_instance == null)
	            {
	        	single_instance = new SigletonBot();
	            ichatMediator = ichatMediators;
	            }
	  
	        return single_instance;
	    }
	    
	    public void checkForBadWords(String name, String text) {
	    	if(text.indexOf(MedAndSinMain.badWord) != -1)
	    	{
	    		System.out.println("In " + '"' + text + '"'+ ", " + '"' + MedAndSinMain.badWord + '"' +" is a bad word!");
	    		System.out.println(name + " was kicked out of the chat!");
	    	}
	    }
}
