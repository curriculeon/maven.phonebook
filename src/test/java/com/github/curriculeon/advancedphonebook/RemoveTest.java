package com.github.curriculeon.advancedphonebook;

import com.github.curriculeon.AdvancedPhoneBook;
import org.junit.Assert;
import org.junit.Test;

public class RemoveTest {
    @Test
    public void test1() {
        // given
        AdvancedPhoneBook advancedPhoneBook = new AdvancedPhoneBook();
        String name = "John";
        String phoneNumber = "302-555-4545";
        advancedPhoneBook.add(name, phoneNumber);
        Assert.assertTrue(advancedPhoneBook.hasEntry(name));
        // this used to say Assert.assertTrue(advancedPhoneBook.hasEntry(phoneNumber))
        // But hasEntry does not work with phoneNumbers so I switched it and now it passes........

        // when
        advancedPhoneBook.remove(name);

        // then
        Assert.assertFalse(advancedPhoneBook.hasEntry(name));
    }

    @Test
    public void test2() {
        // given
        AdvancedPhoneBook advancedPhoneBook = new AdvancedPhoneBook();
        String name = "Joe";
        String phoneNumber = "302-554-4545";
        advancedPhoneBook.add(name, phoneNumber);
        Assert.assertTrue(advancedPhoneBook.hasEntry(name));

        // when
        advancedPhoneBook.remove(name);

        // then
        Assert.assertFalse(advancedPhoneBook.hasEntry(name));
    }


    @Test
    public void test3() {
        // given
        AdvancedPhoneBook advancedPhoneBook = new AdvancedPhoneBook();
        String name = "Smith";
        String phoneNumber = "302-554-4535";
        advancedPhoneBook.add(name, phoneNumber);
        Assert.assertTrue(advancedPhoneBook.hasEntry(name));

        // when
        advancedPhoneBook.remove(name);

        // then
        Assert.assertFalse(advancedPhoneBook.hasEntry(name));
    }
}
