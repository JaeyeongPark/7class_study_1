package solve;

import java.util.Scanner;

public class BOJ_2999 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		
		int n=s.length();
		int r=0;
		int c=0;
		for (int i=1; i<=n/2; i++) {
			if (n%i==0) {
				if (i>n/i)
					break;
				r = i;
				c = n/i;
			}
		}
		char[][] arr=new char[r][c];
		int a = 0;
		for(int i=0;i<c;i++)
			for (int j = 0; j < r; j++) {
				arr[j][i] = s.charAt(a);
				a++;
			}
		
		String ans="";
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				ans+=arr[i][j];
		
		System.out.println(ans);

	}

}
