package Main;

import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		while(T-->0) {
			String[] line = br.readLine().split(" ");
			int H = Integer.parseInt(line[0]), W = Integer.parseInt(line[1]), N = Integer.parseInt(line[2]);
			
			int YY = (N - 1) / H + 1;
			int XX = N % H;
			System.out.print((XX != 0) ? XX : H);
			System.out.println((YY >= 10) ? YY : ("0" + YY));
		}
		
	}
}