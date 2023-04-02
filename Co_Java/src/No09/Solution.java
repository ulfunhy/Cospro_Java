package No09;

class Solution {
	public String solution(String charcators) {
		String result = "";
		result += charcators.charAt(0);
		for(int i = 0; i < charcators.length()-1; i++)
			if(charcators.charAt(i) != charcators.charAt(i+1))
				result += charcators.charAt(i+1);
		return result;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		String charcators = "senteeencccceee";
		String ret = sol.solution(charcators);
		System.out.println("Solution: return value of the method is " + ret + ".");

	}

}
