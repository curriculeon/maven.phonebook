package com.github.curriculeon;

import java.util.*;

/**
 * Created by leon on 1/23/18.
 */


public class AdvancedPhoneBook {

    Map<String, List<String>> contacts;
    List<String> numberlist;
    public AdvancedPhoneBook(Map<String, List<String>> map) {
        contacts = new LinkedHashMap<>();
        contacts.putAll(map);
    }

    public AdvancedPhoneBook() {
        contacts = new LinkedHashMap<>();
    }

    public void add(String name, String phoneNumber) {
        if (contacts.containsKey(name)) {
            contacts.get(name).add(phoneNumber);
        } else {
            numberlist=new ArrayList<String>();
            numberlist.add(phoneNumber);
            contacts.put(name,numberlist);
        }

    }

    public void addAll(String name, String... phoneNumbers) {
        for (String s : phoneNumbers) {
            add(name, s);
        }
    }

    public void remove(String name) {
        contacts.remove(name);
    }

    public Boolean hasEntry(String name) {
        return contacts.containsKey(name);
    }

    public List<String> lookup(String name) {
        return contacts.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        for (Map.Entry<String, List<String>> entry : contacts.entrySet())
            if(entry.getValue().contains(phoneNumber))
                return entry.getKey();
        return null;
    }

    public List<String> getAllContactNames() {
        List<String> list =new ArrayList<String>();
        contacts.forEach((key, value) -> list.add(key));
        return list;
    }

    public Map<String, List<String>> getMap() {
        return contacts;
    }
}