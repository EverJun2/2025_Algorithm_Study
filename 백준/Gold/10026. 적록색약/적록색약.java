import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static boolean[][] visited;
    static int N;
    static String[][] map;
    static int[] x = {0,1,0,-1};
    static int[] y = {1,0,-1,0};
    static int result1, result2;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        map = new String[N][N];
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            String[] tmp = br.readLine().split("");
            for (int j = 0; j < N; j++) {
                map[i][j] = tmp[j];
            }
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(!visited[i][j]) {
                    bfs1(i, j);
                }
            }
        }

        visited = new boolean[N][N];

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(!visited[i][j]) {
                    bfs2(i, j);
                }
            }
        }

        System.out.println(result1 + " " + result2);

    }

    static void bfs1(int a, int b){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{a,b});

        while(!q.isEmpty()) {
            int[] cur = q.poll();
            int curX = cur[0];
            int curY = cur[1];
            String color = map[curX][curY];

            for(int i = 0; i < 4; i++) {
                int nextX = curX + x[i];
                int nextY = curY + y[i];
                if(nextX>=0 && nextY>=0 && nextX<N && nextY<N) {
                    if(!visited[nextX][nextY]) {
                        if (color.equals(map[nextX][nextY])) {
                            visited[nextX][nextY] = true;
                            q.offer(new int[]{nextX, nextY});
                        }
                    }
                }
            }
        }
        result1++;
    }

    static void bfs2(int a, int b){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{a,b});

        while(!q.isEmpty()) {
            int[] cur = q.poll();
            int curX = cur[0];
            int curY = cur[1];
            String color = map[curX][curY];

            for(int i = 0; i < 4; i++) {
                int nextX = curX + x[i];
                int nextY = curY + y[i];
                if(nextX>=0 && nextY>=0 && nextX<N && nextY<N) {
                    if(!visited[nextX][nextY]) {
                        if(color.equals("R") || color.equals("G")){
                            if (map[nextX][nextY].equals("R") || map[nextX][nextY].equals("G")){
                                visited[nextX][nextY] = true;
                                q.offer(new int[]{nextX, nextY});
                            }
                        }
                        else{
                            if (color.equals(map[nextX][nextY])) {
                                visited[nextX][nextY] = true;
                                q.offer(new int[]{nextX, nextY});
                            }
                        }
                    }
                }
            }
        }
        result2++;
    }
}