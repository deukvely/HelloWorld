package co.yedam;

public class Friend {
	String name;
	String phone;
	String birth;
	String height;

	Friend[] friends;
	int friendNum = 0;

	public Friend() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public Friend(String name, String phone, String birth, String height) {
		super();
		this.name = name;
		this.phone = phone;
		this.birth = birth;
		this.height = height;

	}

	boolean register(Friend friend) {
		if (friendNum >= 2) {
			return false;
		}
		friends[friendNum++] = friend;
		return true;
	}

	Friend[] list() {
		return friends;
	}

	void modify() {

	}

	void remove() {

	}

}
