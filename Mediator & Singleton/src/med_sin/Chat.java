package med_sin;

public class Chat implements IChat {
	private Room room;
	private User user;
	public Boolean available;
	public Boolean bot = false;
	
	@Override
	public void registerUser(User user) {
		this.user = user;
	}

	@Override
	public void registerChat(Room room) {
		this.room = room;
	}

	@Override
	public void setAvailableStatus(Boolean status) {
		this.available = status;
	}

	@Override
	public Boolean isAvailable() {
		return available;
	}

	@Override
	public void setAvailableBot(Boolean status) {
		this.bot = status;
	}
	
	@Override
	public Boolean isBotAvailable() {
		return bot;
	}


}
