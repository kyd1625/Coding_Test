class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

		String temp = "";

		for (int i = 0; i < s.length(); i++) {
			
			if(!temp.contains(s.substring(i, i+1))) {
				answer[i] = -1;
			} else {
				answer[i] = i - temp.lastIndexOf(s.charAt(i));
			}
			
			temp += s.charAt(i);

		}

		return answer;
    }
}