package Level02;

class Solution1 {
	final int max_product_number = 10;
	
	public int[] func_a(int[] arr) {
		int[] counter = new int[max_product_number+1];
		for(int i = 0; i < arr.length; i++)
			counter[arr[i]] += 1;
		return counter;
	}

	public int solution(int[] left_gloves, int[] right_gloves) {
		int[] left_counter = func_a(left_gloves);
		int[] right_counter = func_a(right_gloves);
		int total = 0;
		for(int i = 1; i <= max_product_number; i++)
			total += Math.min(left_counter[i], right_counter[i]);
		return total;
	}
	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		int[] leftGloves = {2, 1, 2, 2, 4};
		int[] rightGloves = {1, 2, 2, 4, 4, 7};
		int ret = sol.solution(leftGloves, rightGloves);
		
		System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}

}
