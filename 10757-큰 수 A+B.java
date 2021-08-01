package Main;

import java.util.*;
import java.io.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] line = br.readLine().split(" ");
		String[] A = line[0].split("");
		String[] B = line[1].split("");
		Stack<Integer> result = new Stack<>();
		
		int left = A.length-1;
		int right = B.length-1;
		int up = 0, sum = 0;
		
		while(left >= 0 & right >= 0) {
			sum = Integer.parseInt(A[left]) + Integer.parseInt(B[right]) + up;
			if (sum >= 10) {
				up = 1;
				sum -= 10;
			} else {
				up = 0;
			}
			result.add(sum);
			
			left--;
			right--;
		}
		
		if(left >= 0) {
			while(left-- >= 0) {
				sum = Integer.parseInt(A[left+1]) + up;
				if(sum >= 10) {
					up = 1;
					sum -= 10;
				} else {
					up = 0;
				}
				result.add(sum);
				
			}
		}
		if(right >= 0) {
			while(right-- >= 0) {
				sum = Integer.parseInt(B[right+1]) + up;
				if(sum >= 10) {
					up = 1;
					sum -= 10;
				} else {
					up = 0;
				}
				result.add(sum);
			}
		}
		
		if(up == 1) {
			result.add(1);
		}
		
		while(!result.empty()) {
			bw.write(Integer.toString(result.pop()));
		}
		
		bw.flush();
		bw.close();
		
	}
}