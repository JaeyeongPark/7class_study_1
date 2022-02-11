package practice;

import java.util.Scanner;
import java.io.FileInputStream;

public class 박재영_SWEA_4615 {

	static int[][] dir = { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, -1 }, { 0, 1 }, { 1, -1 }, { 1, 0 }, { 1, 1 } };
	 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
 
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
 
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[][] map = new int[N][N];
            int bcnt = 0;
            int wcnt = 0;
            // 1 : 흑돌 2 : 백돌
            map[N / 2 - 1][N / 2 - 1] = 2;
            map[N / 2 - 1][N / 2] = 1;
            map[N / 2][N / 2 - 1] = 1;
            map[N / 2][N / 2] = 2;
             
            /*
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    System.out.print(map[r][c]);
                }
                System.out.println();
            }
            System.out.println();
             */
            for (int i = 0; i < M; i++) {
                int C = sc.nextInt();
                int R = sc.nextInt();
                map[R - 1][C - 1] = sc.nextInt();
 
                boolean flag = false;
 
                // 1일 때
                if (map[R - 1][C - 1] == 1) {
                    for (int d = 0; d < 8; d++) {
                        int nr = R - 1 + dir[d][0];
                        int nc = C - 1 + dir[d][1];
 
                        while (nr >= 0 && nr < N && nc >= 0 && nc < N && map[nr][nc] == 2) {
                            nr += dir[d][0];
                            nc += dir[d][1];
                            if (nr >= 0 && nr < N && nc >= 0 && nc < N && map[nr][nc] == 1) {
                                flag = true;
                            }
                        }
                        if (flag == true) {
                            nr -= dir[d][0];
                            nc -= dir[d][1];
                            while (map[nr][nc] == 2) {
                                map[nr][nc] = 1;
                                nr -= dir[d][0];
                                nc -= dir[d][1];
                            }
                        }
                        flag = false;
                    }
                }
                // 2일때
                if (map[R - 1][C - 1] == 2) {
                    for (int d = 0; d < 8; d++) {
                        int nr = R - 1 + dir[d][0];
                        int nc = C - 1 + dir[d][1];
 
                        while (nr >= 0 && nr < N && nc >= 0 && nc < N && map[nr][nc] == 1) {
                            nr += dir[d][0];
                            nc += dir[d][1];
                            if (nr >= 0 && nr < N && nc >= 0 && nc < N && map[nr][nc] == 2) {
                                flag = true;
                            }
                        }
                        if (flag == true) {
                            nr -= dir[d][0];
                            nc -= dir[d][1];
                            while (map[nr][nc] == 1) {
                                map[nr][nc] = 2;
                                nr -= dir[d][0];
                                nc -= dir[d][1];
                            }
                        }
                        flag = false;
                    }
                }
             
            }
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    if(map[r][c] == 1) {
                        wcnt += 1;
                    }else if(map[r][c] == 2) {
                        bcnt += 1;
                    }
                }
            }
            System.out.println("#"+test_case+" "+wcnt+" "+bcnt);
 
        }
 
    }
}
