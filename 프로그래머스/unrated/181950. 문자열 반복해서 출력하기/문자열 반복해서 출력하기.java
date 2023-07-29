import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tk = new StringTokenizer(br.readLine(), " ");
        String word = tk.nextToken();
        int loopCount = Integer.parseInt(tk.nextToken());
        String result = "";
        
        for(int i = 0; i < loopCount; i++) {
            result += word;
        }
        
        bw.write(result);
        bw.flush();
        bw.close();
    }
}