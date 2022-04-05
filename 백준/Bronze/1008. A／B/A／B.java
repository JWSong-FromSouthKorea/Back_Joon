import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(getResult(br.readLine().split("\\s+"))));
        bw.flush();
    }

    private static double getResult(String[] arr){
        double result = 0.0;
        result = Double.valueOf(arr[0])/Double.valueOf(arr[1]);
        return result;
    }
}