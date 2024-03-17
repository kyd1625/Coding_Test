
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        
        for(String name : participant) {
//        	if(map.containsKey(name) == false) {
//        		map.put(name, 0);
//        	}
//        	map.put(name, map.get(name) + 1);
        	// 위에 4줄을 한줄로 줄이는 방법
        	map.put(name, map.getOrDefault(name, 0) + 1);
        }
        
        for(String name : completion) {
        	int num = map.get(name) - 1;
        	if (num == 0) {
        		map.remove(name);
        	} else {
        		map.put(name, num);
        	}
        }
        
        return map.keySet().iterator().next();
    }
    

}
