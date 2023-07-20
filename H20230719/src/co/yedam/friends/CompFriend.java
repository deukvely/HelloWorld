package co.yedam.friends;

public class CompFriend extends Friend {
	private String company;
	private String dept;

	public CompFriend() {
		super(); // 부모클래스를 호출
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public CompFriend(String name, String phone, String company, String dept) {
		super(name, phone);
		this.company = company;
		this.dept = dept;
	}

	@Override
	public String showInfo() {
		// TODO Auto-generated method stub
		return super.showInfo() + "회사: " + company + "부서: " + dept;
	}
}
