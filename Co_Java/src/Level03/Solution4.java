package Level03;

public class Solution4 {
	public int solution(String[] words, String word) {
		int count = 0;	// 오루 횟수 구하는 변수
		for(int i = 0; i < words.length; i++) {		// 문자열 배열 반복
			for(int j = 0; j < word.length(); j++) {	// CODE 문자열에서 한글자씩 반복
				if(words[i].charAt(j) != word.charAt(j))
					count++;
			} // j
		} // i
		return count;
	}
    
	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		String[] words = {new String("CODE"), new String("COED"), new String("CDEO")};
		String word = new String("CODE");
		int ret = sol.solution(words, word);
        
		System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}