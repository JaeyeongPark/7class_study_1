package practice;

import java.util.Scanner;
import java.io.FileInputStream;

public class 박재영_SWEA_1289 {

	public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
         
        for(int test_case = 1; test_case <= T; test_case++)
        {
            String data = sc.next();
            char[] arr = data.toCharArray();
            char[] initial = new char[arr.length];
            int cnt = 0;
             
            for(int i = 0; i<initial.length;i++){
                initial[i] = '0';
            }
  
            for(int i = 0; i<arr.length; i++){
                if( initial[i] != arr[i]){
                    for(int j = i; j< initial.length;j++){
                        initial[j] = arr[i];   
                    }
                    cnt++;
                } 
            }
            System.out.println("#"+test_case+" "+cnt);    
        }
    }

}
