import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static boolean check;
    static int[] visited;
    static int[][] graph;
    static int n;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());

        String[] tmp = br.readLine().split(" ");
        int targetA = Integer.parseInt(tmp[0]);
        int targetB = Integer.parseInt(tmp[1]);

        graph = new int[n+1][n+1];
        visited = new int[n+1];

        int cnt = Integer.parseInt(br.readLine());
        for (int i = 0; i < cnt; i++) {
            String[] inp = br.readLine().split(" ");
            int a = Integer.parseInt(inp[0]);
            int b = Integer.parseInt(inp[1]);
            graph[a][b] = graph[b][a] = 1;
        }

        bfs(targetA,targetB);

        if(!check) {
            System.out.println(-1);
        }
        else{
            System.out.println(visited[targetB]);
        }
    }

    static void bfs(int start, int end){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        while(!queue.isEmpty()){
            int cur = queue.poll();
            if(cur == end){
                check = true;
                return;
            }

            for(int i = 1; i<=n; i++) {
                if(graph[cur][i] == 1){
                    if(visited[i] == 0){
                        visited[i] = visited[cur] + 1;
                        queue.add(i);
                    }
                }
            }
        }
    }
}