import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
         int T = Integer.parseInt(br.readLine());
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

         for(int j = 0; j < T; j++) {
             int[][] dp = new int[10001][4];
             dp[1][1] = 1;
             dp[2][1] = 1;
             dp[2][2] = 1;
             dp[3][1] = 1;
             dp[3][2] = 1;
             dp[3][3] = 1;

             int temp = Integer.parseInt(br.readLine());
             for(int i = 4;i <= temp; i++) {
                 dp[i][1] = dp[i - 1][1];
                 dp[i][2] = dp[i - 2][1] + dp[i - 2][2];
                 dp[i][3] = dp[i - 3][1] + dp[i - 3][2] + dp[i - 3][3];
             }
             bw.append(String.valueOf(dp[temp][1] + dp[temp][2] + dp[temp][3]));
             if(j!=T-1) bw.append("\n");
         }
         bw.flush();
    }
}