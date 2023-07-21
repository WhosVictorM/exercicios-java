package entities;

public class Students {
	private String name;
	private int room;
	private String email;
	
	public Students(String name, int room, String email) {
		super();
		this.name = name;
		this.room = room;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
