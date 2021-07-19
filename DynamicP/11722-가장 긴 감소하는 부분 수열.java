	package Main;
	
	import java.util.*;
	import java.io.*;
	
	
	public class Main {
		
		static int[] DP;
		static int[] array;
		public static void main(String[] args) throws IOException {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int N = Integer.parseInt(br.readLine());
			String[] line = br.readLine().split(" ");
			
			array = new int[N+1];
			DP = new int[N+1];
			
			
			for(int i = 1; i < N+1; i++) {
				array[i] = Integer.parseInt(line[i-1]);
			}
			
			top_down(N);
			int res = 1;
			for(int i = 1; i < N+1; i++) {
				res = (DP[i] > res) ? DP[i] : res;
			}
			System.out.println(res);
		}
		
		private static int top_down(int N) {
			if(DP[N] != 0) return DP[N];
			else {
				if(N == 1) {
					return DP[N] = 1;
				}
				
				int res = 1;
				for(int i = 1; i < N; i++) {
					int a = top_down(i);
					if(array[N] < array[i]) {
						res = (a+1 > res) ? a + 1 : res;
					}
				}
				return DP[N] = res;
				
			}
		}
		
	}