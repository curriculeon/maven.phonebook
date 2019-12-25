package com.github.curriculeon.advancedphonebook;

import com.github.curriculeon.AdvancedPhoneBook;
import org.junit.Assert;
import org.junit.Test;

public class ReverseLookupTest {
    @Test
    public void test1() {
        // given
        AdvancedPhoneBook advancedPhoneBook = new AdvancedPhoneBook();
        String expectedName = "John";
        String phoneNumber = "302-555-4545";
        advancedPhoneBook.add(expectedName, phoneNumber);
     //   Assert.assertTrue(advancedPhoneBook.hasEntry(phoneNumber));

        // when
        String actualName = advancedPhoneBook.reverseLookup(phoneNumber);

        // then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void test2() {
        // given
        AdvancedPhoneBook advancedPhoneBook = new AdvancedPhoneBook();
        String expectedName = "Joe";
        String phoneNumber = "302-554-4545";
        advancedPhoneBook.add(expectedName, phoneNumber);
     //   Assert.assertTrue(advancedPhoneBook.hasEntry(phoneNumber));

        // when
        String actualName = advancedPhoneBook.reverseLookup(phoneNumber);

        // then
        Assert.assertEquals(expectedName, actualName);
    }


    @Test
    public void test3() {
        // given
        AdvancedPhoneBook advancedPhoneBook = new AdvancedPhoneBook();
        String expectedName = "Smith";
        String phoneNumber = "302-554-4535";
        advancedPhoneBook.add(expectedName, phoneNumber);
        //Assert.assertTrue(advancedPhoneBook.hasEntry(phoneNumber));

        // when
        String actualName = advancedPhoneBook.reverseLookup(phoneNumber);

        // then
        Assert.assertEquals(expectedName, actualName);
    }
}
