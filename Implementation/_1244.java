package Implementation;

import java.util.*;

public class _1244 {
	static int switchCount;
	static int[] switches;
	static int studentCount;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		switchCount = sc.nextInt();
		switches = new int[switchCount];
		for(int i = 0; i < switchCount; i++) {
			switches[i] = sc.nextInt();
		}
		
		studentCount = sc.nextInt();
		for(int i = 0 ; i < studentCount; i++) {
			int gender = sc.nextInt();
			int number = sc.nextInt();
			
			if (gender == 1) {
				for(int j = 0 ; j < switchCount; j++) {
					if((j+1) % number == 0) {
						if(switches[j] == 0) switches[j] = 1;
						else switches[j] = 0;
					}
				}
			}
			
			else {
				int tmp = switchCount % number;
				int flag = 0;
				
				if( tmp == 0 ) {
					if(switches[number] == 0 ) switches[number] = 1;
					else switches[number] = 0;
				}
				for(int j = 1; j <= tmp ; j++) {
					if( switches[number-j] == switches[number+j] ) flag++;
					else {
						if(switches[number] == 0 ) switches[number] = 1;
						else switches[number] = 0;
						flag = 0;
					}
				}
				
				if(flag == tmp) {
					for(int k = number-tmp; k < number+tmp; k++) {
						if(switches[k-1] == 0) switches[k-1] = 1;
						else switches[k-1] = 0;
					}
				}
			}
			
		}
		
		for(int i = 0; i < switchCount; i++) {
			System.out.print(switches[i] + " ");
			if((i+1) % 20 == 0) {
				System.out.println();
			}
		}
	}

}
