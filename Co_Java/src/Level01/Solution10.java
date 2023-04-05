package Level01;

class Solution10 {
	public int solution(int[] data) {
		double total = 0;
		int len = data.length;
		for(int i = 0; i < len; i++) 
			total += data[i];
		int cnt = 0;
		double average = (double)total/(double)len; 
		for(int i = 0; i < len; i++)
			if(data[i] < average)
				cnt++;
		return cnt;
	}

	public static void main(String[] args) {
		Solution10 sol = new Solution10();
		int[] data1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int ret1 = sol.solution(data1);
		
		System.out.println("Solution: return value of the method is " + ret1 + ".");

		int[] data2 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 10};
		int ret2 = sol.solution(data2);

		System.out.println("Solution: return value of the method is " + ret2 + ".");
	}

}
