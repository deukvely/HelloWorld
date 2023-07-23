package co.yedam.friend2;

public class CompFriend2 extends Friend2 {
	private String comp;
	private String dept;

	public CompFriend2(String name, String phone, String comp, String dept) {
		super();
		this.comp = comp;
		this.dept = dept;
	}

	public String getComp() {
		return comp;
	}

	public void setComp(String comp) {
		this.comp = comp;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
}
