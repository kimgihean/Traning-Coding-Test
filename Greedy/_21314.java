/*
 * �ٽ��غ���
 */
package Greedy;

import java.util.*;
import java.io.*;

public class _21314 {
	static String smallNum = "";
	static String bigNum = "";
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), "K", true);
		
		ArrayList<String> arr = new ArrayList<String>();
		while(st.hasMoreTokens()) {
			arr.add(st.nextToken());
		}
		big(arr);
		small(arr);
		
		System.out.println(bigNum);
		System.out.print(smallNum);
	}
	public static void big(ArrayList<String> arr) {
		for(int i = 0; i < arr.size()-1; i++) {
			if(arr.get(i).contains("M") && arr.get(i+1).equals("K")) {
				arr.add(arr.get(i) + arr.get(i+1));
				arr.remove(i);
				//bigNum += "1";
			}
			else if(arr.get(i).equals("K") && arr.get(i+1).equals("K")) {
				bigNum += "5";
			}
		}
		/*if(arr.get(0).equals("K")) bigNum += '5';
		for(int i = 1; i < arr.size(); i++) {
			if(arr.get(i).equals("K")) {
				// �տ��� m ������ ��
				if(arr.get(i-1).contains("M")) {
					bigNum += String.valueOf((int)Math.pow(10, arr.get(i-1).length()) * 5);
				}
				// �տ��� K �϶�
				else {
					bigNum += '5';
				}
			}
			else {
				bigNum += String.valueOf((int)Math.pow(10, arr.get(i).length()-1));
			}
		}*/
	}
	public static void small(ArrayList<String> arr) {
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(i).equals("K")) smallNum += '5';
			// k �տ��� m�� ���������� ���ð�츦 ������.
			else {
				smallNum += String.valueOf((int)Math.pow(10, arr.get(i).length()-1));
			}
		}
	}

}
