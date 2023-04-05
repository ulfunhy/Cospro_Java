package Level02;

class Solution4 {
	public String solution(String[] words) {
		String answer = "";
		for(int i = 0; i < words.length; i++) {
			if(words[i].length() >= 5)
				answer += words[i];
			if(answer == "")
				answer = "empty";
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		String[] words1 = {"my", "favorite", "color", "is", "violet"};
		String ret1 = sol.solution(words1);

		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");
		
		String[] words2 = {"yes", "i", "am"};
		String ret2 = sol.solution(words2);
		
		System.out.println("solution 메소드의 반환 값은 " + ret2 + "입니다.");
	}

}
