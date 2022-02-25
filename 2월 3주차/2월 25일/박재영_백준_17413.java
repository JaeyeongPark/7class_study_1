package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class bj_17413_단어뒤집기2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		Stack<Character> stack = new Stack<Character>();
		boolean flag = false;
		char[] arr = s.toCharArray();
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}

		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == '<') {
				while(!stack.isEmpty()) {
					System.out.print(stack.pop());
				}
				flag = true;
				System.out.print("<");
			}else if(arr[i] =='>') {
				flag = false;
				System.out.print(">");
			}else if(!flag && arr[i] == ' ') {
				while(!stack.isEmpty()) {
					System.out.print(stack.pop());
				}
				System.out.print(" ");
			}else if(!flag && i == arr.length-1){
				System.out.print(arr[i]);
				while(!stack.isEmpty()) {
					System.out.print(stack.pop());
				}
			}else {
				if(flag) {
					System.out.print(arr[i]);
				}else {
					stack.push(arr[i]);
				}
			}
			
			
		}
	}

}
