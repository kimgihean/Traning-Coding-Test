import java.util.*;

class Solution {
    public int[] solution(String s) {        
        String[] strTmp = s.split("},"); // 집합을 기준으로 split 하기
        
        List<String> answer1 = new ArrayList<>();
        
        for(int i = 0; i < strTmp.length; i++) {
            strTmp[i] = strTmp[i].replaceAll("[{}]", ""); // 불필요한 특수 부호 제거하기         
        }
        
        Arrays.sort(strTmp, (String s1, String s2) -> s1.length() - s2.length()); // 배열의 길이를 기준으로 정렬하기
        
        // 순서대로 정렬된 집합에서 contains 으로 이미 stack 에 저장된 데이터를 제외한 다른 데이터 add 하기
        for(int i = 0 ; i < strTmp.length; i++) {
            String[] tmp = strTmp[i].split(",");
            for (int j =0; j < tmp.length; j++) {
                if(answer1.contains(tmp[j])) continue;
                else {
                    answer1.add(tmp[j]);
                    break;
                }
            }            
        }
        
        // arraylist 를 array로 변환하기
        int[] answer = new int[answer1.size()];
        int index = 0;
        for (String number : answer1) {
            answer[index++] = Integer.parseInt(number);
        }
        
        return answer;
    }
}
