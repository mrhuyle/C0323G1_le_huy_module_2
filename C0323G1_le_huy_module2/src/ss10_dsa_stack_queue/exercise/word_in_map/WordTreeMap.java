package ss10_dsa_stack_queue.exercise.word_in_map;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Author: Le Huy C0323G1
 * Decription: Practice using TreeMap to store word in String and count word's occurence(s).
 * Methods used: countWordInString(String string)
 */
public class WordTreeMap {
    public static void main(String[] args) {
        String string = "abc abc   def abc def xyz";
        countWordInString(string);
    }

    public static void countWordInString(String string) {
        Map<String, Integer> wordTreeMap = new TreeMap<>();
        String[] arrWord = string.split("\\s+"); //regex \\s+ stands for " " and more in one occurences
        for (int i = 0; i < arrWord.length; i++) {
            if (wordTreeMap.containsKey(arrWord[i])) {
                wordTreeMap.replace(arrWord[i], wordTreeMap.get(arrWord[i]) + 1);
            } else {
                wordTreeMap.put(arrWord[i], 1);
            }
        }
        Set<String> keySet = wordTreeMap.keySet();
        System.out.println("String: " + string);
        for (String key : keySet) {
            System.out.println("Word: " + key + ". Numbers of word: " + wordTreeMap.get(key));
        }
    }
}
