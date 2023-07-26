
package co.yedam.hr;

import java.util.List;

public class JdbcExe {
	public static void main(String[] args) {
		EmpVO emp = new EmpVO(1002, "황길동", "hwang@gmail.2222com", "대전시1222200", 1300);
		EmpDAO dao = new EmpDAO();
//		List<EmpVO> list = dao.empList(); 목록
//		for(EmpVO vo : list) {
//			System.out.println(vo.toString());
//		}
		
//		if(dao.editEmp(emp)) { 수정
//			System.out.println("수정성공");
//		} else {
//			System.out.println("수정실패");
//		} 
		
		if(dao.delEmp(emp.getEmpId())) { // 삭제
			System.out.println("삭제성공");
		} else {
			System.out.println("삭제실패");
		}
		
		System.out.println("end of prog");
		
	}
}
