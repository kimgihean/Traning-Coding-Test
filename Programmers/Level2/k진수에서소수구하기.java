import java.lang.Math;

class Solution {
    public int solution(int n, int k) {
        String primeNum = makePrimeNum(n, k);
        
        // 0 을 기준으로 split
        String[] afterSplit = primeNum.split("0");
        
        int answer = isPrime(afterSplit);
        
        return answer;
    }
    
    public int isPrime(String[] afterSplit) {
        int answer = 0;
        for (int i = 0; i < afterSplit.length; i++) {
            int targetNum = Integer.parseInt(afterSplit[i]);
            for(int j =2; j*j<Math.sqrt(targetNum); j++) {
                if(targetNum % j == 0) break;
            }
            answer++;
        }
        
        return answer;
    }
    
    public String makePrimeNum(int n, int k) {
        String tmp = "";
        
        int afterN = n;
        while(afterN > 0) {
            tmp = tmp + (n % k);
            afterN = afterN / k;
        }
        
        return tmp;
    }
}
