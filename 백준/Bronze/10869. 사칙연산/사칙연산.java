import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        StringTokenizer tk = new StringTokenizer(input);

        calculate(tk.nextToken(), tk.nextToken(), bw);

        bw.flush();
        bw.close();
    }

    private static void calculate(String a, String b, BufferedWriter bw) throws IOException {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int intA = Integer.parseInt(a);
        int intB = Integer.parseInt(b);

        for (int i = 0; i < 5; i++) {
            if( i < 1 ) answer.add(i, intA+intB);
            if( i > 0 && i < 2) answer.add(i, intA-intB);
            if( i > 1 && i < 3) answer.add(i, intA*intB);
            if( i > 2 && i < 4) answer.add(i, intA/intB);
            if( i > 3 && i < 5) answer.add(i, intA%intB);
        }

        for (Integer eachAnswer : answer) {
            bw.write(String.valueOf(eachAnswer));
            bw.newLine();
        }
    }
}
