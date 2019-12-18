package com.github.curriculeon;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by leon on 1/23/18.
 */
public class AdvancedPhoneBook {
    Map<String, List<String>> contacts ;
    ArrayList<String> numberList = new ArrayList<String>();
    public AdvancedPhoneBook(Map<String, List<String>> map) {
        contacts = map;
    }

    public AdvancedPhoneBook() {
        contacts = new LinkedHashMap<>();
    }

    public void add(String name, String phoneNumber) {
        numberList.add(phoneNumber);
        contacts.put(name, numberList);
    }

    public void addAll(String name, String... phoneNumbers) {

    }

    public void remove(String name) {
        contacts.remove(name);
    }

    public Boolean hasEntry(String name) {
        return null;
    }

    public List<String> lookup(String name) {
        return null;
    }

    public String reverseLookup(String phoneNumber)  {
        for (Map.Entry<String, List<String>> entry : contacts.entrySet()) {
            System.out.println(entry.getValue());
            //if (entry.getValue().contains(phoneNumber))
               // return entry.getKey();
        }
        return null;
    }

    public List<String> getAllContactNames() {
        return null;
    }

    public Map<String, List<String>> getMap() {
        return null;
    }
}
