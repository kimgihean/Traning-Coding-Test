import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class _10816 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb;
        int n = Integer.parseInt(bf.readLine());
        int list[] = new int[n];

        st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(bf.readLine());

        st = new StringTokenizer(bf.readLine());
        sb = new StringBuilder();
        for(int i = 0; i < m; i++) {
            int key = Integer.parseInt(st.nextToken());

            sb.append(upperBound(list, key) - lowerBound(list, key))
                    .append(" ");
        }

        Arrays.sort(list);

    }

    private static int lowerBound(int[] list, int key) {
        int li = 0;
        int ri = list.length;
        while(li < ri) {
            int mid = (li + ri) / 2;
            if(key <= list[mid]) {
                ri = mid;
            }
            else {
                li = mid + 1;
            }
        }
        return 0;
    }

    private static int upperBound(int[] list, int key) {

        return 0;
    }
}
