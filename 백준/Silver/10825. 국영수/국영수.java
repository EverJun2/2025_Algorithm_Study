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
        String[][] arr = new String[n][4];
        for (int i = 0; i < n; i++) {
            String[] tmp = br.readLine().split(" ");
            arr[i][0] = tmp[0];
            arr[i][1] = tmp[1];
            arr[i][2] = tmp[2];
            arr[i][3] = tmp[3];
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if(o1[1].equals(o2[1])) {
                    if(o1[2].equals(o2[2])) {
                        if(o1[3].equals(o2[3])) {
                            return o1[0].compareTo(o2[0]);
                        }
                        return Integer.parseInt(o2[3]) - Integer.parseInt(o1[3]);
                    }
                    return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);
                }
                return Integer.parseInt(o2[1]) - Integer.parseInt(o1[1]);
            }
        });

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (String[] strings : arr) {
            bw.append(strings[0]).append("\n");
        }
        bw.flush();
    }
}
