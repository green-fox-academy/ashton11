import org.junit.After;

import org.junit.AfterClass;

import org.junit.Before;

import org.junit.BeforeClass;

import org.junit.Test;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;


public class SumTest {

    @Test
    public void sumTest_PositiveNums_sum(){
        Sum newSum = new Sum();
        ArrayList<Integer> number = new ArrayList<>
                (Arrays.asList(new Integer(5), new Integer(3), new Integer(4)));



        assertEquals(newSum.sum(number), 12);
    }

    @Test
    public void sumTest_oneIntegerList_sum() {
        Sum newSum = new Sum();
        ArrayList<Integer> number = new ArrayList<>
                (Arrays.asList(new Integer(5)));


        assertEquals(newSum.sum(number), 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void sumTest_emptyList_sum() {
        Sum newSum = new Sum();
        ArrayList<Integer> number = new ArrayList<>(Collections.emptyList());
        int sum = newSum.sum(number);
    }

    @Test(expected = NullPointerException.class)
    public void sumTest_nullList_sum() {
        Sum newSum = new Sum();
        ArrayList<Integer> number = null;
        int sum = newSum.sum(number);
    }

}
