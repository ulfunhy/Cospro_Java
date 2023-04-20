package Level03;

import java.util.Arrays;

class Solution1_3 {
	public int[] solution(int[] scores) {
		int scores_length = scores.length; 
		int temp;
		 
		 // scores[i] 점수의 등수를 rank[i]에 정해서 저장
		 for(int i = 0; i < scores_length - 1; i++) {		// 0, 1, 2, 3 
			for(int j = i + 1; j < scores.length; j++) {	// i + 1~4
				if(scores[i] > scores[j]) {		// 오름차순, 내림차순 scores[i] < scores[j]
					temp = scores[i];
					scores[i] = scores[j];
					scores[j] = temp;
				}
			}
		 }
		 return scores;
	 }

	 public static void main(String[] args) {
		 
		 Solution1_3 sol = new Solution1_3();
		 int[] scores = {20, 60, 98, 59};		 
		 System.out.println("점수" + Arrays.toString(scores));		// 이 줄이 int[] ret = sol.solution(scores); 아래에 있으면 점수도 정렬되어 출력됨
		 
		 int[] ret = sol.solution(scores);
		 
		 System.out.println("정렬" + Arrays.toString(ret));
	 }
}