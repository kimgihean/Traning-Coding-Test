package Greedy;

import java.util.*;
import java.io.*;

public class _20365 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String color = br.readLine();
		int cnt = 0;
		
		// ó���� �������� ���� ��
		if((color.startsWith("B") && color.endsWith("B")) || (color.startsWith("R") && color.endsWith("R"))) {
			if(color.startsWith("B")) {
				StringTokenizer st = new StringTokenizer(color, "R");
				while(st.hasMoreTokens()) {
					st.nextToken();
					cnt++;

				}
				//color.replaceAll("[R+]", "R");
				//cnt = color.split("R").length;
			}
			else if(color.startsWith("R")){
				StringTokenizer st = new StringTokenizer(color, "B");
				while(st.hasMoreTokens()) {
					st.nextToken();
					cnt++;
				}
				//color.replaceAll("[B+]", "B");
				//cnt = color.split("B").length;
			}
		}
		else {
			StringTokenizer st= new StringTokenizer(color, "R");
			while(st.hasMoreTokens()) {
				st.nextToken();
				cnt++;
			}
			cnt += 1;
			//color.replaceAll("[R+]", "R");
			//cnt = color.split("R").length + 1;
		}
		// �̷��� �� ��� BRRBBBBR �� �� ���� 3�ε� 4�� ���´�. R �� �������� ���� ��� ó���� �̻��� �� ����.
		/*
		 * 	public static void main(String[] args) {
			String str = "�ȳ��ϼ���,,,,�̸����ּҴ� hongil@naver.com";
			String[] ArraysStr = str.split(",|@|-| ");
		
			for(String s : ArraysStr)
				System.out.println(s);
			}
			�� ���
			out :
			�ȳ��ϼ���



			�̸����ּҴ�
			hongil
			naver.com
			���� �� �� �ִ�.
		 */
		System.out.println(cnt);
	}

}
