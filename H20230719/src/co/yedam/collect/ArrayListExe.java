package co.yedam.collect;

import java.util.ArrayList;

import co.yedam.friend.Friend;

import java.util.List;

public class ArrayListExe {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("김길동");
		list.add("박길동"); // 직접적으로 넣고 for문으로 넣으면 이어서 넣어짐
		for(int i = 0; i < 15; i++) { // list에 계속 값을 넣을 수 있음
			list.add(String.valueOf(i));
		}
		
//		list.add(10);
//		list.add(new Friend("김길동", "010-1111"));
		
		String obj = (String) list.get(0); // get(0)이면 list[0] 값을 가져온다
		list.set(0,  "Hong"); // list[0] = "Hong";
		System.out.println("크기: " + list.size());
		list.remove(0); // list[0] = null; 0번째가 지워지면 뒤에서 자리를 매꿈.
		System.out.println("크기: " + list.size());
		obj = list.get(0); 
		System.out.println(obj);
		
		list.clear();
		for(int i = 0; i < list.size(); i++) {
			System.out.printf("[%d]의 위치값 %s \n", i, list.get(i));
			
		}
//		Integer num = (Integer) list.get(1);
//		System.out.println(obj + " " + num);
	}
}
