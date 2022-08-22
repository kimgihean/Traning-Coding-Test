package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2615_ans {
	//��ȸŽ���� ���ⱸ����(Ư�� �ε��� ���� ��,��,��,��,��,��,��,���� ��Ÿ��)
		private static int[] dr = {-1, 0, 1, 1, 1, 0, -1, -1}; 
		private static int[] dc = {1, 1, 1, 0, -1, -1, -1, 0};
	    
	    //�ٵ����� �ǹ��ϴ� 2���� �迭
		private static String[][] go = new String[19][19]; 
	    
	    //���ӵ� �ٵϾ��� ���� ���� counter
		private static int counter;
	    
	    //�¸��� ���� üũ��i ndex -> 0�Ǵ� 1�̾ ���� int���� �ƴ� boolean������ ó�� ����
		private static int index = 0;
		public static void main(String[] args) throws IOException {
		
	    // �Է� �κ�
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			for (int i = 0; i < 19; i++) {
				go[i] = br.readLine().split(" ");
			}
		
	    ///////////////////////////// ���� �κ�////////////////////////////
			bkfor : for (int i = 0; i < go.length; i++) {
				for (int j = 0; j < go.length; j++) { // ������ܿ��� �����ϴ����� ����Ž��
	            	//�浹 �Ǵ� �鵹 Ž�� �� 
					if(go[i][j].equals("1") || go[i][j].equals("2")) { 
						// ��,��,��,����� Ž������
	                    for (int k= 0;  k < 4; k++) { 
	                    // �浹 �Ǵ� �鵹 �� �� ���ְ� ����
	                        counter=1; 
	                        // 5���� �������� ������ ���� �� && �����̶�� �� ���ݴ� ���� Ž��(6���̻� ���� Ȯ��)
							if(check(k, go[i][j], i, j)==5 && !checkPrev(k+4 ,go[i][j], i, j)) { 
	                        				//��� ���ش�� ���(�迭 �ε��� + 1��)
								System.out.printf("%s\n%d %d", go[i][j], i+1, j+1);
								index = 1; // �¸��� �� ���� ǥ��
								break bkfor; // ��ø for�� Ż��(����Ž�� ����)
							} 
						}
					} 
				}
			}
	        	//�¸��� �÷��̾� ����
			if(index !=1) { 
				System.out.println(0);
			}
		}
	//////////////////////////////////////�޼��� �κ�/////////////////////////////

		// Ư�� �ٵϾ� ���� Ư�� �������� 5�� ���� �ٵϾ� ����� �ݴ���� Ž����(6�� �̻� ����) �޼��� 
		private static boolean checkPrev(int k, String player, int r, int c) {
			//�ٵ��� ��踦 ���� ������ && �Ķ���ͷ� ���� ����(��,��,��,�� �� 1)�� �ٵϾ��� �����Ѵٸ� True->�� 6�� �̻�
	        	return 0<=r+dr[k] && r+dr[k] < 19 && 0<=c+dc[k] && c+dc[k] < 19 && go[r+dr[k]][c+dc[k]].equals(player);
		}

		// Ư�� ���� ������, ���� ����, Ž�� ���� ������ �Ķ���ͷ� ����
		private static int check(int k, String player , int r, int c) {
			
	        if(k == 0) { //�ֹ��� Ž�� (k==1 or 2, or 3�� �� ���� ����)
	        		//�ٵ��� ���� Ž���ϴ� ��찡 �ƴϰ�, �ش� ���⿡ ���� ���� �ٵϵ��� �����Ѵٸ�
				if (0<=r+dr[k] && r+dr[k] < 19 && 0<=c+dc[k] && c+dc[k] < 19 && go[r+dr[k]][c+dc[k]].equals(player)) {
					counter++; // ���ӵ� �ٵϾ� �� ++
					check(k, player, r+dr[k], c+dc[k]); //�ش� ���� ��� Ž��
				} else {
	            			// �ٵ��� ���� Ž���ϴ� ���ų�, �ش� ���⿡ �ٵϵ��� �������� �ʴ� ��� �´� �ٵϾ� �� return
					return counter; 
				}
			} else if (k == 1) {//����� Ž��
				if (0<=r+dr[k] && r+dr[k] < 19 && 0<=c+dc[k] && c+dc[k] < 19 && go[r+dr[k]][c+dc[k]].equals(player)) {
					counter++;
					check(k, player, r+dr[k], c+dc[k]);
				} else {
					return counter;
				}
			}else if (k == 2) {//�ٹ��� Ž��
				if (0<=r+dr[k] && r+dr[k] < 19 && 0<=c+dc[k] && c+dc[k] < 19 && go[r+dr[k]][c+dc[k]].equals(player)) {
					counter++;
					check(k, player, r+dr[k], c+dc[k]);
				} else {
					return counter;
				}
			} else if (k == 3) {//�ٹ��� Ž��
				if (0<=r+dr[k] && r+dr[k] < 19 && 0<=c+dc[k] && c+dc[k] < 19 && go[r+dr[k]][c+dc[k]].equals(player)) {
					counter++;
					check(k, player, r+dr[k], c+dc[k]);
				} else {
					return counter;
				}
			} 
			return counter;
		}

}
