package co.yedam.friends;

public class UnivFriend extends Friend {
	private String univ;
	private String major;
	
	public UnivFriend(String univ, String major) {
		super();
		this.univ = univ;
		this.major = major;
	}
	
	public String getUniv() {
		return univ;
	}

	public void setUniv(String univ) {
		this.univ = univ;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public UnivFriend(String name, String phone, String univ, String major) {
		super(name, phone);
		this.univ = univ;
		this.major = major;
	}

	@Override
	public String showInfo() {
		// TODO Auto-generated method stub
		return super.showInfo() + "학교: " + univ + "과목: " + major;
	}
}
