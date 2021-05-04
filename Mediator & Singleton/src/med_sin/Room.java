package med_sin;

public class Room {
	private IChat ichatMediator;
	
	Room(IChat ichatMediator){
		this.ichatMediator = ichatMediator;
	}
	
	public void createChatRoom() {
		System.out.println("Chatroom is available");
		ichatMediator.setAvailableStatus(true);
	}

}
