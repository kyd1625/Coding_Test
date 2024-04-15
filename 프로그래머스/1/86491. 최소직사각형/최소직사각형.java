import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int[] garo = new int[sizes.length];
		int[] sero = new int[sizes.length];

		for (int i = 0; i < sizes.length; i++) {
			garo[i] = sizes[i][0];
			sero[i] = sizes[i][1];
		}

		System.out.println(Arrays.toString(garo));
		System.out.println(Arrays.toString(sero));

		for (int i = 0; i < sizes.length; i++) {
			if (garo[i] < sero[i]) {
				int temp = garo[i];
				garo[i] = sero[i];
				sero[i] = temp;
			}
		}
		System.out.println(Arrays.toString(garo));
		System.out.println(Arrays.toString(sero));

		int a = garo[0];
		int b = sero[0];
		for (int i = 0; i < sizes.length; i++) {
			if (a < garo[i]) {
				a = garo[i];
			}
			if (b < sero[i]) {
				b = sero[i];
			}
		}
		System.out.println(a);
		System.out.println(b);

		return a*b;
    }
}