package com.github.curriculeon;

import java.util.*;
import java.util.Map.Entry;

/**
 * Created by leon on 12/16/2019.
 */
public class SimplePhoneBook {
    private Map<String, String> phoneBook = new LinkedHashMap<>();
    public void add(String name, String phoneNumberToAdd) {
        phoneBook.put(name, phoneNumberToAdd);
    }

    public String get(String name) {
        return phoneBook.get(name);
    }

    public Boolean hasEntry(String phoneNumber) {
        return phoneBook.containsValue(phoneNumber);
    }

    public void remove(String name) {
        phoneBook.remove(name);
    }

    public List<String> getAllContactNames() {
        List<String> list = new ArrayList<>();

        phoneBook.forEach((key, value) -> list.add(key));

        return list;
    }

    public String reverseLookup(String phoneNumber) {

        return phoneBook.entrySet().stream().filter(entry -> entry.getValue().equals(phoneNumber)).findFirst().map(Entry::getKey).orElse("no match");
    }
}
