package SWEA;

import java.util.Iterator;
import java.util.Scanner;

public class sw1289 {
	 public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 int T = sc.nextInt();
		 
		 for (int tc = 1; tc <= T; tc++) {
			String num = sc.next();
			int cnt = 0;
			int[] arr = new int[num.length()];
			int[] arr2 = new int[arr.length];
	 		
			for (int i = 0; i < num.length(); i++) {
				int tmp = num.charAt(i)-'0';
				arr[i] = tmp;
			}
			
			for (int i = 0; i < arr2.length; i++) {
				if(arr2[i]!=arr[i]) {
					for (int j = i; j < arr2.length; j++) {
						arr2[j] = arr[i];
					}
					cnt++;
				}
			}
			System.out.println("#"+tc+" "+cnt);
		}
		 
	}
}
