import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] dp1 = new int[n + 1];
        int[] dp2 = new int[n + 1];
        String[] tmp = br.readLine().split(" ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(tmp[i]);
        }

        for (int k = 1; k <= n; k++){
            dp1[k] = 1;
            for (int i = 1; i <= k; i++){
                if(arr[i-1] < arr[k-1]){
                    dp1[k] = Math.max(dp1[k], dp1[i] + 1);
                }
            }
        }

        for (int k = n; k >= 1; k--){
            dp2[k] = 1;
            for (int i = n; i >= k; i--){
                if(arr[k-1] > arr[i-1]){
                    dp2[k] = Math.max(dp2[k], dp2[i] + 1);
                }
            }
        }

        int result = 0;
        for(int i = 1; i <= n; i++){
            result = Math.max(result, dp1[i]+dp2[i]);
        }

        System.out.println(result-1);
    }
}
