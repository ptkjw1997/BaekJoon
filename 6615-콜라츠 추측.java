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
		
		Long left, right, left_bef, right_bef;
		Integer left_cnt, right_cnt;
		
		Map<Long, Integer> map = new HashMap<Long, Integer>(2000);
		
		
		String[] str;
		while(true) {
			str = br.readLine().split(" ");
			left = Long.parseLong(str[0]);
			right = Long.parseLong(str[1]);
			left_cnt = 0;
			right_cnt = 0;
			left_bef = left;
			right_bef = right;
			
			if(left == 0) {
				break;
			}
			
			map.clear();
			while(left_bef != 1) {
				map.put(Long.valueOf(left_bef), left_cnt);
				left_bef = next(left_bef);
				left_cnt++;
			}
			map.put(Long.valueOf(left_bef), left_cnt);
			
			while(right_bef != 1) {
				if((left_cnt = map.put(Long.valueOf(right_bef), right_cnt)) != null) {
					break;
				}
				right_bef = next(right_bef);
				right_cnt++;
			}
			
			if(left_cnt == null) left_cnt = 0;
			
			System.out.println(left + " needs " + left_cnt + " steps, " + right + " needs " + right_cnt + " steps, they meet at " + right_bef);
			// 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1
			// 8 4 2 1
			// 1 2 4 8 16 32 64 128/21
			// 1 2 4 8 16 5 10 20/3
			
			// 27 82 41 124 62 31 94 47 142 71 214 107 322 161 484 242 121 364 182 91 274 137 412 206 103 310 155 466 233 700 350 175 526 263 790 395 1186 593 1780 890 445 1336 668 334 167 
			// 502 251 754 377 1132 566 283 850 425 1276 638 319 958 479 1438 719 2158 1079 3238 1619 4858 2429 7288 3644 1822 911 2734 1367 4102 2051 6154 3077 9232 4616 2308 1154 577 1732 866
			// 433 1300 650 325 976 488 244 122 61 184 92 46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1
			// 30 15 46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1 
			
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

