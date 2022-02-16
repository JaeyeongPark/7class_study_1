import java.io.*;
import java.util.StringTokenizer;

public class S1220 {
    // 푸른-N극, 붉은-S극, 1=N극, 2=S극
    static int[] dr = {1, -1};
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("1220.txt")));

        for (int tc = 1; tc <= 10; tc++) {
            int[][] arr = new int[100][100];
            int N = Integer.parseInt(br.readLine());

            // 입력
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int cnt=0;
            for (int i = 0; i < N; i++) {
                boolean flag = false;
                for (int j = 0; j < N; j++) {
                    if (arr[j][i] == 1) {
                        flag = true;
                        continue;
                    }
                    if (arr[j][i] == 2 && flag) {
                        cnt++;
                        flag = false;
                    }
                }
            }


            //print(arr);
            System.out.printf("#%d %d\n", tc, cnt);
        }


    }

    private static void print(int[][] arr) {
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
