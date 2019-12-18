package com.github.curriculeon;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by leon on 12/16/2019.
 */
public class SimplePhoneBook {
    private Map<String, String> phoneBook = new HashMap<>();
    public void add(String name, String phoneNumberToAdd) {

    }

    public String get(String name) {
        return phoneBook.get(name);
    }

    public Boolean hasEntry(String phoneNumber) {
        return null;
    }

    public void remove(String name) {

    }

    public List<String> getAllContactNames() {
        return null;
    }

    public String reverseLookup(String phoneNumber) {
        return null;
    }
}
