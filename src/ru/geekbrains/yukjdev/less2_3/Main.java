package ru.geekbrains.yukjdev.less2_3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "orange", "pineapple", "kiwi", "apple",
                "pear", "passion fruit", "banana", "lemon", "papaya", "orange", "pear", "kiwi", "apple", "passion fruit",
                "banana", "lemon", "papaya", "orange"};
        // HashMap<String, Integer> fruitMap = new HashMap<>();
        //  for (String s : fruits) {
        //      fruitMap.put(s, fruitMap.getOrDefault(s, 0) + 1);

        //  }
        Set setFruit = new HashSet<>(Arrays.asList(fruits));
        HashMap<String, Integer> hm = new HashMap<>();
        for (String fruit : fruits) {
            if (setFruit.contains(fruit)) {
                hm.put(fruit, hm.getOrDefault(fruit, 0) + 1);
            }
        }

        System.out.println(setFruit); // - Список уникальных
        System.out.println(hm); // - сколько раз встречается каждое слово


        PhoneBook pb = new PhoneBook();
        pb.addContact("Иванов", "89204744663");
        pb.addContact("Петров", "89244755555");
        pb.addContact("Сидоров", "8923020202");
        pb.addContact("Зинченко", "892045655");
        pb.addContact("Иванов", "8921124275");
        pb.addContact("Васиьева", "89204552252");
        pb.addContact("Краснов", "89141512465");
        pb.addContact("Сидоров", "8920456682");
        pb.addContact("Петров", "892047444554");

        for (String name : pb.phoneBook.keySet()) {
            System.out.println(name + "/ tel: " + pb.getPhoneBook().get(name));
        }

    }


}
