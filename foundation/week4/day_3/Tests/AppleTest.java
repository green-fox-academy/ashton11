import org.junit.After;

import org.junit.AfterClass;

import org.junit.Before;

import org.junit.BeforeClass;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {
    @Test
    public void getApple_appleInput_returnsApple(){
        Apples apple = new Apples("Apple");

        assertEquals("Apple" , apple.getApple());
    }



}
