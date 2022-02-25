package practice;

import java.util.Scanner;

public class bj_2567_색종이2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] R = new int[N];
		int[] C = new int[N];
		int[][] map = new int[100][100];
		int[][] mcopy = new int[100][100];
		int cnt = 0;

		for (int i = 0; i < N; i++) {
			C[i] = sc.nextInt();
			R[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			for (int r = 99 - R[i]; r > 89 - R[i]; r--) {
				for (int c = C[i]; c < C[i] + 10; c++) {
					map[r][c] = 1;
				}
			}
		}

		// 맵 복사
		for (int r = 0; r < 100; r++) {
			for (int c = 0; c < 100; c++) {
				mcopy[r][c] = map[r][c];
			}
		}
		// 세로 테두리 선만 남기고 삭제
		for (int r = 0; r < mcopy.length; r++) {
			for (int c = 0; c < mcopy.length; c++) {
				if (mcopy[r][c] == 1) {
					int nc = c;
					while ((nc + 1 < 100) && mcopy[r][nc + 1] == 1) {
						mcopy[r][nc + 1] = 0;
						nc++;
					}
					mcopy[r][nc] = 1;

				}
			}
		}
		// 세로 길이 합
		for (int r = 0; r < 100; r++) {
			for (int c = 0; c < 100; c++) {
				cnt += mcopy[r][c];
			}
		}

		// 맵 복사
		for (int r = 0; r < 100; r++) {
			for (int c = 0; c < 100; c++) {
				mcopy[r][c] = map[r][c];
			}
		}
		// 가로 테두리 선만 남기고 삭제
		for (int c = 0; c < mcopy.length; c++) {
			for (int r = 0; r < mcopy.length; r++) {
				if (mcopy[r][c] == 1) {
					int nr = r;
					while ((nr + 1 < 100) && mcopy[nr+1][c] == 1) {
						mcopy[nr+1][c] = 0;
						nr++;
					}
					mcopy[nr][c] = 1;

				}
			}
		}
		// 가로 길이 합
		for (int r = 0; r < 100; r++) {
			for (int c = 0; c < 100; c++) {
				cnt += mcopy[r][c];
			}
		}

		//print(mcopy);
		
		System.out.println(cnt);

	}

	private static void print(int[][] map) {
		for (int r = 0; r < 100; r++) {
			for (int c = 0; c < 100; c++) {
				System.out.print(map[r][c] + " ");
			}
			System.out.println();
		}

	}

}
