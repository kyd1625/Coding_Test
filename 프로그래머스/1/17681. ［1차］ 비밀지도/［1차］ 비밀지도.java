import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];

		for (int i = 0; i < arr1.length; i++) {
			StringBuffer arr1Str = new StringBuffer();
			StringBuffer arr2Str = new StringBuffer();
			arr1Str.append(Integer.toString(arr1[i], 2));
			arr2Str.append(Integer.toString(arr2[i], 2));

//			long a = (Integer.parseInt(arr1Str.toString()) + Integer.parseInt(arr2Str.toString()));
			long a = (Long.parseLong(arr1Str.toString()) + Long.parseLong(arr2Str.toString()));

			answer[i] = String.valueOf(a);
			if (answer[i].length() < n) {
				while (answer[i].length() < n) {
					answer[i] = "0" + answer[i];
				}
			}
			answer[i] = answer[i].replaceAll("[^0]", "#");
			answer[i] = answer[i].replaceAll("[0]", " ");
			
		}

		return answer;
	}

}