import org.junit.After;

import org.junit.AfterClass;

import org.junit.Before;

import org.junit.BeforeClass;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void isAnagramTest_twoStrings_isTrue (){
        Anagram ana = new Anagram();

        assertTrue(ana.isAnagram("akik","kika"));
    }
}
