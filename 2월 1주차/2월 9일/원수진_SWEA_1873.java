package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class sw1873 {
	static int[] dr = { -1, 1, 0, 0 }; // 업 다운 왼 오
	static int[] dc = { 0, 0, -1, 1 };
	static char[] tank = { '^', 'v', '<', '>' };

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("배틀.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			char[][] arr = new char[h][w];
			sc.nextLine();
			int x = 0;
			int y = 0;
			int dir = 0;

			for (int i = 0; i < h; i++) {
				String str = sc.nextLine();
				for (int j = 0; j < w; j++) {
					arr[i][j] = str.charAt(j);
					if (arr[i][j] == '^' || arr[i][j] == 'v' || arr[i][j] == '<' || arr[i][j] == '>') {
						if (arr[i][j] == '^') {
							dir = 0;
							x = i;
							y = j;
						} else if (arr[i][j] == 'v') {
							dir = 1;
							x = i;
							y = j;
						} else if (arr[i][j] == '<') {
							dir = 2;
							x = i;
							y = j;
						} else if (arr[i][j] == '>') {
							dir = 3;
							x = i;
							y = j;
						}
					}
				}
			}

			int n = sc.nextInt();
			String tmp = sc.next();
			String[] control = tmp.split("");
			int missile = 0;

			for (int i = 0; i < n; i++) {
				if (control[i].equals("U")) {
					dir = 0;
					arr[x][y] = tank[dir];
					if (x > 0 && arr[x + dr[dir]][y] == '.') {
						arr[x + dr[dir]][y] = arr[x][y];
						arr[x][y]='.';
						x += dr[dir];
					}
				} else if (control[i].equals("D")) {
					dir = 1;
					arr[x][y] = tank[dir];
					if (x < h - 1 && arr[x + dr[dir]][y] == '.') {
						arr[x + dr[dir]][y] = arr[x][y];
						arr[x][y]='.';
						x += dr[dir];
					}
				} else if (control[i].equals("L")) {
					dir = 2;
					arr[x][y] = tank[dir];
					if (y >0 && arr[x][y + dc[dir]] == '.') {
						arr[x][y + dc[dir]] = arr[x][y];
						arr[x][y]='.';
						y += dc[dir];
					}
				} else if (control[i].equals("R")) {
					dir = 3;
					arr[x][y] = tank[dir];
					if (y < w-1 && arr[x][y + dc[dir]] == '.') {
						arr[x][y + dc[dir]] = arr[x][y];
						arr[x][y]='.';
						y += dc[dir];
					}
				} else if (control[i].equals("S")) {
					if (dir == 0) {
						missile = x;
						while (true) {
							if (missile < 0 || arr[missile][y] == '#') {
								break;
							} else if (arr[missile][y] == '*') {
								arr[missile][y] = '.';
							
								break;
							}
							missile--;
						}							
					} else if (dir == 1) {
						missile = x;
						while (true) {
							if (missile > h-1 || arr[missile][y] == '#') {
								break;
							} else if (arr[missile][y] == '*') {
								arr[missile][y] = '.';
								break;
							}
							missile++;
						}
					} else if (dir == 2) {
						missile = y;
						while (true) {
							if (missile < 0 || arr[x][missile] == '#') {
								break;
							} else if (arr[x][missile] == '*') {
								arr[x][missile] = '.';
								break;
							}
							missile--;
						}
					} else if (dir == 3) {
						missile = y;
						while (true) {
							if (missile > w-1 || arr[x][missile] == '#') {
								break;
							} else if (arr[x][missile] == '*') {
								arr[x][missile] = '.';
								break;
							}
							missile++;
						}
					}
				}

			}
			
			System.out.printf("#%d ", tc);
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}

		}

	}
}
