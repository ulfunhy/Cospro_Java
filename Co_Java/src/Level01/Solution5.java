package Level01;

import java.util.Arrays;

class Solution5 {

	public int[] solution(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		while(left<right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		Solution5 sol = new Solution5();
		int[] arr = {1, 4, 2, 3};
		int[] ret = sol.solution(arr);
		
		System.out.println("Solution: return value of the method is " + Arrays.toString(ret) + " .");
	}

}
