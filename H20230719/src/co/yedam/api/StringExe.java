package co.yedam.api;

public class StringExe {
	public static void main(String[] args) {
		String str = "Hello World Nice";
		// split 공백 한칸을 기준으로 배열로 만들어 줌
		String[] strAry = str.split(" ");
		int cnt = 0;
		for (String word : strAry) {
			System.out.println(word);
			// indexOf 찾고 싶은 문자열을 찾아줌
			if (word.indexOf("o") > -1) {
				cnt++;
			}
		}
		System.out.println("o 를 포함한 단어수: " + cnt);
	}
}
