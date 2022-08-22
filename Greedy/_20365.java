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
		
		// 처음과 마지막이 같을 때
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
		// 이렇게 할 경우 BRRBBBBR 일 때 답이 3인데 4가 나온다. R 이 연속으로 있을 경우 처리가 이상한 것 같다.
		/*
		 * 	public static void main(String[] args) {
			String str = "안녕하세요,,,,이메일주소는 hongil@naver.com";
			String[] ArraysStr = str.split(",|@|-| ");
		
			for(String s : ArraysStr)
				System.out.println(s);
			}
			일 경우
			out :
			안녕하세요



			이메일주소는
			hongil
			naver.com
			임을 알 수 있다.
		 */
		System.out.println(cnt);
	}

}
