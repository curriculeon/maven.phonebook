package com.github.curriculeon.simplephonebook;

import com.github.curriculeon.SimplePhoneBook;
import org.junit.Assert;
import org.junit.Test;

public class RemoveTest {
    private void test(String name, String phoneNumber) {
        // given
        SimplePhoneBook phoneBook = new SimplePhoneBook();
        phoneBook.add(name, phoneNumber);
        Assert.assertTrue(phoneBook.hasEntry(name));

        // when
        phoneBook.remove(name);

        // then
        Assert.assertFalse(phoneBook.hasEntry(name));
    }

    @Test
    public void test0() {
        String name = "Joe";
        String phoneNumber = "302-554-4545";
        test(name, phoneNumber);
    }

    @Test
    public void test1() {
        String name = "Josh";
        String phoneNumber = "302-555-4545";
        test(name, phoneNumber);
    }

    @Test
    public void test2() {
        String name = "John";
        String phoneNumber = "502-554-4545";
        test(name, phoneNumber);
    }
}