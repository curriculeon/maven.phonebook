package com.github.curriculeon.simplephonebook;

import com.github.curriculeon.AdvancedPhoneBook;
import com.github.curriculeon.SimplePhoneBook;
import org.junit.Assert;
import org.junit.Test;

public class ReverseLookupTest {
    private void test(String expectedName, String phoneNumber) {
        // given
        SimplePhoneBook phoneBook = new SimplePhoneBook();
        phoneBook.add(expectedName, phoneNumber);
        Assert.assertTrue(phoneBook.hasEntry(expectedName));

        // when
        String actualName = phoneBook.reverseLookup(phoneNumber);

        // then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void test0() {
        String expectedName = "John";
        String phoneNumber = "302-555-4545";
        test(expectedName, phoneNumber);
    }

    @Test
    public void test1() {
        String expectedName = "Smith";
        String phoneNumber = "302-554-4535";
        test(expectedName, phoneNumber);
    }

    @Test
    public void test2() {
        String expectedName = "Harry";
        String phoneNumber = "302-557-4535";
        test(expectedName, phoneNumber);
    }
}
