import org.junit.After;

import org.junit.AfterClass;

import org.junit.Before;

import org.junit.BeforeClass;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;


// Recommended naming of the class:
// [NameOfTheClassUnderTest + Tests]
public class CalculatorPreparedTest {

    // Recommended naming of the test method:
    // [MethodName_StateUnderTest_ExpectedBehavior]
    //
    // Like:
    // void sum_NegativeNumberAs1stParam_ReturnsZero()
    // void sum_NegativeNumberAs2ndParam_ExceptionThrown ()
    // void sum_SimpleValues_Calculated ()

    List<Integer> initials2 = new ArrayList(Arrays.asList(new Integer[]{5, -4, 3}));

    @Before
    public void beforeMethod(){
        System.out.println("BeforeMethodCalled");
    }
    @BeforeClass
    public static void beforeClassMethod(){
        System.out.println("BeforeClassMethodCalled");
    }
    @After
    public void afterMethod(){
        System.out.println("AfterMethodCalled");
    }
    @AfterClass
    public static void afterClassMethod(){
        System.out.println("AfterClassMethodCalled");
    }


    @Test
    public void emtpyTest(){
        System.out.println("emtpyTest called");
        System.out.println("Initials2: " + initials2.get(0));
    }


    @Test
    public void getSum_InitializedInput_ReturnsSum() {

        List<Integer> initials = new ArrayList(Arrays.asList(new Integer[]{5, -4, 3}));
        CalculatorPrepared calculator = new CalculatorPrepared(initials);


        Integer sum = calculator.getSum();


        assertEquals((Integer)4, sum);


        System.out.println("getSum_InitializedInput_ReturnsSum called");
    }

    @Test
    public void getSum_EmptyInput_ReturnsZero() {
        // Setup
        // prepare data, environment for the test
        List<Integer> initials = new ArrayList<>();
        CalculatorPrepared calculator = new CalculatorPrepared(initials);


        int sum = calculator.getSum();


        assertEquals(0, sum);


        System.out.println("getSum_EmptyInput_ReturnsZero called");
    }

    @Test
    public void isPositive_WithPositive_ReturnsTrue(){

        List<Integer> initials = new ArrayList(Arrays.asList(new Integer[]{5, -4, 3}));
        CalculatorPrepared calculator = new CalculatorPrepared(initials);


        boolean isPositive = calculator.isPositive(0);


        assertTrue(isPositive);
        System.out.println("isPositive_WithPositive_ReturnsTrue called");
    }

    @Test
    public void isPositive_WithNegative_ReturnsFalse(){

        List<Integer> initials = new ArrayList(Arrays.asList(new Integer[]{5, -4, 3}));
        CalculatorPrepared calculator = new CalculatorPrepared(initials);


        boolean isPositive = calculator.isPositive(1);


        assertFalse(isPositive);
        System.out.println("isPositive_WithNegative_ReturnsFalse called");
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void isPositive_WithWrongIndex_ThrowsIndexOutOfBoundsException(){

        List<Integer> initials = new ArrayList(Arrays.asList(new Integer[]{5, -4, 3}));
        CalculatorPrepared calculator = new CalculatorPrepared(initials);


        Boolean isPositive = calculator.isPositive(5);
        System.out.println("isPositive_WithWrongIndex_ThrowsIndexOutOfBoundsException called");
    }



    @Test
    public void addNumber(){
        List<Integer> initials = new ArrayList(Arrays.asList(new Integer[]{5, -4, 3}));
        CalculatorPrepared calculator = new CalculatorPrepared(initials);

        calculator.addNumber(65);

        Integer result = calculator.getNumbers().get(3);
        assertEquals((Integer)65, result);
        System.out.println("addNumber called");
    }



    @Test
    public void getMaximum_OneMaximum_ReturnsMaximum(){
        List<Integer> initials = new ArrayList(Arrays.asList(new Integer[]{5, 2, 3, 2, 3, 2}));
        CalculatorPrepared calculator = new CalculatorPrepared(initials);

        int result = calculator.getMaximumOccurence();

        assertEquals(2, result);
        System.out.println("getMaximum_OneMaximum_ReturnsMaximum called");

        // Simply to check how fields behave here
        initials2.set(0, 50);
        System.out.println("Initials2 changed to 50");
    }

    @Test
    public void getMaximum_MoreMaximum_ReturnsNull(){
        List<Integer> initials = new ArrayList(Arrays.asList(new Integer[]{2, 5, 3, 2, 3, 4, 7}));
        CalculatorPrepared calculator = new CalculatorPrepared(initials);

        Integer result = calculator.getMaximumOccurenceFixed();

        assertNull(result);
        System.out.println("getMaximum_MoreMaximum_ReturnsNull called");
    }

}