import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
         int n = Integer.parseInt(br.readLine());
         int[] arr = new int[n];
         for(int i = 0; i < n; i++) {
             arr[i] = Integer.parseInt(br.readLine());
         }
         int[] dp = new int[n+1];

         int max = 0;
         for(int i = 1; i <= n; i++) {
             dp[i] = 1;
             for(int j = 0; j < i; j++) {
                 if(arr[j] < arr[i-1]) {
                     if(dp[j+1] + 1 > dp[i]) {
                         dp[i] = dp[j+1] + 1;
                         max = Math.max(max, dp[i]);
                     }
                 }
             }
         }
        System.out.println(n-max);
    }
}