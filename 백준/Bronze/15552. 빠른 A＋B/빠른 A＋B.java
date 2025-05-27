import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int t = Integer.parseInt(bf.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());

            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            bw.write(num1 + num2 + "\n");
        }
        bw.flush();
        bw.close();
    }
}
