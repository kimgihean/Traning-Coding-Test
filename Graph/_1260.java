/*
 * DFS : Ω∫≈√(ArrayList), ¿Á±Õ 
 * BFS : ≈•(LinkedList or PriorityQueue)
 */
package Graph_BFS_DFS;

import java.util.*;
import java.io.*;

public class _1260 {
	static StringBuilder sb = new StringBuilder();
	static int n, m, v;
	static int node[][];
	static boolean check[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());
		
		node = new int[n+1][n+1];
		check = new boolean[n+1];
		
		for(int i = 0; i < m; i++) {
			StringTokenizer st1= new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st1.nextToken());
			int b = Integer.parseInt(st1.nextToken());
			node[a][b] = 1;
			node[b][a] = 1;
		}
		dfs(v);
		sb.append("\n");
		check = new boolean[n+1];
		bfs(v);
		System.out.print(sb);
	}
	
	public static void dfs(int start) {
		check[start] = true;
		sb.append(start + " ");
		for(int i = 1; i < node.length; i++) {
			if(node[start][i] == 1 && !check[i]) {
				dfs(i);
			}
		}
	}
	
	public static void bfs(int start) {
		LinkedList<Integer> q = new LinkedList<>();
		check[start] = true;
		q.offer(start);
		
		while(!q.isEmpty()) {
			int x = q.poll();
			sb.append(x + " ");
			
			for(int i = 1; i < node.length; i++) {
				if(node[x][i] == 1 && check[i] != true) {
					q.offer(i);
					check[i] = true;
				}
			}
		}
		
	}

}
