/*
 * BFS �� ����� �����ϴ�
 * �θ�迭�� ����� �θ� ���������� ������ 0 �������� �� i-1 ��° ���ϸ� �� �� ����. > ���Ʈ�����ε� �̷��� �ð��ʰ� �ƴѰ�?
 * �θ� ã������ DFS �� �ؾ��� ���� �� ������? >> DFS �� �¾Ҵ�.
 * 
 * ù Ǯ�� 
 * ���߹迭�� node �� �����ϰ��� �Ͽ���
 * �� ������ 100,000 ���� �ε� �̸� ���߹迭�� �����ϸ�
 * 100,000 * 100,000 * 4byte �� 40GB,,, �޸� ���ѿ� ������ �ɸ���.
 * �̸� �ذ��ϱ� ���ؼ� �ٸ� ����� ����غ���.
 * �ð����⵵ : �������(O(v^2)) ���� ����Ʈ(O(v+e))
 */
package Graph_BFS_DFS;

import java.util.*;
import java.io.*;

public class _11725 {
	static int n;
	static ArrayList<Integer>[] node;
	static boolean check[];
	static int parent[];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		node = new ArrayList[n+1];
		check = new boolean[n+1];
		parent = new int[n+1];
		for(int i = 1; i <= n; i++) {
			node[i] = new ArrayList<>();
		}
		for(int i = 0; i < n-1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			node[a].add(b);
			node[b].add(a);
		}
		
		dfs(1);
		for(int i = 2; i < parent.length; i++) {
			System.out.println(parent[i]);
		}
	}
	
	public static void dfs(int start) {
		check[start] = true;
		
		for(int i : node[start]) {
			if(check[i]) continue;
			else {
				parent[i] = start;
				dfs(i);
			}
		}
	}

}
