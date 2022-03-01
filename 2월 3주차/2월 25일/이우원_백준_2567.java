import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int[] dr = {-1, 1, 0, 0};
    private static int[] dc = {0, 0, -1 ,1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        boolean[][] m = new boolean[102][102];
        for (int n = 1; n <= N; n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            for (int r = 0; r < 10; r++) {
                for (int c = 0; c < 10; c++) {
                    m[r + d][c + l] = true;
                }
            }
        }
        int ret = 0;
        for (int r = 1; r <= 100; r++) {
            for (int c = 1; c <= 100; c++) {
                if(m[r][c]) {
                    for (int d = 0; d < 4; d++) {
                        int nr = r + dr[d];
                        int nc = c + dc[d];
                        if(!m[nr][nc])
                            ret++;
                    }
                }
            }
        }

        System.out.println(ret);
    }
}