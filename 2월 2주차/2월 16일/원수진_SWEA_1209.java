import java.io.*;
import java.util.StringTokenizer;

public class S1209 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("1209.txt")));

        for (int tc = 1; tc <=10 ; tc++) {
            br.readLine();
            int[][] map = new int[100][100];
            int max = 0;

            // 입력
            for (int i = 0; i < 100; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 100; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            // 행, 열
            int tmp = 0;
            int sum1 = 0;
            int sum2 = 0;

            for (int i = 0; i < 100; i++) {
                sum1=0;
                sum2=0;
                for (int j = 0; j < 100; j++) {
                    sum1 += map[i][j];
                    sum2 += map[j][i];
                }
                tmp = Math.max(sum1, sum2);
                max = Math.max(tmp, max);
            }


            // 대각선
            sum1 = 0;
            sum2 = 0;
            for (int i = 0; i < 100; i++) {
                sum1+=map[i][i];
                sum2+=map[i][99-i];
            }
            tmp = Math.max(sum1, sum2);
            max = Math.max(max, tmp);


            //print(map);
            System.out.printf("#%d %d\n", tc, max);
        }
    }

    private static void print(int[][] map) {
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }
}
