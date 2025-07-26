import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n;
    static int m;
    static int[] arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        String[] tmp = br.readLine().split(" ");

        n = Integer.parseInt(tmp[0]);
        m = Integer.parseInt(tmp[1]);
        arr = new int[m];
        visited = new boolean[n];

        dfs(0);
        bw.flush();

    }

    static void dfs(int depth) throws IOException {
        if(depth == m){
            for (int tmp : arr) {
                bw.append(Integer.toString(tmp)).append(' ');
            }
            bw.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            if(!visited[i]){
                visited[i] = true;
                arr[depth] = i + 1;
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }
}
