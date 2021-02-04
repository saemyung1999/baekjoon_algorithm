import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int testNum = Integer.parseInt(bf.readLine());
        while (testNum-- > 0) {
                System.out.println(testNum);
                if (testNum % 2 == 0) {
                    break;
                }
        }
    }
}
