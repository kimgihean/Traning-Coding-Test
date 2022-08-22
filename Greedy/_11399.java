//¹Ù·Î ÄÆ!
package Greedy;

import java.util.*;
import java.io.*;

public class _11399 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		ArrayList<Integer> p = new ArrayList<Integer>();
		int time = 0;
		int sum = 0;
		
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0 ; i < n; i++) {
			p.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(p);
		for(int i = 0; i < n; i++) {
			time = time + p.get(i);
			sum = sum + time;
		}
		
		System.out.println(sum);
	}

}
