package task3;

public class Task3 {


    public static void main(String[] args) {

        System.out.println("helloWorld: " + longestUniqueSubstring("helloWorld"));
        System.out.println("substring: " + longestUniqueSubstring("substring"));

    }


    public static String longestUniqueSubstring(String s) {
        int start = 0;
        int maxLen = 0;
        int startIndex = 0;
        int[] lastSeen = new int[256];

        for (int i = 0; i < 256; i++) {
            lastSeen[i] = -1;
        }

        for (int end = 0; end < s.length(); end++) {
            char current = s.charAt(end);
            if (lastSeen[current] >= start) {
                start = lastSeen[current] + 1;
            }
            lastSeen[current] = end;
            if (end - start + 1 > maxLen) {
                maxLen = end - start + 1;
                startIndex = start;
            }
        }

        return s.substring(startIndex, startIndex + maxLen);
    }
}
