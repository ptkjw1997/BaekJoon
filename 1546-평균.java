package Main;

import java.util.*;
import java.io.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		String[] line = br.readLine().split(" ");
		double sum = 0;
		double Max = -1;
		for(int i = 0; i < N; i++) {
			double num = Double.parseDouble(line[i]);
			if(num > Max) {
				Max = num;
			}
			sum += num;
		}
		System.out.println(100 * sum / (N * Max));
		
	}
}