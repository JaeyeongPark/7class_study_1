package practice;

import java.util.Scanner;
import java.io.FileInputStream;


public class 박재영_SWEA_1873 {

	public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
 
        for (int test_case = 1; test_case <= T; test_case++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
 
            char[][] map = new char[H][W];
 
            for (int r = 0; r < H; r++) {
                String str = sc.next();
                for (int c = 0; c < W; c++) {
                    map[r][c] = str.charAt(c);
                }
            }
 
            int N = sc.nextInt();
            String str = sc.next();
 
            for (int i = 0; i < N; i++) {
                char move = str.charAt(i);
                int nr = 0;
                int nc = 0;
                // 탱크 위치 찾기
                for (int r = 0; r < H; r++) {
                    for (int c = 0; c < W; c++) {
                        if (map[r][c] == '<' || map[r][c] == '^' || map[r][c] == '>' || map[r][c] == 'v') {
                            nr = r;
                            nc = c;
                            break;
                        }
                    }
                }
                //슈팅
                if (move == 'S') {
                    if (map[nr][nc] == '<') {
                        for (int c = nc; c >= 0; c--) {
                            if (map[nr][c] == '*') {
                                map[nr][c] = '.';
                                break;
                            }else if(map[nr][c] == '#') {
                                break;
                            }
                        }
                    } else if (map[nr][nc] == '^') {
                        for (int r = nr; r >= 0; r--) {
                            if (map[r][nc] == '*') {
                                map[r][nc] = '.';
                                break;
                            }else if(map[r][nc] == '#') {
                                break;
                            } 
                        }
 
                    } else if (map[nr][nc] == '>') {
                        for (int c = nc; c < W; c++) {
                            if (map[nr][c] == '*') {
                                map[nr][c] = '.';
                                break;
                            }else if(map[nr][c] == '#') {
                                break;
                            } 
                        }
                    } else if (map[nr][nc] == 'v') {
                        for (int r = nr; r < H; r++) {
                            if (map[r][nc] == '*') {
                                map[r][nc] = '.';
                                break;
                            }else if(map[r][nc] == '#') {
                                break;
                            } 
                        }
                    }
                }
                 
                if (move == 'U') {
                    map[nr][nc] = '^';
                    if((nr-1)>=0 && map[nr-1][nc] == '.') {
                        map[nr][nc] = '.';
                        map[nr-1][nc] = '^';
                        nr -= 1;
                    }
                }
                if (move == 'D') {
                    map[nr][nc] = 'v';
                    if((nr+1)<H && map[nr+1][nc] == '.') {
                        map[nr][nc] = '.';
                        map[nr+1][nc] = 'v';
                        nr += 1;
                    }
                }
                if (move == 'L') {
                    map[nr][nc] = '<';
                    if((nc-1)>=0 && map[nr][nc-1] == '.') {
                        map[nr][nc] = '.';
                        map[nr][nc-1] = '<';
                        nc -= 1;
                    }
                }
                if (move == 'R') {
                    map[nr][nc] = '>';
                    if((nc+1) < W && map[nr][nc+1] == '.') {
                        map[nr][nc] = '.';
                        map[nr][nc+1] = '>';
                        nc += 1;
                    }
                }
                 
            }
            System.out.print("#"+test_case+" ");
            printMap(map,H,W);
     
        }
 
    }
 
    private static void printMap(char[][] map, int H, int W) {
        // TODO Auto-generated method stub
        for (int r = 0; r < H; r++) {
            for (int c = 0; c < W; c++) {
                System.out.print(map[r][c]);
            }
            System.out.println();
        }
     
    }

}
