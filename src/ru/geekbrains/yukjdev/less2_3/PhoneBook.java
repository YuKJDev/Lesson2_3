package ru.geekbrains.yukjdev.less2_3;


import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {

    HashMap<String, HashSet<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void addContact(String name, String phone) {
        HashSet<String> contact = phoneBook.getOrDefault(name, new HashSet<>()); //Если есть контакт с такой же фамилией, то добавляем еще один номер телефона
        contact.add(phone);
        phoneBook.put(name, contact);
    }

    public HashMap<String, HashSet<String>> getPhoneBook() {
        return phoneBook;
    }

    //    public void findAndPrint(String name) {
//        System.out.println("Фамилия - " + name + " / № телефона: " + phoneBook.getOrDefault(name, new HashSet<>()));
//    }


}
