import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        // 배열 자르기 -> 오름차순 정렬 -> k번째 숫자 구하기
		int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }
}