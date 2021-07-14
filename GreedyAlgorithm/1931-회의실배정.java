package Main;

import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		
		List<Tuple> array = new ArrayList<>();
		
		
		int[] mark = new int[N];
		
		
		for(int i = 0; i < N; i++) {
			String[] line = br.readLine().split(" ");
			array.add(new Tuple(Integer.parseInt(line[0]), Integer.parseInt(line[1])));
			mark[i] = 0;
		}
		Collections.sort(array);
		
		int result = 0;
		int time = 0;
		for(int i = 0; i<N; i++) {
			if(array.get(i).start >= time) {
				result++;
				time = array.get(i).end;
			}
		}
		System.out.println(result);
	}
	
	static class Tuple implements Comparable<Tuple>{
		int start;
		int end;
		
		public Tuple(int start, int end) {
			this.start = start;
			this.end = end;
		}

		@Override
		public int compareTo(Tuple that) {
			if(this.end != that.end) {
				return this.end-that.end;
			} else {
				return this.start-that.start;
			}
		}
	}
}
