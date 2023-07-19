package co.yedam.memo;

public class MemoApp2 {
	Memo2[] memos;
	int memoNumber = 0;

	MemoApp2() {
		memos = new Memo2[10];
	}

	boolean addMemo(Memo2 memo2) {
		if (memoNumber >= 3) {
			return false;
		}
		memos[memoNumber++] = memo2;
		return true;
	}

	boolean editMemo(String num, String content) {
		for (int i = 0; i < memos.length; i++) {
			if (memos[i] != null && memos[i].number.equals(num)) {
				memos[i].setContent(content);
				return true;
			}
		}
		return false;
	} 

	boolean delMemo(String num) {
		for (int i = 0; i < memos.length; i++) {
			if (memos[i] != null && memos[i].number.equals(num)) {
				memos[i] = null;
				return true;
			}
		}
		return false;
	}

	Memo2[] memoList() {
		return memos;
	}
	String findMemo(String str) {
		for (int i = 0; i < memos.length; i++) {
			if (memos[i] != null && memos[i].number.equals(str)) {
				String result = memos[i].content;
				return result;
			}
		}
		return null;
	}
	
}
