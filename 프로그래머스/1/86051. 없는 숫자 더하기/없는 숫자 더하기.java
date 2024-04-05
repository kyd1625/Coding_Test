import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        List<Integer> arr = new ArrayList();
        for(int i = 0; i < 10; i++) {
        	arr.add(i);
        }
        
        for(int i = 0; i < numbers.length; i++) {
        	if(arr.contains(numbers[i])) {
        		arr.set((int) arr.get(numbers[i]), 0);
        	}
        }
       
        for(int i = 0; i < arr.size(); i++) {
        	if(arr.get(i) != 0) {
        		answer += arr.get(i);
        	}
        }
        
        
        return answer;
    }
}