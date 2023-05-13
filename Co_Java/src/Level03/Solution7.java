package Level03;

class Solution7 {
	public int solution(int numApple, int numCarrot, int k) {
		int answer = 0;
        
		if(numApple < 3 * numCarrot)	// 사과의 갯수가 적어
			answer = numApple / 3;		// 사과를 3으로 나눈 것이 주스잔 수가 됨
		else							// 사과가 적지 않으면 당근의 갯수 체크 필요
			answer = numCarrot;			// 당근의 객수가 주스의 잔수가 됨
        
		numApple -= 3 * answer;
		numCarrot -= answer;

		for(int i = 0; k - (numApple + numCarrot + i) > 0; i++)
			if(i % 4 == 0)
				answer++;
		return answer;
	}
    
	public static void main(String[] args) {
		Solution7 sol = new Solution7();
		
		int numApple1 = 5;
		int numCarrot1 = 1;
        int k1 = 2;
        int ret1 = sol.solution(numApple1, numCarrot1, k1);
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");
        
        int numApple2 = 10;
        int numCarrot2 = 5;
        int k2 = 4;
        int ret2 = sol.solution(numApple2, numCarrot2, k2);
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}