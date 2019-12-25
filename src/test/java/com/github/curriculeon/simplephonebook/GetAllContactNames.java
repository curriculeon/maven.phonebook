package com.github.curriculeon.simplephonebook;

import com.github.curriculeon.AdvancedPhoneBook;
import com.github.curriculeon.SimplePhoneBook;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class GetAllContactNames {
    private void test(String[] names) {
        // given
        AdvancedPhoneBook advancedPhoneBook = new AdvancedPhoneBook();
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            advancedPhoneBook.add(name, "");
        }

        // when
        List<String> actualNames = advancedPhoneBook.getAllContactNames();

        // then
        Assert.assertEquals(Arrays.asList(names), actualNames);
    }

    @Test
    public void test0() {
        String[] contactNames = new String[]{"Chris", "Christian", "Christopher", "Christina"};
        test(contactNames);
    }

    @Test
    public void test1() {
        String[] contactNames = new String[]{"Ashley", "Aaron", "Albert", "Alfred"};
        test(contactNames);
    }

    @Test
    public void test2() {
        String[] contactNames = new String[]{"John", "Jacob", "George", "Geoffrey"};
        test(contactNames);
    }
}
