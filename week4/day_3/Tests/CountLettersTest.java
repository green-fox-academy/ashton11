import org.junit.After;

import org.junit.AfterClass;

import org.junit.Before;

import org.junit.BeforeClass;

import org.junit.Test;

import java.util.HashMap;

import java.util.Map;

import static org.junit.Assert.*;

public class CountLettersTest {





    @Test
    public void dictionaryTest_realString_countsWell(){
        CountLetters counter = new CountLetters();
        Map<String, Integer> dictionaryTest = new HashMap<>();
        dictionaryTest.put("A" , 4);
        dictionaryTest.put("L" , 1);
        dictionaryTest.put("M" , 1);

        assertEquals(dictionaryTest,counter.dictionary("almaaa"));
    }


    @Test (expected = NullPointerException.class)
    public void dictionaryTest_nullString_exceptionThrown(){
        CountLetters counter = new CountLetters();


        counter.dictionary(null);
    }

    @Test
    public void dictionaryTest_spaces_dunno(){
        CountLetters counter = new CountLetters();
        Map<String, Integer> dictionaryTest = new HashMap<>();
        dictionaryTest.put(" " , 3);

        assertEquals(dictionaryTest , counter.dictionary("   "));
    }
}
