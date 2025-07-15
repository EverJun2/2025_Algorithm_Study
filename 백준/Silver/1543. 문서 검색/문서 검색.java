import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
         String doc = br.readLine();
         String word = br.readLine();

         String count = doc.replaceAll(word, "");
         System.out.println((doc.length()-count.length())/word.length());

    }
}