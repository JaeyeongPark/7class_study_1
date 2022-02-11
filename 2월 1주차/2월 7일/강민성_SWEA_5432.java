/*
 * SWEA 5432. 쇠막대기 자르기
 */

package difficulty04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class S5432 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("./input/difficulty04/input_5432.txt")));
		int T = Integer.parseInt(in.readLine());
		
		for(int test_case = 1; test_case <= T; test_case++) {
			char[] input = in.readLine().toCharArray();
			int ans = 0;
			int cnt = 0;
			
			for(int i = 0; i < input.length - 1; i++) {
				if(input[i] == '(' && input[i+1] == ')') { // 레이저인 경우
					ans += cnt;
				} else if(input[i] == '(') { // 막대의 시작인 경우
					cnt++;
				} else if(input[i] == ')' && input[i+1] == ')') { // 막대의 끝인 경우
					cnt--;
					ans++;
				}
			}
			System.out.printf("#%d %d\n", test_case, ans);
		}
		in.close();
	}
}
