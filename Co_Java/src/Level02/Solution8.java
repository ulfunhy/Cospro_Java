package Level02;

class Solution8 {	// number : 29022531
	public int solution(int number) {
		int count = 0;	// 소수의 개수를 누적할 변수
    	while(number >= 0){
    		int n = number % 10;	// 맨끝 "일의 자리" 취함
        	if (n == 2 || n == 3 || n == 5 || n == 7)
            	count += 1;
        	number /= 10;	// 나누고 몫(10의 단위)만 다시 올리기(다시 나눔)
    	}
    	return count;
	}

	public static void main(String[] args) {
		Solution8 sol = new Solution8();
		int number = 29022531;
		int ret = sol.solution(number);

		System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}
}