import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        boolean[] s = new boolean[N + 1];
        for (int i = 1; i <= N; i++) {
            if (sc.nextInt() == 1)
                s[i] = true;
        }

        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int gen = sc.nextInt();
            int num = sc.nextInt();

            if (gen == 1) {
                for (int j = num; j <= N; j += num) {
                    s[j] = !s[j];
                }
            } else {
                int d = 0;
                while (num + d <= N && num - d >= 1 && s[num + d] == s[num - d]) {
                    s[num + d] = s[num - d] = !s[num + d];
                    d++;
                }
            }
        }
        for(int i = 1; i <= N; i++) {
            System.out.print(s[i] ? 1 : 0);
            if(i % 20 == 0)
                System.out.println();
            else
                System.out.print(" ");
        }
    }
}
