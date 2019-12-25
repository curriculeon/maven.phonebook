package com.github.curriculeon;


import java.util.*;

/**
 * Created by leon on 12/16/2019.
 */
public class SimplePhoneBook extends AdvancedPhoneBook{
    //AdvancedPhoneBook simpleContact = new AdvancedPhoneBook();

    public void add(String name, String phoneNumberToAdd) {
        super.add(name, phoneNumberToAdd);
    }

    public String get(String name)
        {
        StringBuilder sb = new StringBuilder();
        sb.append(super.lookup(name).get(0));
        return sb.toString();
    }

    public Boolean hasEntry(String phoneNumber)
        {
        return super.hasEntry(phoneNumber);
    }

    public void remove(String name)
        {
        super.remove(name);
    }

    public List<String> getAllContactNames()
        {
        return super.getAllContactNames();
    }

    public String reverseLookup(String phoneNumber)
        {
        return super.reverseLookup(phoneNumber);
    }
}
