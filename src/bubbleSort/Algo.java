package bubbleSort;


import java.util.Arrays;

public class Algo {

	public static void main(String[] args) {
		int[] aa = {1,2,11,4,33,6,7,8};
		int temp;
		for (int i : aa) {
			System.out.println("정렬전 : " + i);
		}
		for (int i = aa.length; i > 0; i--) {
			for (int j = 0; j < i-1; j++) {
				if (aa[j] > aa[j+1]) {
					temp = aa[j+1];
					aa[j+1] = aa[j];
					aa[j] = temp;
				}
			}
		}
		System.out.println("//////////////////////////");
		for (int i : aa) {
			System.out.println("정렬후 : " + i);
		}
		
	}
}