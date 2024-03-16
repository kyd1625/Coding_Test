import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
		Arrays.sort(lost);
		Arrays.sort(reserve);
		int count = 0;
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j]) {
					System.out.println("lost : " + lost[i]);
					System.out.println("reserve : " + reserve[j]);
					count++;
					reserve[j] = -1;
					lost[i] = -3;
					break;

				}
			}
		}
		
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if(lost[i] == reserve[j] + 1 || lost[i] == reserve[j] - 1) {
					count++;
					reserve[j] = -1;
					break;
				}
			}
		}

		return answer + count;
    }
}