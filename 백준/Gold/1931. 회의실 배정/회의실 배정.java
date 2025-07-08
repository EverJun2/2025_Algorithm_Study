import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];
        int max = 0;
        int prevEnd = 0;

        for(int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(line[0]);
            arr[i][1] = Integer.parseInt(line[1]);
        }

        //Greedy - 끝나는 시간이 빠른 수업을 선택
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if(a[1] == b[1]) {
                    return Integer.compare(a[0], b[0]);
                }
                return Integer.compare(a[1], b[1]);
            }
        });

        for(int i = 0; i < n; i++) {
            if(i == 0) {
                prevEnd = arr[i][1];
                max ++;
            }
            else{
                if(arr[i][1] >= prevEnd){
                    if(arr[i][0] >= prevEnd){
                        prevEnd = arr[i][1];
                        max ++;
                    }
                }
            }
        }

        System.out.println(max);
    }
}
