package org.example.homework2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 2) Подсчитать количество искомого слова, через map (наполнением значение, 
 * где искомое слово будет являться ключом), вносить все слова не нужно
 */
public class Task2 {
    public static void main(String[] args) {
        Map<String, Integer> mapStr = new HashMap<>();
        String str = "Россия идет вперед всей планеты. Планета — это не Россия. Россия идет";
        String result = str.replaceAll("\\—|\\.", " ");
        String[] pairs = result.split(" ");
        Scanner scanner = new Scanner(System.in);
        String userWord = scanner.nextLine();

        for (String pair: pairs) {
            if(pair.equals(userWord)){
                mapStr.merge(pair, 1,Integer::sum);
            }
        }

        for (var entry : mapStr.entrySet()) {
            System.out.println(entry.getKey() + " встретился " + entry.getValue() + "  раз");
        }
        
    }
}
