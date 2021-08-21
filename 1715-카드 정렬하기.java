package Main;

import java.util.*;
import java.io.*;


public class Main {
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Integer N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> card_dummy = new PriorityQueue<>();
		
		while(N-- > 0) {
			card_dummy.add(Integer.parseInt(br.readLine()));
		}
		
		int res = 0;
		int dummy = 0;
		while(!card_dummy.isEmpty()) {
			if(card_dummy.size() == 1) {
				break;
			}
			dummy = card_dummy.poll();
			dummy += card_dummy.poll();
			card_dummy.add(dummy);
			res += dummy;
		}
		
		System.out.println(res);
		
	}
}

