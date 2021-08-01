package Main;

import java.util.*;
import java.io.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		while(N-- >0) {
			String[] line = br.readLine().split(" ");
			double x1 = Double.parseDouble(line[0]), y1 = Double.parseDouble(line[1]), r1 = Double.parseDouble(line[2]);
			double x2 = Double.parseDouble(line[3]), y2 = Double.parseDouble(line[4]), r2 = Double.parseDouble(line[5]);
			
			double dist = get_dist(x1, y1, x2, y2);
			double sum = r1 + r2;
			double minus = Math.abs(r1 - r2);
			if(dist > sum | dist < minus) {
				System.out.println(0);
			} else if (dist == sum | dist == minus) {
				if (dist == 0) {
					System.out.println(-1);
				} else {
					System.out.println(1);
				}
			} else if (dist < sum & dist > minus) {
				System.out.println(2);
			}
			
			
		}
	}
	
	private static double get_dist(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
	}
}