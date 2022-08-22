/*
 * BFS 로 충분히 가능하다
 * 부모배열을 만들고 부모가 정해져있지 않으면 0 정해지면 그 i-1 번째 구하면 될 것 같다. > 브루트포스인데 이러면 시간초과 아닌가?
 * 부모를 찾으려면 DFS 를 해야지 맞을 것 같은데? >> DFS 가 맞았다.
 * 
 * 첫 풀이 
 * 이중배열로 node 를 구성하고자 하였다
 * 총 범위는 100,000 까지 인데 이를 이중배열로 구현하면
 * 100,000 * 100,000 * 4byte 로 40GB,,, 메모리 제한에 무조건 걸린다.
 * 이를 해결하기 위해서 다른 방법을 사용해본다.
 * 시간복잡도 : 인접행렬(O(v^2)) 인접 리스트(O(v+e))
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
