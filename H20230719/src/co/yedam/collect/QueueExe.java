package co.yedam.collect;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExe {
	public static void main(String[] args) {
		Queue<String> que = new LinkedList<>();
		
		que.offer("홍길동");
		que.offer("최길동");
		que.offer("전길동"); // 들어온 순서대로 출력됨
		
		while(!que.isEmpty()) {
			System.out.println(que.poll());
		}
	}
}
