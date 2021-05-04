package med_sin;

public interface IChat {
	public void registerUser(User user);
	public void registerChat(Room room);
	public void setAvailableStatus(Boolean status);
	public void setAvailableBot(Boolean status);
	public Boolean isAvailable();
	public Boolean isBotAvailable();
}
