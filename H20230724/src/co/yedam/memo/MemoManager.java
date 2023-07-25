package co.yedam.memo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemoManager implements Serializable {

	List<Memo> memoStorage = new ArrayList<>();
	Scanner scn = new Scanner(System.in);

	public MemoManager() {
		readFromFile();
	}

	public void printMenu() {
		System.out.println("1.등록 2.검색 3.삭제 4.종료");
		System.out.print("선택> ");
	}

	private int getNextNo() {
		int no = 0;
		for (int i = 0; i < memoStorage.size(); i++) {
			if (memoStorage.get(i).getNo() > no) {
				no = memoStorage.get(i).getNo();
			}
		}
		return no + 1;
	}

	public void inputData() {

		int no = getNextNo();
		System.out.print("날짜>> ");
		String date = scn.nextLine();
		System.out.print("내용>> ");
		String content = scn.nextLine();

		Memo memo = null;
		if (date.isEmpty()) {
			memo = new Memo(no, content);
		} else {
			memo = new Memo(no, date, content);
		}
		if (memoStorage.add(memo)) {
			System.err.println("정상 등록");
		} else {
			System.err.println("등록 오류");
		}

	}

	public void searchDate() {
		System.out.print("날짜>> ");
		String date = scn.nextLine();

		for (int i = 0; i < memoStorage.size(); i++) {
			if (memoStorage.get(i).getDate().equals(date)) {
				memoStorage.get(i).getDate();
				System.out.println("번호: " + memoStorage.get(i).getNo() + //
						" 날짜: " + memoStorage.get(i).getDate() + //
						" 내용: " + memoStorage.get(i).getContent());
			}
		}

		// 입력된 날짜의 메모 출력
	}

	public void deleteData() {
		System.out.print("번호>> ");
		int no = Integer.parseInt(scn.nextLine());
		int no2 = 0;
		for (int i = 0; i < memoStorage.size(); i++) {
			if (memoStorage.get(i).getNo() == no) {
				memoStorage.remove(i);
			}
		}
	}

	public void storeToFile() {
		// 출력스트림. (객체)
		FileOutputStream fos;

		try {
			fos = new FileOutputStream("C:/Temp/memoss.db"); // 파일 저장 경로
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(memoStorage); // 생성한 리스트이름
			oos.close();
			fos.close();

			System.out.println("저장완료");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void readFromFile() {
		// 입력스트림. (객체)
		FileInputStream fis;

		try {
			fis = new FileInputStream("C:/Temp/memoss.db"); // 파일 읽을 경로 지정
			ObjectInputStream ois = new ObjectInputStream(fis);
			memoStorage = (List<Memo>) ois.readObject(); // list 생성한거랑 같이
			ois.close();
			fis.close();

			System.out.println("불러오기 완료");
		} catch (Exception e) {
			System.out.println("불러오기 실패");
			e.printStackTrace();
		}

	}

}
