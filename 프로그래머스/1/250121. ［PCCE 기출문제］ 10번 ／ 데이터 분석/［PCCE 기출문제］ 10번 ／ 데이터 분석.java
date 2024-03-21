import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int answer[][] = {};
        
        // ext와 sort_by의 값은
        // "code" - 코드번호
        // "date" - 제조일
        // "maximum" - 최대 수량
        // "remain" - 현재 수량
        
        // ext값으로 val_ext 이하 데이터 가져오기 -> 가져온 데이터 sort_by값으로 오름차순 정렬하기
        
        int extIndex = 0;
        
        switch(ext) { // ext를 Index화
        case "code" : extIndex = 0;
        break;
        case "date" : extIndex = 1;
        break;
        case "maximum" : extIndex = 2;
        break;
        case "remain" : extIndex = 3;
        break;
        }
        
       
        int k = 0;
        for(int i = 0; i < data.length; i++) {
        	if(data[i][extIndex] <= val_ext) { // val_ext 이하값 자르기
        		k++;
        	}
        	
        }
        
        answer = new int[k][4];
        
        int j = 0;
        for(int i = 0; i < data.length; i++) {
        	if(data[i][extIndex] <= val_ext) { // val_ext 이하값 자르기
        		
        		answer[j][0] = data[i][0];
        		answer[j][1] = data[i][1];
        		answer[j][2] = data[i][2];
        		answer[j][3] = data[i][3];
        		j++;
        	}
        }
       
        
        int tempIndex = 0;

        switch(sort_by) { // sort_by를 Index화
        case "code" : tempIndex = 0;
        break;
        case "date" : tempIndex = 1;
        break;
        case "maximum" : tempIndex = 2;
        break;
        case "remain" : tempIndex = 3;
        break;
        }
        
        final int sortIndex = tempIndex;
        
        Arrays.sort(answer, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[sortIndex] - o2[sortIndex];
			}
		});
        
        
        return answer;
    }
}