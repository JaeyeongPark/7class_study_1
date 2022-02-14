package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class sw6958 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream("s_input.txt"));
		int T =sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt(); // 사람수
			int M = sc.nextInt(); // 채점 결과
			int max=0;
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			
			// 입력
			for (int i = 1; i <= N; i++) {
				int cnt = 0;
				for (int j = 1; j <= M; j++) {
					// 맞았으면
					if(sc.nextInt()==1) {
						cnt++;
					}
				}
				// 가장 많이 푼 문제수 기록
				max = Math.max(max, cnt);
				// i번째 사람당 푼 문제 저장
				map.put(i, cnt);
			}
			
			int tmp=0;
			// max값 몇 명?
			for (int i = 1; i <= N; i++) {
				if (max==map.get(i)) {
					tmp++;
				}
			}
			
			System.out.printf("#%d %d %d\n", tc, tmp, max);
			
		}
	}
}
