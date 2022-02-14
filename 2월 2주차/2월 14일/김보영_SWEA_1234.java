package solve;

import java.util.Scanner;
import java.util.Stack;

public class SWEA_1234 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		for(int t=1;t<=10;t++) {
			int n=sc.nextInt();
			String pwd=sc.next();
			
			Stack<Character> s=new Stack<>();
			for(int i=0;i<pwd.length();i++) {
				if(s.isEmpty())
					s.push(pwd.charAt(i));
				else {
					char now=s.peek();
					if(now==pwd.charAt(i)) {
						s.pop();
					}
					else
						s.push(pwd.charAt(i));
				}
			}
			String tmp=""; //뒤에꺼부터 나열
			while(!s.isEmpty()) {
				tmp+=s.peek();
				s.pop();
			}
			String ans="";//최종 비밀번호
			for(int i=tmp.length()-1;i>=0;i--)
				ans+=tmp.charAt(i);
			
			System.out.println("#"+t+" "+ans);
		}
	}
}
