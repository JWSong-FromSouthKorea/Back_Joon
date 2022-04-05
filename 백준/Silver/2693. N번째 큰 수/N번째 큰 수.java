import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int length = Integer.parseInt(br.readLine());
        for (int i = 0; i < length; i++) {
            bw.write(printThirdBigInt(br.readLine()));
            bw.newLine();
        }
        bw.flush();
    }

    private static String printThirdBigInt(String arr){
        String[] arrToList = arr.split("\\s+");
        ArrayList<Integer> List = new ArrayList<>();

        for (int i = 0; i < arrToList.length ; i++)
            List.add(Integer.parseInt(arrToList[i]));

        Collections.sort(List, Collections.reverseOrder());
        return String.valueOf(List.get(2));
    }
}