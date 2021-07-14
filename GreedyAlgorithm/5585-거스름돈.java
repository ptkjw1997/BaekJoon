package Main;

import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = 1000 - Integer.parseInt(br.readLine());
		
		
		int result = 0;
		int[] money = new int[6];
		money[0] = 500;
		money[1] = 100;
		money[2] = 50;
		money[3] = 10;
		money[4] = 5;
		money[5] = 1;
		
		for(int i = 0; i < 6; i++) {
			int num = N/money[i];
			result += num;
			N -= num * money[i];
		}
		
		System.out.println(result);
	}
}
