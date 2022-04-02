import java.io.*;

public class Main {
    private static final int LoopSize = 2;
    private static final int Students = 28;
    private static Integer getRegularBox(int boxQty) { return boxQty*8; }
    private static Integer getminiBox(int boxQty) { return boxQty*3; }
    public  static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int result = 0;
        int cupCake = 0;
        for (int i = 0; i < LoopSize; i++) {
            cupCake = Integer.parseInt(br.readLine());
            result+=i > 0 ? getminiBox(cupCake) : getRegularBox(cupCake);
        }
        bw.write(String.valueOf((result-Students)));
        bw.flush();
    }
}