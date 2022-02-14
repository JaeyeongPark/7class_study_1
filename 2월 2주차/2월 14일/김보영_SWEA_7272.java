package solve;

import java.util.Scanner;

public class SWEA_7272 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int tc=sc.nextInt();
		for(int t=1;t<=tc;t++) {
			String a=sc.next();
			String b=sc.next();
			
			String ans="SAME";
			
			if(a.length()!=b.length())
				ans="DIFF";
			else {
				for(int i=0;i<a.length();i++) {
					if(a.charAt(i)=='B'&&b.charAt(i)=='B')
						continue;
					if((a.charAt(i)=='A'||a.charAt(i)=='D'||a.charAt(i)=='O'||a.charAt(i)=='P'||a.charAt(i)=='Q'||a.charAt(i)=='R')&&(b.charAt(i)=='A'||b.charAt(i)=='D'||b.charAt(i)=='O'||b.charAt(i)=='P'||b.charAt(i)=='Q'||b.charAt(i)=='R'))
						continue;
					if((a.charAt(i)=='C'||a.charAt(i)=='E'||a.charAt(i)=='F'||a.charAt(i)=='G'||a.charAt(i)=='H'||a.charAt(i)=='I'||a.charAt(i)=='J'||a.charAt(i)=='K'||a.charAt(i)=='L'||a.charAt(i)=='M'||a.charAt(i)=='N'||a.charAt(i)=='S'||a.charAt(i)=='T'||a.charAt(i)=='U'||a.charAt(i)=='V'||a.charAt(i)=='W'||a.charAt(i)=='X'||a.charAt(i)=='Y'||a.charAt(i)=='Z')&&(b.charAt(i)=='C'||b.charAt(i)=='E'||b.charAt(i)=='F'||b.charAt(i)=='G'||b.charAt(i)=='H'||b.charAt(i)=='I'||b.charAt(i)=='J'||b.charAt(i)=='K'||b.charAt(i)=='L'||b.charAt(i)=='M'||b.charAt(i)=='N'||b.charAt(i)=='S'||b.charAt(i)=='T'||b.charAt(i)=='U'||b.charAt(i)=='V'||b.charAt(i)=='W'||b.charAt(i)=='X'||b.charAt(i)=='Y'||b.charAt(i)=='Z'))
						continue;
					else
						ans="DIFF";
				}
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}

}
