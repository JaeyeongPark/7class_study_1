import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int N = s.length();

        int R = 0, C = 0;
        for (int i = 1; i < N; i++) {
            if(N % i == 0) {
                int b = N / i;

                if(i <= b) {
                    R = i;
                    C = b;
                } else {
                    break;
                }
            }
        }
        char[][] m = new char[R][C];
        int idx = 0;
        for (int c = 0; c < C; c++) {
            for (int r = 0; r < R; r++) {
                m[r][c] = s.charAt(idx++);
            }
        }

        StringBuffer sb = new StringBuffer();
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                sb.append(m[r][c]);
            }
        }

        System.out.println(sb);
    }
}
