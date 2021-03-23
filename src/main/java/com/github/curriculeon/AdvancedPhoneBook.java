package com.github.curriculeon;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.*;

/**
 * Created by leon on 1/23/18.
 */
public class AdvancedPhoneBook {
    List<String> contact;
    Map<String, List<String>> advBook;
    public AdvancedPhoneBook() {
        this.advBook = new LinkedHashMap<>();
    }
    public AdvancedPhoneBook(Map<String, List<String>> map) {
        advBook= map;
    }
    public void add(String name, String phoneNumber) {
        if(this.advBook.containsKey(name)) {
           this.contact = this.advBook.get(name);
        }
        else this.contact = new ArrayList<>();
           this.contact.add(phoneNumber);
           advBook.put(name, this.contact);
    }

    public void addAll(String name, String... phoneNumbers) {
        if(this.advBook.containsKey(name)) {
            this.contact = this.advBook.get(name);
            Arrays.asList(phoneNumbers).forEach(a -> this.contact.add(a));
            this.advBook.replace(name, this.contact);
        }
        else{
            this.contact = new ArrayList<>();
            Arrays.asList(phoneNumbers).forEach(a -> this.contact.add(a));
            this.advBook.put(name, this.contact);
        }
    }

    public void remove(String name) {
        if(this.advBook.containsKey(name)) {
            this.advBook.remove(name);
        }
    }

    public Boolean hasEntry(String name) {
        if(this.advBook.containsKey(name)) {
            return true;
        }
        return false;
    }

    public List<String> lookup(String name) {
        return this.advBook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
            for (Map.Entry<String, List<String>> entry : this.advBook.entrySet()) {
                if(entry.getValue().contains(phoneNumber)) {
                    return entry.getKey();
                }
        }
        return null;
    }

    public List<String> getAllContactNames() {
        this.contact = new ArrayList<>();

        for (Map.Entry<String, List<String>> entry : this.advBook.entrySet()) {
                this.contact.add(entry.getKey());
            }
        return this.contact;
    }

    public Map<String, List<String>> getMap() {
        return this.advBook;
    }
}
