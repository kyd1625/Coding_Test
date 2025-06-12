class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = schedules.length;
		int tempStartday = startday;

		for (int i = 0; i < schedules.length; i++) {
			schedules[i] = schedules[i] + 10; // 10분 추가

			if (schedules[i] % 100 >= 60) {
				schedules[i] = schedules[i] + 40; // 60분이 되었을때 1시간으로
			}
			
			startday = tempStartday;
			
			for (int j = 0; j < timelogs[i].length; j++) {
				if (schedules[i] < timelogs[i][j] && startday != 6 && startday != 7) { // 10분 초과 지각시
					answer--;
					break;
				} else {
					startday++;
					if (startday > 7)
						startday = 1;
				}
			}
		}

		return answer;
    }
}