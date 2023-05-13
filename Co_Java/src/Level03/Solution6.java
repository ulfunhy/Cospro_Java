package Level03;

public class Solution6 {
	public String Solution(int tileLength) {
		String answer ="";
		String com = "RRRGGB";
		if(tileLength % 6 == 1 || tileLength % 6 == 2 || tileLength % 6 == 4) 
			answer = "-1";
        else 
            for(int i = 0; i < tileLength; i++)
                answer += com.charAt(i%6);
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution6 sol = new Solution6();
        
        int tileLength1 = 11;
        String ret1 = sol.Solution(tileLength1);
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int tileLength2 = 16;
        String ret2 = sol.Solution(tileLength2);
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}