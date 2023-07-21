package co.yedam.collect;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExe {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();

		set.add("Apple");
		set.add("Banana");
		set.add("Cherry");
		set.add("Apple");

		// 반복문
		Iterator<String> iter = set.iterator(); // iterator 반복자를 반환함
		while (iter.hasNext()) { // next로 문자를 꺼내다 다 꺼내면 반복문 종료
			String str = iter.next(); // next 문자를 하나씩 꺼내줌
			System.out.println(str);
		}
		// 확장 for
		for (String fruit : set) {
			System.out.println(fruit);
		}
		set.clear(); // clear는 전체 내용 지움
		set.remove("Apple"); // remove는 선택한 것만 지움

		if (set.isEmpty()) {

			System.out.println("set 비어있음.");
		}

		// 크기 : 값이 같으면 중복 제외한 크기
		System.out.println("set 크기 : " + set.size());

		// HashSet : 중복된 값을 받지 않기에 로또에서 같은 값이 나오지 않는다.
		Set<Integer> lotto = new HashSet<>();
		// 1 ~ 10 임의의 번호를 lotto 저장
		while(lotto.size()< 5) {
			int temp = (int) (Math.random() * 10) + 1;
			System.out.println(temp);
			lotto.add(temp);
		}
		System.out.println(lotto);
		
	}
}
