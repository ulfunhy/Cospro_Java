package No07;

class Solution {
	
	public int solution(int[] scores) {
		int count = 0;
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] >= 650 && scores[i] < 800) {
				count += 1;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] scores = {650, 722, 914, 558, 714, 803, 650, 679, 669, 800};
		int ret = sol.solution(scores);
		System.out.println("Solution: return value of the method is " + ret + " .");

	}

}
