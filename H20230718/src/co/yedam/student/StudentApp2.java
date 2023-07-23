package co.yedam.student;

public class StudentApp2 {

	// 학생의 정보 등록, 등록된 목록 출력, 성적의 합계, 최고점수를 계산
	Student2[] students;
	// 등록 갯수 세기 위함
	int studentNum = 0;

	StudentApp2() {
		students = new Student2[2];
	}
	
	boolean addStudent(Student2 std2) {
		if(studentNum > 3) {
			return false;
		}
		students[studentNum++] = std2;
		return true;
	}
	
	Student2[] studentList() {
		
		return students;
	}
	
	int sumScore() {
		int sum = 0;
		for (int i = 0; i < students.length; i++) {
			sum += students[i].score;
		}
		return sum;
	}
	int maxPrint() {
		int max = students[0].score;
		for (int i = 0; i < studentNum; i++) {
			if (max < students[i].score) {
				max = students[i].score;
			}
		} return max;
	}
}
