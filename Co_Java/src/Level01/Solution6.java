package Level01;

import java.util.Arrays;

class Solution6 {
	public int solution(int number) {
		int count = 0;
		for(int i = 1; i <= number; i++) {
			int current = i;
			int temp = ;
			while(current != 0) {
				if() {
					count++;
					System.out.print("pair");
				}
				current++;
			}
			if(temp == count)
				System.out.print(i);
			System.out.print(" ");
		}
		System.out.println();
		return count;
	}
	public static void main(String[] args) {
		Solution sol = new Solution();
		int number = 40;
		int ret = sol.solution(number);
	
		System.out.println("Solution: return value of the method is " + ret + " .");

	}

}
