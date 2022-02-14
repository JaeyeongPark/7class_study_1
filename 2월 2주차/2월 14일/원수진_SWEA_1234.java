package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class sw1234 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream("1234.txt"));
		
		for (int tc = 1; tc <= 10; tc++) {
			int n = sc.nextInt();
			//sc.next();
			String str = sc.next();
			ArrayList<Character> list = new ArrayList<Character>();
			
			for (int i = 0; i < n; i++) {
				list.add(str.charAt(i));
			}
			
			boolean flag = false;
			
			for (int i = 0; i < list.size()-1; i++) {
				if (flag) {
					i=0;
					flag = false;
				}
				char ch = list.get(i);
				char ch2 = list.get(i+1);
				if (ch==ch2) {
					list.remove(i);
					list.remove(i);
					if (i<=1) {
						flag = true;
						continue;
					}
					i-=2;
				}
			}
			System.out.printf("#%d ", tc);
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i));
			}
			System.out.println();

		}

	}

}
