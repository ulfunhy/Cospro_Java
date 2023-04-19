package Level03;

import java.util.Arrays;

class Solution1_1 {
	 public int[] solution(int[] scores) {
		 int rank[] = new int[scores.length];

		 // 등수배열에 모두 1로 초기화
		 for(int i = 0; i < 4; i++) {
			 rank[i] = 1;
		 }
		 
		 // scores[i] 점수의 등수를 rank[i]에 정해서 저장
		 for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j < scores.length; j++) {
				if(scores[i] < scores[j]) {
					rank[i]++;
				}
			}
		 }
		 return rank;
	 }

	 public static void main(String[] args) {
		 
		 Solution1_1 sol = new Solution1_1();
		 int[] scores = {20, 60, 98, 59};		 
		 int[] ret = sol.solution(scores);
		 
		 System.out.println("점수" + Arrays.toString(scores));
		 
		 System.out.println("석차" + Arrays.toString(ret));
	 }
}