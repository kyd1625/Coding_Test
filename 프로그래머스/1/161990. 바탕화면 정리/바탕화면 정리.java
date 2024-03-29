class Solution {
    public int[] solution(String[] wallpaper) {
         int[] answer = new int[4];
        
        char[][] desktop = new char[wallpaper.length][wallpaper[0].length()];
        int arrSize = 0;
        for(int i = 0; i < desktop.length; i++) {
        	for(int j = 0; j < desktop[0].length; j++) {
        		if(wallpaper[i].charAt(j) == '#') {
        			arrSize++;
        		}
        	}
        }
        int[][] fileLocation = new int[arrSize][2];
        
        // 2차원 배열로 초기화
        int temp = 0;
        for(int i = 0; i < desktop.length; i++) {
        	for(int j = 0; j < desktop[0].length; j++) {
        		if(wallpaper[i].charAt(j) == '#') {
        				fileLocation[temp][0] = i;
            			fileLocation[temp][1] = j;
            			temp++;
        		}
        	}
        }
        
        int minX = 100;
        int minY = 100;
        int maxX = -1;
        int maxY = -1;
        
        for(int i = 0; i < fileLocation.length; i++) {
        	minX = Math.min(minX, fileLocation[i][0]);
        	minY = Math.min(minY, fileLocation[i][1]);
        	maxX = Math.max(maxX, fileLocation[i][0]);
        	maxY = Math.max(maxY, fileLocation[i][1]);
        }
        
        answer[0] = minX;
        answer[1] = minY;
        answer[2] = maxX + 1;
        answer[3] = maxY + 1;
        

        
        
        
        return answer;
    }
}