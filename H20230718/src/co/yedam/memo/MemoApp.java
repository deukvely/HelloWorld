package co.yedam.memo;

public class MemoApp {
	Memo[] memo;
	int memoNum = 0;
	Memo mo = new Memo();
	MemoApp(){
		memo = new Memo[3];
	}
	boolean addMemo(Memo mno) {
		if(memoNum >= 3) {
			return false;
		}
		memo[memoNum++] = mno;
		return true;
	}
//	boolean editMemo() {
//	
//	}
//	boolean delMemo() {
//		
//	}
	Memo[] memoList() {
		return memo;
	}
//	Memo[] findMemo() {
//		
//	}
}