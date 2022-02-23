package practice2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class bj_10026_적록색약 {
	static int[] dr = { 1, 0, -1, 0 };
	static int[] dc = { 0, 1, 0, -1 };
	static int N;
	static boolean[][] v;
	static char[][] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		arr = new char[N][N];
		v = new boolean[N][N];
		for (int r = 0; r < arr.length; r++) {
			String s = sc.next();
			for (int c = 0; c < arr.length; c++) {
				arr[r][c] = s.charAt(c);
			}
		}

		// print(arr);
		int cnt = 0;
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr.length; c++) {
				if (!v[r][c]) {
					
					dfs(r, c, arr[r][c]);
					cnt++;
				}
			}
		}
		System.out.print(cnt + " ");

		v = new boolean[N][N];
		cnt = 0;
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr.length; c++) {
				if (!v[r][c]) {
					dfs2(r, c, arr[r][c]);
					cnt++;
				}
			}
		}
		System.out.println(cnt);

	}

	private static void dfs2(int r, int c, char value) {
		for (int d = 0; d < 4; d++) {
			int nr = r + dr[d];
			int nc = c + dc[d];
			if (value == 'B') {
				if (nr >= 0 && nr < N && nc >= 0 && nc < N && arr[nr][nc] == value && !v[nr][nc]) {
					v[nr][nc] = true;
					dfs2(nr, nc, value);
				}
			}else {
				if (nr >= 0 && nr < N && nc >= 0 && nc < N && (arr[nr][nc] == 'R' || arr[nr][nc] == 'G')
						&& !v[nr][nc]) {
					v[nr][nc] = true;
					dfs2(nr, nc, value);
				}
			}
		}
	}

	private static void dfs(int r, int c, char value) {
		for (int d = 0; d < 4; d++) {
			int nr = r + dr[d];
			int nc = c + dc[d];
			if (nr >= 0 && nr < N && nc >= 0 && nc < N && arr[nr][nc] == value && !v[nr][nc]) {
				v[nr][nc] = true;
				dfs(nr, nc, value);
			}
		}

	}

	private static void print(char[][] arr) {
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr.length; c++) {
				System.out.print(arr[r][c] + " ");
			}
			System.out.println();
		}
	}

}
