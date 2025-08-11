package bulut.com.week3.map;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<String, Integer>();
        scores.put("Ali", 85);

        scores.put("Ayşe", 92);

        scores.put("Mehmet", 78);

        scores.put("Zeynep", 90);

        scores.put("Burak", 88);

        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
