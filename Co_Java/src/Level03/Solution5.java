package Level03;

public class Solution5 {
	public int solution(int[] memberAge, String transportation) {
		int adultExpense = 0;
		int childExpense = 0;

		if(transportation.equals("Bus")) {
			adultExpense = 40000;
			childExpense = 15000;
		}
		else if(transportation.equals("Ship")) {
			adultExpense = 30000;
			childExpense = 13000;
		}
		else if(transportation.equals("Airplane")) {
			adultExpense = 70000;
			childExpense = 45000;
		}

		if(memberAge.length >= 10) {
			adultExpense = (adultExpense / 10) * 9;	// (1-0.1)
			childExpense = (childExpense / 10) * 8;	// (1-0.2)
		}

		int totalExpenses = 0;
		for(int i = 0; i < memberAge.length; i++) {
			if(memberAge[i] > 19)
				totalExpenses += adultExpense;
			else
				totalExpenses += childExpense;
		}
	
		return totalExpenses;
	}
    
	public static void main(String[] args) {
		Solution5 sol = new Solution5();
		int[] memberAge1 = {13, 33, 45, 11, 20};
		String transportation1 = "Bus";
		int result1 = sol.solution(memberAge1, transportation1);
        
		System.out.println(transportation1 + "의 교통비의 총 합은 " + result1 + "원 입니다.");
        
		int[] memberAge2 = {25, 11, 27, 56, 7, 19, 52, 31, 77, 8};
		String transportation2 = "Ship";
		int result2 = sol.solution(memberAge2, transportation2);

		System.out.println(transportation2 + "의 교통비의 총 합은 " + result2 + "원 입니다.");
	}
}