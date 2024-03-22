import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        int temp;
        for(int i = 0; i < a.length(); i++) {
        		temp = (int)a.charAt(i);
        	if(a.charAt(i) >= 65 && a.charAt(i) <= 90) { // 대문자 A 65 Z 90 아스키코드
        		result += (char)(temp + 32);
        	} else {
        		result += (char)(temp - 32);
        	}
        }
        
        System.out.println(result);
        
    }
}