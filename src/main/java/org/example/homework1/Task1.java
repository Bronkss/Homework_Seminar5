package org.example.homework1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1) Подсчитать количество вхождения каждого слова
 * Пример:
 * Россия идет вперед всей планеты. Планета — это не Россия.
 * toLoverCase().
 * (Усложнение - игнорировать пунктуацию)*
 */
public class Task1 {
    public static void main(String[] args) {
        Map<String, Integer> mapStr = new HashMap<>();
        String str = "Россия идет вперед всей планеты. Планета — это не Россия.";
        String result = str.replaceAll("\\—|\\.", " ");
        String[] pairs = result.split(" ");
        System.out.println(Arrays.toString(pairs));

        for (String pair: pairs) {
            mapStr.merge(pair, 1,Integer::sum);
        }

        for (var entry : mapStr.entrySet()) {
            System.out.println(entry.getKey() + " встретился " + entry.getValue() + "  раз");
        }
    }
}
