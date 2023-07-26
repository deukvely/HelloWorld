package co.yedam.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BoardApp implements Serializable {
	List<Board> boards = new ArrayList<>();
	
	public BoardApp() {
		
	}
	
	boolean register(Board board) {
		if (boards.add(board)) {
			return true;
		}
		return false;
	}

	boolean modify(int no, String content) {
		for (int i = 0; i < boards.size(); i++) {
			if (boards.get(i).getNo() == no) {
				boards.get(i).setContent(content);
				return true;
			}
		}
		return false;
	}

	String search(int no) {
		for (int i = 0; i < boards.size(); i++) {
			if (boards.get(i).getNo() == no) {

				return boards.get(i).toString();
			}
		}
		return null;
	}

	boolean remove(int no) {
		for (int i = 0; i < boards.size(); i++) {
			if (boards.get(i).getNo() == no) {
				boards.remove(i);
				return true;
			}
		}
		return false;
	}

	List<Board> list() {
		return boards;
	}

	public void readFromFile() {

		FileInputStream fis;

		try {
			fis = new FileInputStream("C:/Temp/boardList.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			boards = (List<Board>) ois.readObject();
			ois.close();
			fis.close();

			System.out.println("불러오기 완료하였습니다.");
		} catch (Exception e) {
			System.out.println("불러오기 실패하였습니다.");
			e.printStackTrace();
		}

	}

	public void storeToFile() {

		FileOutputStream fos;

		try {
			fos = new FileOutputStream("C:/Temp/boardList.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(boards);
			oos.flush();
			oos.close();
			fos.flush();
			fos.close();

			System.out.println("저장 완료하였습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
