import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        int[] dp = new int[k+1];
        for(int i = 1; i<=k; i++){
            dp[i] = 1000001;
        }

        for(int i = 1; i <= k; i++){
            for(int j = 0; j < n; j++){
                if(i >= arr[j]){
                    dp[i] = Math.min(dp[i], dp[i-arr[j]] + 1 );
                }
            }
        }
        if(dp[k] != 1000001){
            System.out.println(dp[k]);
        }
        else{
            System.out.println(-1);
        }
    }
}