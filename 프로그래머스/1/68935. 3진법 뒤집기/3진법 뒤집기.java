class Solution {
    public int solution(int n) {
		int answer = 0;

		StringBuffer str = new StringBuffer();
		while (n >= 3) {
			str.insert(0, (n % 3));
			n = n / 3;
		}

		str.insert(0, n);

		str.reverse();
		answer = Integer.parseInt(str.toString(), 3);

		return answer;
	}
}