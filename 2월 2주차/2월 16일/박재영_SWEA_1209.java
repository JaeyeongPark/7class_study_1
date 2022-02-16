package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_1209 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = 10;
		for (int tc = 1; tc <= T; tc++) {
			int ans = 0;
			int sum = 0;
			int test_case = Integer.parseInt(br.readLine());
			int[][] arr = new int[100][100];
			
			for (int i = 0; i < 100; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				sum = 0;
				for (int j = 0; j < 100; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
					sum += arr[i][j];
				}
				ans = Math.max(ans, sum);
			}
			
			for (int i = 0; i < 100; i++) {
				sum = 0;
				for (int j = 0; j < 100; j++) {
					sum += arr[j][i]; 
				}
				ans = Math.max(ans, sum);
			}
			
			sum = 0;
			for(int i =0 ;i <100;i++) {
				sum += arr[i][i];
			}
			ans = Math.max(ans, sum);
			
			sum = 0;
			for(int i =0 ;i <100;i++) {
				sum += arr[i][99-i];
			}
			ans = Math.max(ans, sum);
			
			
			
			
			/*
			for (int i = 0; i < 7; i++) {
				for (int j = 0; j < 7; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
			*/
			System.out.println("#"+tc+" "+ans);
			
		}
	}
}
