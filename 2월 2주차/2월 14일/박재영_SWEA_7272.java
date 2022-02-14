package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class swea_7272 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());

		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			char[] arr1 = st.nextToken().toCharArray();
			char[] arr2 = st.nextToken().toCharArray();
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] == 'B') {
					arr1[i] = '2';
				} else if (arr1[i] == 'A' || arr1[i] == 'D' || arr1[i] == 'O' || arr1[i] == 'P' || arr1[i] == 'Q'
						|| arr1[i] == 'R') {
					arr1[i] = '1';
				} else {
					arr1[i] = '0';
				}
			}
			for (int i = 0; i < arr2.length; i++) {
				if (arr2[i] == 'B') {
					arr2[i] = '2';
				} else if (arr2[i] == 'A' || arr2[i] == 'D' || arr2[i] == 'O' || arr2[i] == 'P' || arr2[i] == 'Q'
						|| arr2[i] == 'R') {
					arr2[i] = '1';
				} else {
					arr2[i] = '0';
				}
			}
			if (Arrays.equals(arr1, arr2)) {
				System.out.println("#" + tc + " SAME");
			} else {
				System.out.println("#" + tc + " DIFF");
			}

		}
	}

}
