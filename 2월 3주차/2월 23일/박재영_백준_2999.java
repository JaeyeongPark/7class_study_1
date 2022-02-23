package practice;

import java.util.Arrays;
import java.util.Scanner;

public class bj_2999_비밀이메일 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] arr = str.toCharArray();
		int N = arr.length;
		int R = 0;
		int C = 0;

		// R값, C값 뽑아내기
		for (int i = 1; i <= N; i++) {
			for (int j = i; j <= N; j++) {
				if (i * j == N) {
					R = i;
					C = j;
				}
			}
		}
		/*
		 * AAA
		 * BBB
		 * CCC
		 */
		int idx = 0;
		char[][] arr2 = new char[R][C];
		for (int c = 0; c < C; c++) {
			for (int r = 0; r < R; r++) {
				arr2[r][c] = arr[idx];
				idx++;
			}
		}
		
		/*
		 * ABC
		 * ABC
		 * ABC
		 */
		idx = 0;
		for (int r = 0; r < R; r++) {
			for (int c = 0; c < C; c++) {
				arr[idx] = arr2[r][c];
				idx++;
			}
		}

		// System.out.println(R+" "+C);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

}
