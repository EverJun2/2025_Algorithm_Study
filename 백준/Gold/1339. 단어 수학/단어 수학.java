import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int n  = Integer.parseInt(br.readLine());
        String[] str = new String[n];
        int[] alphabet = new int[26];

        for(int i = 0; i < n; i++) {
            str[i] = br.readLine();
        }

        for (String s : str) {
            int temp = s.length()-1; //자리수
            for(int i = 0; i <s.length(); i++) {
                int idx = s.charAt(i) - 'A';
                alphabet[idx]+= (int) Math.pow(10,temp);
                temp--;
            }
        }
        Arrays.sort(alphabet);
        int result = 0;
        for(int i = 0; i < 10; i++){
            result += alphabet[25-i] * (9-i);
        }
        System.out.println(result);
    }
}