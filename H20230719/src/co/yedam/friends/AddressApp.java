package co.yedam.friends;

// 친구의 연락처 관리 app.
// 일반적인 정보 : 이름, 연락처
// 회사의 정보(회사, 부서)
// 학교의 정보(정보, 전공)
// System.out.println() : 콘솔 x
public class AddressApp {

	Friend[] friends = new Friend[10]; // 저장공간.
	int friendNum = 0;

	// 추가. addFriend()
	public boolean addFriend(Friend friend) {
		if (friendNum >= 10) {
			return false;
		}
		friends[friendNum++] = friend;
		return true;
	}

	// 조회 findFriend()
//	public Friend findFriend() {
//
//	}
//
//	// 조회 findFriend()
//	public Friend editFriend() {
//		for(int i = 0; i < friends.length; i++){
//		if(friends[i] != null && friends[i].getName().equals(name)) {
//			return friends[i];
//		}
//		return null;
//	}
//
//	// 조회 findFriend()
//	public boolean delFriend() {
//
//	}
//
//	// 조회 findFriend()
//	public Friend[] findList() {
//
//	}
}
