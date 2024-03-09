import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
  public List solution(String today, String[] terms, String[] privacies) {
        List answer = new ArrayList();
        
        // today = 오늘 날짜
        // terms = 약관명과 유효기간
        // privacies = 동의 날짜와 약관명
        
        Map<String, Integer> termsMap = new HashMap<String, Integer>();
        for(int i = 0; i < terms.length; i++) {
        	String[] temp = terms[i].split(" ");
        	termsMap.put(temp[0], Integer.parseInt(temp[1]));
        }
        
        List privaciesList = new ArrayList();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        today = today.replace(".", "");
        LocalDate todayDate = LocalDate.parse(today, formatter);
        for(int i = 0; i < privacies.length; i++) {
        	
        	String[] temp = privacies[i].split(" ");
        	String tempDay = temp[0].replace(".", ""); // index 0 = 년 //1 = 월 //2 = 일
        	
             LocalDate date = LocalDate.parse(tempDay, formatter);
             
             LocalDate newDate = date.plusMonths(termsMap.get(temp[1]));
             
             privaciesList.add(newDate);
        
        }
        
        for(int i = 0; i < privaciesList.size(); i++) {
        	if(todayDate.isEqual((ChronoLocalDate) privaciesList.get(i)) || todayDate.isAfter((ChronoLocalDate) privaciesList.get(i))) {
        		answer.add(i+1);
        	}
        }
        
        
        
        
        return answer;
    }
}