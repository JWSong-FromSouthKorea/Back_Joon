import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(getMultiplication((br.readLine()).replaceAll(" ", "").split("")));
        bw.flush();
    }

    private static String getMultiplication(String[] param) {
        int result = 1;
        for (int i = 0; i < param.length; i++) {
            result*=Integer.parseInt(param[i]);
        }
        return String.valueOf(result);
    }
}