import java.util.List;
import java.util.ArrayList;
class Solution {
    public long[] solution(int x, int n) {
         
        List<Long> list = new ArrayList<Long>();
        
        for(int i = 1; i <= n; i++) {
        	list.add((long) i * x);
        }
        long[] answer = new long[list.size()];
        for(int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
}