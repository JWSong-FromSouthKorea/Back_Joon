import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int length = Integer.parseInt(br.readLine());
        List<String> sortingTarget = new ArrayList<>(length);
        for (int i = 1; i <= length; i++) {
            sortingTarget.add(br.readLine());
        }
        List<String> distinctTarget = sortingTarget.stream().distinct().collect(Collectors.toList());
        distinctTarget.stream().sorted(Comparator.comparing(String::length).thenComparing(String.CASE_INSENSITIVE_ORDER)).forEach(System.out::println);
    }
}