package co.yedam.score;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoreApp {
	Scanner scn = new Scanner(System.in);
	List<Score> scores = new ArrayList<>();

	public ScoreApp() {
		readFromFile();
	}

	// 등록
	public boolean addStudent(Score score) {

		if (scores.add(score)) {
			return true;
		}
		return false;
	}

	public boolean isExist(int stuNo) {
		for (int i = 0; i < scores.size(); i++) {
			if (scores.get(i).getNo() == stuNo) { // if이면 true를 리턴한다.
				return true;
			}
		}
		return false;
	}

	// 학생 확인
	public boolean addScore(int stuNo, int kor, int eng, int math) {
		for (int i = 0; i < scores.size(); i++) {
			if (scores.get(i).getNo() == stuNo) { // if이면 true를 리턴한다.
				scores.get(i).setKor(kor);
				scores.get(i).setEng(eng);
				scores.get(i).setMath(math);
				return true;
			}
		}
		return false;
	}

	// 전체정보
	public List<Score> studentList() {
		return scores;
	}

	// 장학금
	public void award() {
		int sum = 0;
		int avg = 1;
		String grade = "";
		for (int i = 0; i < scores.size(); i++) {
			sum = (scores.get(i).getKor() + scores.get(i).getEng() + scores.get(i).getMath());
			avg = sum / 3;

			if (avg >= 90) {
				grade = " 장학금 대상자 A급입니다.";
			} else if (avg >= 80) {
				grade = " B급입니다.";
			} else if (avg >= 70) {
				grade = " C급입니다.";
			} else if (avg >= 60) {
				grade = " D급입니다.";
			} else {
				grade = " F급입니다.";
			}
			System.out.println(scores.get(i).getName() + grade);
		}
	}

	// 출력스트림(객체)
	public boolean storeToFile() {
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("C:/Temp/score1.db");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(scores);
			oos.flush();
			oos.close();
			fos.flush();
			fos.close();
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	// 입력스트림(객체)
	public void readFromFile() {

		FileInputStream fis;

		try {
			fis = new FileInputStream("C:/Temp/score1.db");
			ObjectInputStream ois = new ObjectInputStream(fis);
			scores = (List<Score>) ois.readObject();
			ois.close();
			fis.close();

			System.out.println("불러오기 완료");
		} catch (Exception e) {
			System.out.println("불러오기 실패");
			e.printStackTrace();
		}

	}
}