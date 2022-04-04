import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String stars = "";
        printStar(Integer.parseInt(br.readLine()), stars, bw);
    }

    private static void printStar(int loopCount, String stars, BufferedWriter bw) throws IOException {
        if(loopCount > 0) {
            stars+="*";
            bw.write(stars);
            bw.newLine();
            printStar(loopCount-1, stars, bw);
        } else {
            bw.flush();
        }
    }
}