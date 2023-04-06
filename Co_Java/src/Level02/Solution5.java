package Level02;

class Solution5 {
	public int solution(int attack, int recovery, int hp) {
		int count = 0;
		while(true) {
			count += 1;
			hp -= attack;
			if(hp <= 0)
				break;
			hp += recovery;
		}
		return count;
	}

	public static void main(String[] args) {
		Solution5 sol = new Solution5();
		int attack = 30;
		int recovery = 10;
		int hp = 60;
		int ret = sol.solution(attack, recovery, hp);
		System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
		System.out.println("따라서 최소 " + ret + "번 공격해야 몬스터를 잡을 수 있습니다.");
	}

}
