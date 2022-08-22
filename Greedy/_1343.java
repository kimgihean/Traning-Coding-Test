package Greedy;

import java.io.*;

public class _1343 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String board = br.readLine();
		
		int polyCnt = 0;
		for(int i = 0; i < board.length(); i++) {
			if(board.charAt(i) == 'X') polyCnt++;
			else {
				if(polyCnt % 2 == 1) {
					sb = new StringBuilder(); // 이 부분 sb 를 새로 만들어서 하나뿐인 -1 을 만들기 위해서.
					sb.append(-1);
					break;
				}
				while(polyCnt > 0) {
					if(polyCnt >= 4) {
						sb.append("AAAA");
						polyCnt -= 4;
					}
					else if(polyCnt == 2) {
						sb.append("BB");
						polyCnt -= 2;
					}
				}
				sb.append('.');
			}
		}
		
		// 마지막 X 로 끝날 경우
		if(polyCnt > 0) {
			if(polyCnt % 2 == 1) {
				sb = new StringBuilder();
				sb.append(-1);
			}else {
				while(polyCnt > 0) {
					if(polyCnt >= 4) {
						sb.append("AAAA");
						polyCnt -= 4;
					}
					else if(polyCnt == 2) {
						sb.append("BB");
						polyCnt -= 2;
					}
				}
			}
		}
		sb.append("\n"); 
	        
	    bw.write(sb.toString());
	        
	    bw.flush();
	    br.close();
	    bw.close();
	}

}
