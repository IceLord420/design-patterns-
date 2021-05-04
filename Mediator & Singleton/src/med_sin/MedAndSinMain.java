package med_sin;

import java.util.ArrayList;
import java.util.List;

public class MedAndSinMain {
	public static String badWord; 
	
	public static void main(String[] args) {
		badWord = "cat";
		
		IChat ichatMediator = new Chat();
		Room room = new Room(ichatMediator);
		
		User user1 = new User(ichatMediator, "Ivan");
		User user2 = new User(ichatMediator, "Vladimir");
		User user3 = new User(ichatMediator, "Vazov");
	
		ichatMediator.registerUser(user1);
		ichatMediator.registerUser(user2);
		ichatMediator.registerUser(user3);

		ichatMediator.registerChat(room);
		room.createChatRoom();
		
		user1.type("Hello, everyone");
		
		user2.type("Greatings!");
		
		user1.sentenceIsFinished();
		
		user2.type("Greetings!");
		user2.sentenceIsFinished();
		
		user3.type("addBot");
		user3.sentenceIsFinished();
		
		user2.type("There is a cat on the tree");
	}
}
