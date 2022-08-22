package Greedy;

import java.util.*;
import java.io.*;

public class _1541_re {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		String n[] = br.readLine().split("-");
		
		for(int i = 0; i < n.length; i++) {
			String add[] = n[i].split("\\+");
			
			int tmp = 0;
			
			for(int j = 0; j < add.length; j++) {
				tmp += Integer.parseInt(add[j]);
			}
			
			if(sum == 0) {
				sum = tmp;
			}
			else {
				sum -= tmp;
			}
		}
		System.out.println(sum);
	}

}
