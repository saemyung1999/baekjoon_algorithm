import java.io.*;

public class Solution_9012_not_using_stack {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testNum = Integer.parseInt(bf.readLine());

        while (testNum-- > 0) {
            String ps = bf.readLine();
            boolean bool = false;
            int sum = 0;
            for (char ch : ps.toCharArray()) {
                if (ch==')') {
                    sum += -1;
                } else {
                    sum += 1;
                }
                if (sum < 0) {
                    bool = true;
                    break;
                }
            }
            if (sum != 0) {
                bool = true;
            }
            if (bool) {
                bw.write("NO");
            } else {
                bw.write("YES");
            }
            bw.flush();
        }
    }
}
