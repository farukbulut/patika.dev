package bulut.com.week3.countingletters;

import bulut.com.week3.findingthetwoclosestnumbers.Numbers;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz!!");
        String word = scanner.nextLine();

        // Sadece harfleri bırak ve küçük harfe çevir
        String filteredWord = word.replaceAll("[^a-zA-ZğüşıöçĞÜŞIİÖÇ]", "").toLowerCase();

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < filteredWord.length(); i++) {
            String character = String.valueOf(filteredWord.charAt(i));
            map.put(character, map.getOrDefault(character, 0) + 1);
        }

        System.out.println(map);

    }
}