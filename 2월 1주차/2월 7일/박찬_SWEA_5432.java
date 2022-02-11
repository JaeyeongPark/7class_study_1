package swea_5432;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 쇠막대기자르기 {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("sample_input.txt"));
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int i=0;i<tc;i++) {
			String st = sc.next();
			char[] stick = new char[st.length()];
			for(int j=0;j<st.length();j++) {
				stick[j] = st.charAt(j);
				System.out.print(stick[j]);
			}
			System.out.println();
			int count=0;
			int x=0;
			for(int n=0;n<st.length();n++) {
				if(stick[n]=='('&&stick[n+1]==')') {
					count +=x;
				}
				else if(stick[n]==')'&&stick[n-1]=='(') continue;
				
				else if(stick[n]=='(') {
					x++;
				}
				else if(stick[n]==')') {
					if(x>0) {
						x--;
						count++;
					}
				}
			}
			System.out.println(count);
			
			
		}
	}

}
