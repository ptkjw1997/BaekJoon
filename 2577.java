package Main;

import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int A = Integer.parseInt(br.readLine()), B = Integer.parseInt(br.readLine()), C = Integer.parseInt(br.readLine());
		
		Integer result = A*B*C;
		int[] array = new int[10];
		for (int i = 0; i < 10; i++) {
			array[i] = 0;
		}
		
		for(char ch : result.toString().toCharArray()) {
			array[ch-'0']++;
		}
		
		for(int a : array) {
			System.out.println(a);
		}
		
	}
	
}
