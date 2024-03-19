import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] friends, String[] gifts) {
         int answer = 0;
        
        Map<String, Integer> friendIndex = new HashMap();
        int[] giftScore = new int[friends.length];
        int[][] gift = new int[friends.length][friends.length];
        
        for(int i = 0; i < friends.length; i++) { // 이름을 key로 한 Index 초기화
        	friendIndex.put(friends[i], i);
        }
        
        for(int i = 0; i < gifts.length; i++) { 
        	String[] temp = gifts[i].split(" ");
        	giftScore[friendIndex.get(temp[0])] += 1; // 선물점수 산출
        	giftScore[friendIndex.get(temp[1])] -= 1; // 선물점수 산출
        	gift[friendIndex.get(temp[0])][friendIndex.get(temp[1])] += 1; // Index로 주고 받은 선물 갯수 저장
        }
        
        for(int i = 0; i < friends.length; i++) {
        	int nextMonthGift = 0;
        	for(int j = 0; j < friends.length; j++) {
        		
        		if(i == j) {continue;} // 동일인에게 선물 할 수 없음
        		
        		if(gift[i][j] > gift[j][i]) { // 서로 선물준 갯수 비교
        			nextMonthGift++;
        		} else if (gift[i][j] == gift[j][i] && giftScore[i] > giftScore[j]) {// 같으면 선물점수 비교
        			nextMonthGift++;
        		}
        		
        	}
        	
        	if(answer < nextMonthGift) {
        		answer = nextMonthGift;
        	}
        }
        
        
        return answer;
    }
}