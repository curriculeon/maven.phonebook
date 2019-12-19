package com.github.curriculeon;

import java.util.*;

/**
 * Created by leon on 12/16/2019.
 */
public class SimplePhoneBook {

    Map<String,String> book = new LinkedHashMap<>();//LinkedHashMap used to keep the order of the insertions
    public void add(String name, String phoneNumberToAdd) {
        this.book.put(name,phoneNumberToAdd);
    }

    public String get(String name) {
        return this.book.get(name);
    }

    public Boolean hasEntry(String phoneNumber) {
        return this.book.containsValue(phoneNumber);
    }

    public void remove(String name) {
        this.book.remove(name);
    }

    public List<String> getAllContactNames() {
        Set<String> keys= this.book.keySet();
        ArrayList<String> keyL = new ArrayList<>(keys);
        return keyL;
    }

    public String reverseLookup(String phoneNumber) {

        List<String> contactNames= this.getAllContactNames();
        String res ="";
        for(String name:contactNames){
            String check = this.get(name);
            if(phoneNumber.equals(check)){
                res = name;
            }

        }
        return res;
    }
}
