import java.lang.*;

class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        
        while (true) {
            if(a%2 != 0) a++;
            if(b%2 != 0) b++;
            a = a/2; b= b/2;
            if(Math.abs(a - b) == 0) break;
            answer++;
        }
        
        return answer;
    }
}
