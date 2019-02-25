import org.junit.Test;

import org.junit.After;

import org.junit.AfterClass;

import org.junit.Before;

import org.junit.BeforeClass;

import org.junit.Assert.*;


public class SharpieTest {



    @Test (expected = ArithmeticException.class)
    public void testUse_negativeInkAmount_throwNewException(){
        Sharpie sharp = new Sharpie("blue", 10f);
        sharp.use(-10f);
    }



    @Test (expected = ArithmeticException.class)
    public void testConstructor_negativeWidth_throwNewException(){
        Sharpie sharp = new Sharpie("red" , -10f );
    }



    @Test
    public void testCheckInkAmount_negativeInkAmount_penRanOut(){
        Sharpie sharp = new Sharpie("green" , 10f);
        sharp.use(100f);
        sharp.checkInkAmount();

        }
    }
}
