package Level02;

class Solution6 {
    public int solution(int[] floors) {
        int dist = 0;
        int length = floors.length;
        for(int i = 0; i<length-1; i++){
        	dist+=Math.abs(floors[i]-floors[i+1]);
        }
        return dist;
    }

	public static void main(String[] args) {
        Solution6 sol = new Solution6();
        int[] floors = {1, 2, 5, 4, 2};
        int ret = sol.solution(floors);

        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");

	}

}