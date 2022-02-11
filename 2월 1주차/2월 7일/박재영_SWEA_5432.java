package practice;

import java.util.Scanner;
import java.io.FileInputStream;

public class 박재영_SWEA_5432 {

	public static void main(String args[]) throws Exception
    {
     
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
 
        for(int test_case = 1; test_case <= T; test_case++)
        {
            String tc = sc.next();
            char[] arr = tc.toCharArray();
            int count = 0;
            int stack = 0;
             
            for(int i = 0 ; i<arr.length;i++){
                if(arr[i] =='(' && arr[i+1] == ')'){
                    count += stack;
                    i++;
                }else if(arr[i] == '('){
                    count++;
                    stack++;
                }else if(arr[i]==')'){
                    stack--;
                }
            }  
            System.out.println("#" +test_case+" "+count);   
        }
    }

}
