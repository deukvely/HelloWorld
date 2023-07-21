package co.yedam.collect;

public class BoxExe {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set("오렌지");

		String result = box.get(); // 문자열이기에 Casting 해줄 필요 없음 (String) X 
		
		Box<Integer> ibox = new Box<Integer>();
		ibox.set(100);
		Integer iresult = ibox.get();

		System.out.println(iresult);
	}
}
