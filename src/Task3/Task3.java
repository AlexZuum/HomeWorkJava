package Task3;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        String[] words = {"dog", "cat", "pet", "lock", "mock", "lock", "fork", "mock", "golf", "lock"};

        // Task 1.a
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println("");

        // subtask 1.b.
        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);
        System.out.println("");

        // subtask 2
        Phonebook pb = new Phonebook();

        pb.add("Fedotod", "1234566");
        pb.add("Haritoniv", "6255656");
        pb.add("Antipin", "6569696");
        pb.add("Semenov", "5658881");


        System.out.println(pb.get("Semenov"));
    }
}
