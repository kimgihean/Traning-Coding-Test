package Implementation;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _20164 {
	
	static int N;
	static int Min = 999999;
	static int Max = 0;
	static int cnt;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		N = Integer.parseInt(br.readLine());
		
		int n = N;
		
		int a = divide(n);
		
		System.out.println(Min + " " + Max);
	}
	public static int divide(int n) {
		int newNum = 0;
		int length = (int)(Math.log10(n) + 1);
		
		ArrayList<Integer> arrList = new ArrayList<>();
		
		if(N < 10) {
			count(length, n);
			// 최소값 최대값 확인
			check();
			cnt = 0;
			return 0;
		}
		else if(N < 100){
			count(length, n);
			newNum = n / 10 + n % 10;
			divide(newNum);
			return 0;
		}
		else {
			count(length, n);
			for(int i = length-1; i >= 0; i--) {
				for(int j = i-1; j >= 0; j--) {
					arrList.add((int) (newNum / Math.pow(10, i)));
					arrList.add((int) (newNum / Math.pow(10, j)));
					arrList.add((int) (newNum % Math.pow(10, j)));
					for(int k = 0; k < arrList.size(); i++) {
						newNum = newNum + arrList.get(k);
					}
					divide(newNum);
				}
			}
		}
		return 0;
	}
	
	public static void count(int num, int n) {
		int tmp = n;
		for(int i = num-1; i >= 0; i++) {
			tmp = (int) (N / Math.pow(10, i));
			if(tmp % 2 == 1) {
				cnt++;
			}
			tmp = (int) (N % Math.pow(10, i));
		}
	}
	
	public static void check() {
		if(cnt < Min) Min = cnt;
		if(cnt >= Max) Max = cnt;
	}
}
