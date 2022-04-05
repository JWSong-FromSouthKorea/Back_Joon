import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int length = Integer.parseInt(br.readLine());
        ArrayList<Integer> resultArr = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            makeArray(br.readLine(), resultArr);
        }
        print(resultArr, bw);
    }

    private static void makeArray(String v, ArrayList<Integer> arr) {
        arr.add(Integer.parseInt(v));
    }

    private static void print(ArrayList<Integer> arr, BufferedWriter bw) throws IOException {
        Collections.sort(arr);
        for (int each : arr) {
            bw.write(String.valueOf(each));
            bw.newLine();
        }
        bw.flush();
    }
}