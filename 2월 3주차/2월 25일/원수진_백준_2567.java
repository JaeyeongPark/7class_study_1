import java.util.Scanner;

public class B2567 {
    static int[] dr = {0, 0, 1, -1};
    static int[] dc = {-1, 1, 0, 0};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        boolean[][] map = new boolean[101][101];
        for (int i = 0; i < T; i++) {
            int c = sc.nextInt();
            int r = sc.nextInt();

            for (int j = r; j < r+10; j++) {
                for (int k = c; k < c+10; k++) {
                    map[j][k] = true;
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (map[i][j]){
                    for (int k = 0; k < 4; k++) {
                        int nr = i+dr[k];
                        int nc = j+dc[k];
                        if (nr>=0 && nc>=0 && nr<101 && nc<101 && !map[nr][nc]){
                            cnt++;
                        }
                    }

                }
            }
        }
        System.out.println(cnt);
    }
}
