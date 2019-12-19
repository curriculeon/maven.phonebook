package com.github.curriculeon;

import java.util.*;

/**
 * Created by leon on 1/23/18.
 */
public class AdvancedPhoneBook {
    private Map<String, List<String>> book= new LinkedHashMap<>();
    public AdvancedPhoneBook(Map<String, List<String>> map) {
        if(map!=null){this.book.putAll(map);}
    }

    public AdvancedPhoneBook() {
        this(null);
    }

    public void add(String name, String phoneNumber) {
        if(this.hasEntry(name)){
            this.lookup(name).add(phoneNumber);}
        else{
            List<String> entry=new ArrayList<String>();
            entry.add(phoneNumber);
            this.book.put(name, entry);
        }
    }

    public void addAll(String name, String... phoneNumbers) {
        if(this.hasEntry(name)){
            for(String num:phoneNumbers){
                this.lookup(name).add(num);
            }
        }
        else{
            List<String> nums=Arrays.asList(phoneNumbers);
            this.book.put(name,nums);
        }
    }

    public void remove(String name) {
        this.book.remove(name);
    }

    public Boolean hasEntry(String name) {
        return this.book.containsKey(name);
    }

    public List<String> lookup(String name) {
        return this.book.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        List<String> contactNames= this.getAllContactNames();
        String res ="";
        for(String name:contactNames){
            List<String> check = this.lookup(name);
            for(String pNum:check) {
                if (pNum.equals(phoneNumber)) {
                    res = name;
                }
            }

        }
        return res;
    }


    public List<String> getAllContactNames() {
        Set<String> keys= this.book.keySet();
        ArrayList<String> keyL = new ArrayList<>(keys);
        return keyL;
    }

    public Map<String, List<String>> getMap() {
        return this.book;
    }
}
