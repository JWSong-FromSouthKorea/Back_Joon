import java.io.*;

public class Main {
    private static final int ZeroInt = 0;
    public  static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int MaxTabCount = Integer.parseInt(br.readLine());
        int result = ZeroInt;
        for (int i = 1; i <= MaxTabCount; i++) {
            if(i == MaxTabCount) { result+=Integer.parseInt(br.readLine()); continue; }
            result+=Integer.parseInt(br.readLine())-1;
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}