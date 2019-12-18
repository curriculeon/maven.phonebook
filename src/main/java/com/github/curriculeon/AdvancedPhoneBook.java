package com.github.curriculeon;

import java.util.*;
import java.util.stream.IntStream;

/**
 * Created by leon on 1/23/18.
 */
public class AdvancedPhoneBook {
    private Map<String, List<String>> phoneBook = new LinkedHashMap<>();
    private List<String> listOfPhoneNumbers = new ArrayList<>();
    public AdvancedPhoneBook(Map<String, List<String>> map) {
        phoneBook = map;
    }

    public AdvancedPhoneBook() {
        //this(null);
    }

    public void add(String name, String phoneNumber) {
        listOfPhoneNumbers.add(phoneNumber);
        phoneBook.put(name, listOfPhoneNumbers);
    }

    public void addAll(String name, String... phoneNumbers) {
        for (String s: phoneNumbers)
            listOfPhoneNumbers.add(s);
        phoneBook.put(name, listOfPhoneNumbers);
    }

    public void remove(String name) {
        phoneBook.remove(name);
    }

    public Boolean hasEntry(String name) {
        return phoneBook.entrySet().stream().anyMatch(entry -> IntStream.range(0, entry.getValue().size()).anyMatch(i -> entry.getValue().contains(name)));
    }

    public List<String> lookup(String name) {
        return phoneBook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        for (Iterator<Map.Entry<String, List<String>>> iterator = phoneBook.entrySet().iterator(); iterator.hasNext(); ) {
            Map.Entry<String, List<String>> entry = iterator.next();
            int i = 0;
            while (true) {
                if (i >= entry.getValue().size()) break;
                if (entry.getValue().get(i).equals(phoneNumber))
                    return entry.getKey();
                i++;
            }
        }
        return  "no match";

    }

    public List<String> getAllContactNames() {
        List<String> result = new ArrayList<>();

        /*for (Map.Entry<String,List<String>> entry : phoneBook.entrySet())
            result.add(entry.getKey());*/
        phoneBook.forEach((key, value) -> result.add(key));

        return result;
    }

    public Map<String, List<String>> getMap() {
        return phoneBook;
    }
}
