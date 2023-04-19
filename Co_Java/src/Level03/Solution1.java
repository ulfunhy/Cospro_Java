package Level03;

import java.util.*;

class Solution1 {
	// 점수배열에서 전달받은 score 점수와 같은 +1 전달
    int func_a(int[] scores, int score){	// 등수 리턴
        int length = scores.length;
        for(int rank = 0; rank < length; rank++)
            if(scores[rank] == score)
                return rank + 1;
        return 0;
    }

	// arr배열은 높은 성적순으로 정렬됨
    void func_b(int[] arr){
        Arrays.sort(arr);	// 오름차순정렬 20, 59, 60, 98
        int length = arr.length;
        int temp = 0;
        for(int i = 0; i < length / 2; i++){
            temp = arr[i];
            arr[i] = arr[(length - 1) - i];
            arr[(length - 1) - i] = temp;
        }	// 내림차순 정렬 98, 60, 59, 20
    }
    
    // arr배열에서 전달받은 n을 인덱스로 하는 값 전달
    int func_c(int[] arr, int n){
        return arr[n];
    }
    
    public int solution(int[] scores, int n) {
        int score = func_c(scores, n);	// scores[3] --> 59
        func_b(scores);			// 리턴이 없는 함수 호출 	arr배열은 높은 성적순으로 정렬됨
        int answer = func_a(scores, score);		// 등수리턴
        return answer;
    }
    
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        int[] scores = {20, 60, 98, 59};
        int n = 3;	// 인덱스 3, 위치 4 (59점의 등수)
        int ret = sol.solution(scores, n);

        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}