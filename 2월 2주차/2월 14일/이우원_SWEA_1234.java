import java.util.Scanner;
 
public class Solution {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        for(int testCase = 1; testCase <= 10; testCase++) {
            int n = sc.nextInt();
            String pass = sc.next();
             
            boolean[] isDeleted = new boolean[n];
            while(true) {
                int cnt = 0;
                for(int i = 0; i < n - 1; i++) {
                    if(isDeleted[i])
                        continue;
                     
                    for(int j = i + 1; j < n; j++) {
                        if(isDeleted[j])
                            continue;
                        if(pass.charAt(i) == pass.charAt(j)) {
                            isDeleted[i] = true;
                            isDeleted[j] = true;
                            cnt++;
                        }
                        break;
                    }
                }               
                if(cnt == 0)
                    break;
            }
            StringBuffer sb = new StringBuffer();
            for(int i = 0; i < n; i++) {
                if(!isDeleted[i]) {
                    sb.append(pass.charAt(i));
                }
            }
             
            System.out.printf("#%d %s\n", testCase, sb);
        }
    }
 
}