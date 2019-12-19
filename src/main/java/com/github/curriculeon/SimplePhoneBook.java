package com.github.curriculeon;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.LinkedTransferQueue;

/**
 * Created by leon on 12/16/2019.
 */
public class SimplePhoneBook {
    List<String> newPhonebook = new ArrayList<>();
    public void add(String name, String phoneNumberToAdd) {
        newPhonebook.add(name);
        newPhonebook.add(phoneNumberToAdd);
    }

    public String get(String name) {
       for(int i =0; i< newPhonebook.size(); i++){
         if(name == newPhonebook.get(i)){
             return newPhonebook.get(i+1);
         }
       }
       return null;
    }

    public Boolean hasEntry(String phoneNumber) {
        for(int i =0; i< newPhonebook.size(); i++){
            if(phoneNumber == newPhonebook.get(i)){
                return true;
            }
        }
        return false;
    }

    public void remove(String name) {
        for(int i =0; i< newPhonebook.size(); i++){
            if(name == newPhonebook.get(i)){
                newPhonebook.remove(i);
            }
        }
    }

    public List<String> getAllContactNames() {
        List<String> contactBook = new ArrayList<>();
        for(int i =0; i < newPhonebook.size(); i++){
            contactBook.add(newPhonebook.get(i));
            i++;
        }
        return contactBook;
    }

    public String reverseLookup(String phoneNumber) {
        for(int i =0; i< newPhonebook.size(); i++){
            if(phoneNumber == newPhonebook.get(i)){
                return newPhonebook.get(i-1);
            }
        }
        return null;
    }
}
