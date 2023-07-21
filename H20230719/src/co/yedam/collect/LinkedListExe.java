package co.yedam.collect;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExe {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		List<String> lnk = new LinkedList<>();
		long start = System.currentTimeMillis();
		start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			list.add(0, String.valueOf(i));
		}
		// ArrayList는 중간에 삭제되는 공간을 채우기 위해 더 걸림 0 1 2 <- 3 4 5
		long end = System.currentTimeMillis();
		System.out.println("ArrayList 걸린 시간: " + (end - start));
		
		// LinkList는 중간에 삭제되는 공간을 넘기고 하기 때문에 빠름 0 1 2 4 5
		start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			lnk.add(0, String.valueOf(i));
		}
		
		end = System.currentTimeMillis();
		System.out.println("LinkList 걸린 시간: " + (end - start));
	}
}
