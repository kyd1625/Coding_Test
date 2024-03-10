import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;

		
		List<String> list = new ArrayList<>();
		list.add("zero");
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		list.add("six");
		list.add("seven");
		list.add("eight");
		list.add("nine");
		
		
//		--------------------------------------------------
		
		String str = s;
		for(int i = 0; i < 10; i++) {
			if(s.contains(list.get(i))) {
				str = str.replaceAll(list.get(i), String.valueOf(i));
			}
		}
		answer = Integer.parseInt(str);
		

		return answer;
    }
}