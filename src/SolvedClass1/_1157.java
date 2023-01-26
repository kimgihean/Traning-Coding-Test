package SolvedClass1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class _1157 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String word = bf.readLine().toUpperCase();

        List<Character> charList = new ArrayList<>();
        List<Integer> countList = new ArrayList<>();

        for(int i = 0; i < word.length(); i++) {
            char check = word.charAt(i);
            // 리스트에 없으면 추가
            if(!charList.contains(check)) {
                charList.add(check);
                countList.add(1);
            }
            else {
                int index = charList.indexOf(check);
                countList.set(index, countList.get(index) + 1);
            }
        }

        int max = 0;
        char answer = 0;

        for(int i = 0; i < countList.size(); i++) {
            if(max < countList.get(i)) {
                max = countList.get(i);
                answer = charList.get(i);
            }
            else if(max == countList.get(i)) answer = '?';
        }

        System.out.println(answer);
    }
}