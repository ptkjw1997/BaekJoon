package Main;

import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int A = Integer.parseInt(br.readLine());
		int result = 1;
		int start = func(A);
		
		while(start!=A) {
			start = func(start);
			result++;
		}
		
		System.out.println(result);
	}
	
	
	static int func(int A) {
		
		int B = (A/10) + (A%10);
		A = (A%10)*10 + (B%10);
		
		return A;
		
	}
}
