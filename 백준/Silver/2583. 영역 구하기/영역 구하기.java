import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[][] visited;
    static int M, N, K;
    static int[][] map;
    static ArrayList<Integer> arr = new ArrayList<>();
    static int[] x = {0,1,0,-1};
    static int[] y = {1,0,-1,0};

    public static void main(String[] args) throws IOException {
        String[] inp = br.readLine().split(" ");
        M = Integer.parseInt(inp[0]);
        N = Integer.parseInt(inp[1]);
        K = Integer.parseInt(inp[2]);

        visited = new int[M][N];
        map = new int[M][N];
        for (int i = 0; i < K; i++) {
            String[] tmp = br.readLine().split(" ");
            for(int j = Integer.parseInt(tmp[0]); j<Integer.parseInt(tmp[2]); j++){
                for(int k = Integer.parseInt(tmp[1]); k<Integer.parseInt(tmp[3]); k++){
                    map[k][j] = 1;
                }
            }
        }

        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                if(visited[i][j] == 0 && map[i][j] == 0){
                    int data = bfs(i,j);
                    arr.add(data);
                }
            }
        }

        System.out.println(arr.size());
        Collections.sort(arr);
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
    }

    static int bfs(int start, int end){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{start, end});
        visited[start][end] = 1;
        int cnt = 1;

        while(!q.isEmpty()){
            int[] cur = q.poll();
            int curX = cur[0];
            int curY = cur[1];
            for(int i = 0; i<4; i++){
                int nextX = curX + x[i];
                int nextY = curY + y[i];
                if(nextX >= 0 && nextY >=0 && nextX < M && nextY < N){
                    if(visited[nextX][nextY] == 0 && map[nextX][nextY] == 0){
                        visited[nextX][nextY] = 1;
                        q.add(new int[]{nextX, nextY});
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}