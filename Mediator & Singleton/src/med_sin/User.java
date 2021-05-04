package med_sin;

public class User   {
	private IChat ichatMediator;
	private String name;
	public SigletonBot x;
	
	User(IChat ichatMediator, String name){
		this.ichatMediator = ichatMediator;
		this.name = name;
	}
	
	public void type(String text) {
		if(ichatMediator.isAvailable()) {
			System.out.println(name + " typed: " + text);

			if("addBot" == text) {
				x = SigletonBot.getInstance(ichatMediator);
				System.out.println(name + " added a bot! Chat-Bot: " + x.s);
				ichatMediator.setAvailableBot(true);
			} 
			if(ichatMediator.isBotAvailable()){
				x = SigletonBot.getInstance(ichatMediator);
				x.checkForBadWords(name, text);
			}
			
			ichatMediator.setAvailableStatus(false);
		}
		else {
			System.out.println(name + ", you can't type right now! Waiting for other user to finish typing");
		}
	}
	
	public void sentenceIsFinished() {
		System.out.println(name + " has finished typing");
		ichatMediator.setAvailableStatus(true);
	}
	
}
