import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String[][] arr = new String[n][2];
        for (int i = 0; i < n; i++) {
            String[] tmp = br.readLine().split(" ");
            arr[i][0] = tmp[0];
            arr[i][1] = tmp[1];
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (String[] strings : arr) {
            bw.append(strings[0] + " " + strings[1]).append("\n");
        }
        bw.flush();
    }
}
