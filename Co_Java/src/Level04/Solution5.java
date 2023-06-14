package Level04;

public class Solution5 {
	public int solution(int[] calorie) {
        int minCal = 9999;
        int answer = 0;
        for(int i=0; i<calorie.length; i++) {
            if(calorie[i] > minCal)
                answer += calorie[i] - minCal;
            else
                minCal = calorie[i];
        }
        return answer;
    }
    
    public static void main(String[] args) {
        Solution5 sol = new Solution5();
        int[] calorie = {713, 665, 873, 500, 751};
        int ret = sol.solution(calorie);
        
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}

