package Main;

import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] line = br.readLine().split(" ");
		int num_ver = Integer.parseInt(line[0]);
		int num_edge = Integer.parseInt(line[1]);
		int start_ver = Integer.parseInt(line[2]);
		
		Graph my_graph = new Graph(num_ver);
		
		for(int i=0; i<num_edge; i++) {
			line = br.readLine().split(" ");
			int a = Integer.parseInt(line[0]), b = Integer.parseInt(line[1]);
			my_graph.add_edge(a, b);
		}
		DFS(my_graph, start_ver);
		System.out.print("\n");
		BFS(my_graph, start_ver);
	}
	
	public static class Graph{
		ArrayList<ArrayList<Integer>> adj_list;
		
		public Graph(int N) {
			adj_list = new ArrayList<ArrayList<Integer>>();
			for(int i = 0; i < N; i++) {
				ArrayList<Integer> temp = new ArrayList<Integer>();
				adj_list.add(temp);
			}
		}
		
		void add_edge(int a, int b) {
			adj_list.get(a-1).add(b-1);
			adj_list.get(b-1).add(a-1);
		}
		
		boolean is_adj(int a, int b) {
			return adj_list.get(a).contains(b);
		}
	}
	
	static void DFS(Graph graph, int ver) {
		Stack<Integer> stack = new Stack<Integer>();
		int num  = graph.adj_list.size();
		int[] mark = new int[num];
		for(int i = 0; i < num ; i++ ) {
			mark[i] = 0;
		}
		stack.add(ver-1);
		mark[ver-1] = 1;
		System.out.print(ver + " ");
		while(!stack.empty()) {
			int next = find_next(graph, stack, mark);
			if(next == -1) {
				stack.pop();
			} else {
				stack.add(next);
				mark[next] = 1;
				System.out.print(next+1 + " ");
			}
		}
		
	}
	
	static int find_next(Graph graph, Stack<Integer> stack, int[] mark) {
		int size = graph.adj_list.size();
		int ver = stack.peek();
		for(int i = 0; i<size; i++) {
			if(graph.is_adj(ver, i) & mark[i]!=1) {
				return i;
			}
		}
		return -1;
	}
	
	static void BFS(Graph graph, int ver) {
		Queue<Integer> queue = new LinkedList<Integer>();
		int num  = graph.adj_list.size();
		int[] mark = new int[num];
		for(int i = 0; i < num ; i++ ) {
			mark[i] = 0;
		}
		
		queue.add(ver-1);
		mark[ver-1] = 1;
		System.out.print(ver + " ");
		
		while(!queue.isEmpty()) {
			int w = queue.poll();
			for(int i =0; i<num; i++) {
				if(graph.is_adj(i, w) & mark[i]!= 1) {
					queue.add(i);
					mark[i] = 1;
					System.out.print(i+1 + " ");
				}
			}
		}
		
	}
}
