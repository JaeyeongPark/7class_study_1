package swea_1289;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 원재의메모리복구하기 {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("input (9).txt"));
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int i=0;i<tc;i++) {
			String st = sc.next();
			char[] num = new char[st.length()+1];
			for(int n=0;n<st.length();n++) {
				num[n] = st.charAt(n);
			}
			int count=0;
			for(int s=0;s<st.length();s++) {
				if(num[s]!=num[s+1]) {
					count++;
				}
			}
			if(num[0]=='0') {
				count--;
			}
//			
			
			System.out.println("#"+(i+1)+" "+count);
		}
	}

}
