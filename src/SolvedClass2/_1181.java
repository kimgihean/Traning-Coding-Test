package SolvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class _1181 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        List<String> arr = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            String input = bf.readLine();
            if(!arr.contains(input)) arr.add(input);
        }

        String wordArr[] = arr.toArray(new String[arr.size()]);

        Arrays.sort(wordArr);
        Arrays.sort(wordArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        for(int i = 0; i < wordArr.length; i++) {
            System.out.println(wordArr[i]);
        }
    }
}
