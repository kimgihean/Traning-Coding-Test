// �ٷ� ��!
package Greedy;

import java.util.*;
import java.io.*;

public class _11508 {
	static int n;
	static int pay = 0;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> c = new ArrayList<Integer>(); // ArrayList �� �����Ͽ� �ð����� �ذ�
		
		n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			int tmp = Integer.parseInt(br.readLine());
			c.add(tmp);
		}
		
		Collections.sort(c, Collections.reverseOrder()); // �������� ����
		
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
 * array list ���� �׳� array �� ����� �޸� ���̰� ���� ���ٴ� ������ �ִ�
 * array 		: 112084KB
 * array List 	: 28836KB
 * ���� Ǭ ���� array List

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