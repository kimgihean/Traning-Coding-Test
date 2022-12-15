import java.util.*;

class Solution {
    public String solution(int n, int t, int m, int p) {
        String tmp = "";
        String answer = "";
        
        for(int i = 0 ; i < m*t; i++) {
            tmp = tmp + (convert(i, n));
        }
        
        for(int i = p-1 ; i < m*t; i = i+m) {
            answer = answer + Character.toString(tmp.charAt(i));
        }
        return answer;
    }
    
    public String convert(int i, int n) {
        String remain = "0123456789ABCDEF";
        int q = i / n;
        int r = i % n;
        
        if(q == 0) {
            return Character.toString(remain.charAt(r));
        }
        else {
            return convert(q, n) + Character.toString(remain.charAt(r));
        }
    }
}
