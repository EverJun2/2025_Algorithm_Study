import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;


public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] arr;
    static int[] arr2;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        arr2 = new int[n];

        String[] temp = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(temp[i]);
            arr2[i] = arr[i];
        }

        arr2 = Arrays.stream(arr2).distinct().sorted().toArray();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < n; i++) {
            int target = arr[i];
            int tmp = find(target,0, arr2.length);
            bw.append(tmp + " ");
        }
        bw.flush();
    }

    static int find(int target, int start, int end) {
        int mid = (start + end) / 2;
        if (target == arr2[mid]) {
            return mid;
        }
        if (target > arr2[mid]) {
            return find(target, mid+1, end);
        }
        return find(target, start, mid-1);
    }
}