// 바로 컷!
package Greedy;

import java.util.*;
import java.io.*;

public class _11508 {
	static int n;
	static int pay = 0;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> c = new ArrayList<Integer>(); // ArrayList 로 구현하여 시간문제 해결
		
		n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			int tmp = Integer.parseInt(br.readLine());
			c.add(tmp);
		}
		
		Collections.sort(c, Collections.reverseOrder()); // 내림차순 정렬
		
		while(c.size() >= 3) {
			pay = pay + c.get(0) + c.get(1);
			c.remove(0);
			c.remove(0);
			c.remove(0);
		}
		
		for(int i = 0; i < c.size(); i++) {
			pay += c.get(i);
		}
		
		System.out.println(pay);
	}

}

/*
 * array list 말고 그냥 array 를 쓸경우 메모리 차이가 많이 난다는 단점이 있다
 * array 		: 112084KB
 * array List 	: 28836KB
 * 내가 푼 경우는 array List

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Integer[] goods = new Integer[N];

        for(int i=0;i<N;i++) goods[i] = scan.nextInt();
        Arrays.sort(goods, Comparator.reverseOrder());

        int sum = 0;
        for(int i=0;i<N;i++){
            if(i%3==2) continue;
            sum += goods[i];
        }
        System.out.println(sum);
    }
}
 */