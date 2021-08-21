package Main;

import java.util.*;
import java.io.*;


public class Main {
	
	static int MAX_NUM = 1000000;
	static boolean[] prime_check = new boolean[MAX_NUM+1];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Integer num, prime_a, prime_b;
		while( true ) {
			num = Integer.parseInt(br.readLine());
			
			if(num == 0) {
				break;
			}
			
			for(prime_a = 3; prime_a < num; prime_a +=2) {
				if(is_prime(prime_a) & is_prime(num - prime_a)) {
					System.out.println(num + " = " + prime_a + " + " + (num - prime_a) );
					break;
				}
			}
		}
		
	}
	
	private static boolean is_prime(Integer num) {
		if(prime_check[num]) return prime_check[num];
		
		if(num == 1) return prime_check[1] = false;
		
		for(int i = 2; i <= Math.sqrt(num) ; i++) {
			if(num % i == 0) {
				return prime_check[num] = false;
			}
		}
		return prime_check[num] = true;
		
	}
	
}

