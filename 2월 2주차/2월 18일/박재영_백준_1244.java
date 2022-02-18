package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_1244_스위치켜고끄기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] sw = new int[N];
		for (int i = 0; i < N; i++) {
			sw[i] = Integer.parseInt(st.nextToken());
		}

		int snum = Integer.parseInt(br.readLine());

		int[] gender = new int[snum];
		int[] student = new int[snum];
		for (int i = 0; i < snum; i++) {
			st = new StringTokenizer(br.readLine());
			gender[i] = Integer.parseInt(st.nextToken());
			student[i] = Integer.parseInt(st.nextToken());
		}

		/*
		 * System.out.println(N); for (int i = 0; i < sw.length; i++) {
		 * System.out.print(sw[i]+" "); } System.out.println();
		 * System.out.println(snum); for (int i = 0; i < snum; i++) {
		 * System.out.print(gender[i]+" "); System.out.print(student[i]+" ");
		 * System.out.println(); }
		 */

		// 학생 수만큼 반복
		for (int i = 0; i < snum; i++) {
			// 스위치 수만큼 반복

			// 남학생일때
			if (gender[i] == 1) {
				for (int j = 1; j <= N; j++) {
					if (j % student[i] == 0) {
						if (sw[j - 1] == 1) {
							sw[j - 1] = 0;
						} else {
							sw[j - 1] = 1;
						}
					}
				}
				for (int j = 0; j < sw.length; j++) {
					System.out.print(sw[j]+" ");
				}
				System.out.println();
			} else if (gender[i] == 2) { // 여학생일때
				int flag = 0;
				for (int j = 1; j < student[i]; j++) {
					if ((student[i]-j-1>=0) && (student[i]+j-1<sw.length) && sw[student[i]-j-1] == sw[student[i]+j-1]) {
						flag = j;
					} else {
						break;
					}
				}
				for (int j = student[i]-flag; j <= student[i]+flag; j++) {
					if (sw[j - 1] == 1) {
						sw[j - 1] = 0;
					} else {
						sw[j - 1] = 1;
					}
				}
				for (int j = 0; j < sw.length; j++) {
					System.out.print(sw[j]+" ");
				}
				System.out.println();
			}
		}
		for (int i = 1; i <= sw.length; i++) {
			System.out.print(sw[i-1]+" ");
			if(i!=0 && i%20 == 0) {
				System.out.println();
			}
		}
		System.out.println();


	}

}
