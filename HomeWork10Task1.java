package homeWork10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HomeWork10Task1 {
    public static void main(String[] args) {
        Integer[] array1 = {2, 3, 5, 2, 6, 5, 8, 4, 4, 7, 5, 1};
        String[] array2 = {"abc", "abc", "cba", "sdc"};

        System.out.println(arrayToMap(array1));
        System.out.println(arrayToMap(array2));
    }

    public static <K> Map<K, Integer> arrayToMap(K[] ks) {
        HashMap<K, Integer> hashMap = new HashMap<>();
        for (K k : ks) {
            if (hashMap.containsKey(k)) {
                int value = hashMap.get(k);
                hashMap.replace(k, value + 1);
            } else {
                hashMap.put(k, 1);
            }
        }

        return hashMap;
    }
}

