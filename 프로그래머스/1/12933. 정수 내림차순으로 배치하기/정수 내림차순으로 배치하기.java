import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;

		String[] nStr = String.valueOf(n).split("");
		Integer[] arr = new Integer[nStr.length];
		for (int i = 0; i < nStr.length; i++) {
			arr[i] = Integer.parseInt(nStr[i]);
		}
		Arrays.sort(arr, Collections.reverseOrder());

		for (int i = 0; i < arr.length; i++) {
			answer += arr[i] * Math.pow(10, arr.length - i);
		}
		

		return answer/10;
    }
}