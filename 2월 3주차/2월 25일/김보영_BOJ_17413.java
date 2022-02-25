package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BOJ_17413 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String s=br.readLine();
		
		String ans="";
		String tmp="";
		boolean tag=false;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='<') {
				if(tag=true) {
					ans+=tmp;
					tmp="";
					tag=false;
				}
				int c=i;
				while(s.charAt(c)!='>') {
					c++;
				}
				ans+=s.substring(i,c+1);
				i=c;
			}
			else if(s.charAt(i)==' ') {
				ans+=(tmp+" ");
				tmp="";
			}
			else {
				tmp=s.charAt(i)+tmp;
			}
		}
		ans+=tmp;
		
		System.out.println(ans);
	}

}
