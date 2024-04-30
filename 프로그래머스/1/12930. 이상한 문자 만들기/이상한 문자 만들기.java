class Solution {
    public String solution(String s) {
       String answer = "";

		String[] array = s.split("");
		
		array[0] = array[0].toUpperCase();
		int idx = 0;
		for(String result : array) {
			if(result.equals(" ")) {
				idx = 0;
			} else if (idx % 2 == 0) {
				result = result.toUpperCase();
				idx++;
			} else if (idx % 2 == 1) {
				result = result.toLowerCase();
				idx++;
			}
			answer += result;
			
		}
		
		return answer;
    }
}