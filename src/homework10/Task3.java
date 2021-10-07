package homework10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        String text = "Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It is a general-purpose programming language intended to let programmers write once, run anywhere (WORA), meaning that compiled Java code can run on all platforms that support Java without the need for recompilation. Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of the underlying computer architecture. The syntax of Java is similar to C and C++, but has fewer low-level facilities than either of them. The Java runtime provides dynamic capabilities (such as reflection and runtime code modification) that are typically not available in traditional compiled languages. As of 2019, Java was one of the most popular programming languages in use according to GitHub, particularly for client-server web applications, with a reported 9 million developers.";
        String[] wordsArr = text.split("[ .,()]|[0-9]");
        //System.out.println(Arrays.toString(wordsArr));
        Map<String, Integer> wordCount = new HashMap<>();
        fillMap(wordCount,wordsArr);
        System.out.println(wordCount);
    }

    public static Map<String, Integer> fillMap(Map<String, Integer> map, String[] arr) {
        for (String s : arr) {
            if (!s.equals("")) {
                if (!map.containsKey(s)) {
                    map.put(s, 1);
                } else {
                    map.put(s, map.get(s)+1);
                }
            }
        }
        return map;
    }
}
