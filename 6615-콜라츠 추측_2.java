package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;


import java.io.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Long left, right, left_org, right_org;
		Integer left_cnt, right_cnt;
		Long[] checker_A = new Long[1000];
		Long[] checker_B = new Long[1000];
		
		
		
		String[] str;
		while(true) {
			str = br.readLine().split(" ");
			left = Long.parseLong(str[0]);
			right = Long.parseLong(str[1]);
			left_cnt = 0;
			right_cnt = 0;
			left_org = left;
			right_org = right;
			
			if(left == 0) {
				break;
			}
			
			while(left != 1) {
				checker_A[left_cnt] = left;
				left = next(left);
				left_cnt++;
			}
			checker_A[left_cnt] = left;
			
			while(right != 1) {
				checker_B[right_cnt] = right;
				right = next(right);
				right_cnt++;
			}
			checker_B[right_cnt] = right;
			
			while(checker_A[left_cnt].equals(checker_B[right_cnt])) {
				left_cnt--;
				right_cnt--;
				if(left_cnt == -1 | right_cnt == -1) {
					break;
				}
			}
			
			left_cnt++;
			right_cnt++;
			
			System.out.println(left_org + " needs " + left_cnt + " steps, " + right_org + " needs " + right_cnt + " steps, they meet at " + checker_A[left_cnt]);
			
		}
		
		
	}
	
	private static long next(long N) {
		if ( (N&1) == 1 ) {
			return 3*N+1;
		} else {
			return N/2;
		}
	}
	
}

