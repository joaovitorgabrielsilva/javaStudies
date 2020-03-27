package entities;

public class Room {
	private String guest;
	private String email;
	
	public Room(String guest, String email) {
		this.guest = guest;
		this.email = email;
	}
	
	public String getGuest() {
		return guest;
	}
	public void setGuest(String guest) {
		this.guest = guest;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return guest + ", " + email;
	}
	
	
}
