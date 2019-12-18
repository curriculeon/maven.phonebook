package com.github.curriculeon;

import java.util.*;

/**
 * Created by leon on 12/16/2019.
 */
public class SimplePhoneBook {
    LinkedHashMap<String, String> contacts = new LinkedHashMap<String, String>();

    public void add(String name, String phoneNumberToAdd) {
        contacts.put(name, phoneNumberToAdd);
    }

    public String get(String name) {
        return contacts.get(name);
    }

    public Boolean hasEntry(String phoneNumber) {
        return contacts.containsValue(phoneNumber);
    }

    public void remove(String name) {
        contacts.remove(name);
    }

    public List<String> getAllContactNames() {
        List<String> list =new ArrayList<String>();
        contacts.forEach((key, value) -> list.add(key));
        return list;
    }

    public String reverseLookup(String phoneNumber) {
        for (Map.Entry<String, String> entry : contacts.entrySet())
            if(phoneNumber == entry.getValue())
                return entry.getKey();
        return null;
    }
}
