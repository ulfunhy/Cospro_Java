package Level01;

import java.util.Arrays;

class Solution1{
	public int[] solution(String shirt_size[]) {
		int[] size_sounter = new int [6];
		for(int i=0; i<shirt_size.length; i++) {
			if(shirt_size[i].equals("XS")) size_sounter[0]++;
			else if(shirt_size[i].equals("S")) size_sounter[1]++;
			else if(shirt_size[i].equals("M")) size_sounter[2]++;
			else if(shirt_size[i].equals("L")) size_sounter[3]++;
			else if(shirt_size[i].equals("XL")) size_sounter[4]++;
			else if(shirt_size[i].equals("XXL")) size_sounter[5]++;
		}
		return size_sounter;
	}

	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		String shirtSize [] = {"XS", "S", "L", "L","XL", "S"};
		int[] ret = sol.solution(shirtSize);
		
		System.out.println("Solution: return value of the method is " + Arrays.toString(ret) + ".");
	}
}