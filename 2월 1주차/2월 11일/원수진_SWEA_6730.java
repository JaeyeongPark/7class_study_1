package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sw6730 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream("6730.txt"));
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int Increase = 0;
			int decrease = 0;
			int[] arr = new int[N];
			
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			
			for (int i = 0; i < arr.length-1; i++) {
				// 올라갈 때 
				if (arr[i]<arr[i+1]) {
					Increase = Math.max(Increase, arr[i+1]-arr[i]);
				}
				// 내려갈 때
				else if(arr[i]>arr[i+1]){
					decrease = Math.max(decrease, arr[i]-arr[i+1]);
				}
			}
			
			System.out.printf("#%d %d %d\n", tc, Increase, decrease);
		}

	}

}
