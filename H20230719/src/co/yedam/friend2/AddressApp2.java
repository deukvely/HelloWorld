package co.yedam.friend2;

public class AddressApp2 {
	int cntNum = 0;

	Friend2[] friends = new Friend2[10];

	// 추가 addFriend()
	public boolean addFriend(Friend2 friend2) {
		for (int i = 0; i < friends.length; i++) {
			if (i > friends.length) {
				return false;
			}
		}
		friends[cntNum++] = friend2;
		return true;
	}

	// 수정. editFriend() : 연락처 수정.

	// 삭제. delFriend() : 삭제

	// 목록 friendList(): 친구목록
	public Friend2[] friendList() {
		return friends;
	}

	// 조회 findFriend() : 친구 이름 중복 X
	public Friend2 findFriend(String name) {
		for (int i = 0; i < 1; i++) {
			if (friends[i].getName().equals(name)) {
				return friends[i];
			}
		}
		return null;
	}
}
