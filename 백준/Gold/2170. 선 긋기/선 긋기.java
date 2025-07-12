import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n+1][2];
        for (int i = 0; i < n; i++) {
            String[] inp = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(inp[0]);
            arr[i][1] = Integer.parseInt(inp[1]);
        }

        Arrays.sort(arr, new Comparator<>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]){
                    return o1[1] - o2[1];
                }
                return o1[0] - o2[0];
            }
        });
        int prevStart = arr[0][0];
        int prevEnd = arr[0][1];
        int result = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i][0] >= prevStart && arr[i][0] <= prevEnd){
                if(prevEnd < arr[i][1]){
                    prevEnd = arr[i][1];
                }
            }
            else {
                result += prevEnd - prevStart;
                prevStart = arr[i][0];
                prevEnd = arr[i][1];
            }
        }
        result += prevEnd - prevStart;
        System.out.println(result);
    }
}