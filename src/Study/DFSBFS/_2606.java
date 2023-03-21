package Study.DFSBFS;

/*
 * 첫번째로 풀어본 그래프 문제, 시간초과(Scanner 사용)
 * 한 노드에 인접한 노드를 모두 방문하는 BFS 알고리즘을 사용한다.
 * 1. 그래프를 구성하는 방법을 알자
 * 		a. 그래프 구성할 경우 방문배열을 만들어준다
 * 		b. LinkedList 를 사용한다.
 * 2. 완전 탐색 방법을 알자.
 */
import java.util.*;
import java.io.*;

public class _2606 {
    static int node[][];
    static int check[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        node = new int[n+1][n+1]; // 쉽게 생각하기위해 0행과 0열은 빼고 생각한다.
        check = new int[n];

        for(int i = 0; i < m; i++) {
            int st1 = sc.nextInt();
            int st2 = sc.nextInt();
            node[st1][st2] = 1;
            node[st2][st1] = 1;
        }

        bfs(1);
    }

    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();

        check[start] = 1; // 첫번째 컴퓨터와 연결된 것으로 시작하기 때문에 첫번째 컴퓨터를 방문 배열로 설정
        q.offer(start); // 위와 마찬가지

        int ans = 0;
        while(!q.isEmpty()) {
            int x = q.peek();

            for(int i = 1; i < node.length; i++) {
                if(node[x][i] == 1 && check[i] != 1) {
                    q.offer(i);
                    check[i] = 1;
                    ans++;
                }
            }
        }

        System.out.print(ans);
    }
}

