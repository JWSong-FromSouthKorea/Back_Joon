import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public static String solution(String s) {
        List<Integer> intList = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(s, " ");

        while(st.hasMoreTokens()) {
            intList.add(Integer.parseInt(st.nextToken()));
        }

        List<Integer> sortedList = intList.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());

        return sortedAnswer(sortedList.get(0), sortedList.get(intList.size()-1));
    }

    private static String sortedAnswer(int a, int b) {
        if (a > b) return b+" "+a;
        if (b > a) return a+" "+b;
        return a+" "+b;
    }
}