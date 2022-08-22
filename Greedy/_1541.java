/*
 * 정말 구시대적인 발상... 뭔가 특별하고 좋은 아이디어, 테스트케이스를 많이 생각해본 것 같지만 더 괜찮은 방법이 있다.
 * StringTokenizer 를 사용하는 방법!
 */
package Greedy;

import java.util.*;
import java.io.*;

public class _1541 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> num = new ArrayList<>();
		
		String n = br.readLine();
		
		String n1[] = n.split("-");
		// 가장 먼저 나오는 '-' 보다 앞
		if(n1[0].contains("+")) {
			String n2[] = n1[0].split("\\+");
			int first = 0;
			for(int j = 0; j < n2.length; j++) {
				first = first + Integer.parseInt(n2[j]);
			}
			num.add(first);
			
			for(int i = 1; i < n1.length; i++) {
				if(n1[i].contains("+")) {
					String n3[] = n1[i].split("\\+");
					for(int j = 0; j < n2.length; j++) {
						num.add(Integer.parseInt(n3[j]));
					}
				}
				else {
					num.add(Integer.parseInt(n1[i]));
				}
			}
		}
		
		else {
			for(int i = 0; i < n1.length; i++) {
				if(n1[i].contains("+")) {
					String n2[] = n1[i].split("\\+");
					for(int j = 0; j < n2.length; j++) {
						num.add(Integer.parseInt(n2[j]));
					}
				}
				else {
					num.add(Integer.parseInt(n1[i]));
				}
			}
		}
		
		int sum = num.get(0);
		for(int i = 1; i < num.size(); i++) {
			sum = sum - num.get(i);
		}
		
		System.out.println(sum);
	}

}
