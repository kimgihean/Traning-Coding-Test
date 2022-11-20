import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        //queue 를 이용하자
        //queue 에서는 특정값 제거하는 것이 번거롭다 > queue remove 를 사용하자
        Queue<String> cache = new LinkedList<>();
        
        for (int i = 0; i < cities.length; i++) {
            //대소문자를 구분하지 않기 위해 모두 소문자로 변경
            cities[i] = cities[i].toLowerCase();
            
            if(cache.size() < cacheSize) {
                cache.add(cities[i]);
                answer += 5;
            }
            else { // cache 크기가 다 찼을때
                
                // 1. 해당 city가 cache 에 있는지 확인
                if(cache.contains(cities[i])) {
                    // 2. 있다면 이미 queue에 있는 city 제거하고 queue에 새로 추가
                    // 3. 이 경우 cache hit
                    cache.remove(cities[i]);
                    cache.add(cities[i]);
                    answer += 1;
                }
                // 4. 만약 해당 city 가 cache에 없다면 head 를 제거하고 해당 city 추가
                // 5. 이 경우 cache miss
                else {
                    cache.poll();
                    cache.add(cities[i]);
                    answer += 5;
                }
                
            }
        }
        return answer;
    }
}
