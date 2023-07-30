class Solution {
    public static String solution(String s) {
        String answer = "";
        String[] splitWord = s.split(" ", -1);
        
        for (int i = 0; i < splitWord.length; i++) {
            String word = splitWord[i];
            if (isAlpha(word)) {
                if (word == "") {
                    answer+=" ";
                    continue;
                }
                answer+=toJadenCase(word)+(i < splitWord.length-1 ? " " : "");
            } else {
                answer+=word.toLowerCase()+(i < splitWord.length-1 ? " " : "");
            }
        }

        return answer;
    }

    private static boolean isAlpha(String s) {
        return s.matches("^[a-zA-Z]*$");
    }

    private static String toJadenCase(String s) {
        if (s.length() > 0) return s.substring(0, 1).toUpperCase()+s.substring(1).toLowerCase();
        return s;
    }
}