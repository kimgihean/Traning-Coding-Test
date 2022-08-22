/*
 * ù��°�� Ǯ� �׷��� ����
 * �� ��忡 ������ ��带 ��� �湮�ϴ� BFS �˰����� ����Ѵ�.
 * 1. �׷����� �����ϴ� ����� ����
 * 		a. �׷��� ������ ��� �湮�迭�� ������ش�
 * 		b. LinkedList �� ����Ѵ�.
 * 2. ���� Ž�� ����� ����.
 */
package Graph_BFS_DFS;

import java.util.*;
import java.io.*;

public class _2606 {
	static int node[][];
	static boolean check[];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		node = new int[n+1][n+1]; // ���� �����ϱ����� 0��� 0���� ���� �����Ѵ�.
		check = new boolean[n+1];
		
		for(int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int st1 = Integer.parseInt(st.nextToken());
			int st2 = Integer.parseInt(st.nextToken());
			// ���� ��� ���
			node[st1][st2] = 1;
			node[st2][st1] = 1;
		}
		
		bfs(1);
	}
	
	public static void bfs(int start) {
		Queue<Integer> q = new LinkedList<>();
		
		check[start] = true; // ù��° ��ǻ�Ϳ� ����� ������ �����ϱ� ������ ù��° ��ǻ�͸� �湮 �迭�� ����
		q.offer(start); // ���� ��������
		
		int ans = 0;
		while(!q.isEmpty()) {
			int x = q.poll();
			
			for(int i = 1; i < node.length; i++) {
				if(node[x][i] == 1 && check[i] != true) {
					q.offer(i);
					check[i] = true;
					ans++;
				}
			}
		}
		
		System.out.print(ans);
	}
}
