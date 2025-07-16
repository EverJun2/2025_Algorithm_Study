import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
         String[] inp = br.readLine().split(" ");
         int n = Integer.parseInt(inp[0]);
         int m = Integer.parseInt(inp[1]);
         int[][] dp = new int[n + 1][m + 1];

         for(int i = 0; i <= n; i++) {
             dp[i][0] = 1;
             dp[i][1] = 1;
         }
         for(int i = 1; i <= m; i++) {
             dp[1][i] = i;
         }

         for (int i = 2; i <= n; i++) {
             for (int j = 2; j <= m; j++) {
                 dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % 1000000000;
             }
         }

        System.out.println(dp[n][m]);

    }
}
