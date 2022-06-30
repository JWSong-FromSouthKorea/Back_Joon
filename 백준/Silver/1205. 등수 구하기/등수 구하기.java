import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] user = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        if(user[0] == 0) { bw.write("1"); bw.flush(); bw.close(); }
        else {
            int[] rankList = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if(user[0] == user[2] && user[1] <= rankList[(rankList.length-1)]){
                bw.write("-1"); bw.flush(); bw.close();
            } else {
                int result = 1;
                for (Integer integer : rankList) {
                    if (user[1] < integer) {
                        result++;
                    } else break;
                }
                bw.write(String.valueOf(result));
                bw.flush();
                bw.close();
            }
        }
    }
}