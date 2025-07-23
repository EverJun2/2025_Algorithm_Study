import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;


public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] arr;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        String[] str = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(arr);
        int m = Integer.parseInt(br.readLine());
        int[] find = new int[m];
        String[] str2 = br.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            find[i] = Integer.parseInt(str2[i]);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < m; i++) {
            int target = find[i];
            bw.write((high(target)-low(target)+1)+" ");
        }
        bw.flush();
    }

    static int low(int target){
        int start = 0;
        int end = arr.length;

        while(start < end){
            int mid = (end + start)/2;
            if(arr[mid] >= target){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }

    static int high(int target){
        int start = 0;
        int end = arr.length;

        while(start < end){
            int mid = (end + start)/2;
            if(arr[mid] <= target){
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return start - 1;
    }
}
