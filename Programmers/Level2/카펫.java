class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int blocksCounts = brown + yellow; // 전체 격자의 개수
        int length = (brown + 4)/2; // 가로 길이 + 세로 길이
                
        for(int y = 1; y <= blocksCounts; y++) {
            if(blocksCounts % y == 0) {
                int x = blocksCounts / y;
                if(x + y == length) {
                    answer[0] = x;
                    answer[1] = y;
                    break;
                }
            }
            else {
                continue;
            }
        }
        
        return answer;
    }
} 
