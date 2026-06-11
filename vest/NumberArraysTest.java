import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

    public class NumberArraysTest{

    @Test
     public static void testThatArrayIsOdd(){
        //givin
        int[] given = {45,60,3,10,9,22};

        //actual
        NumberArrays  function = new NumberArrays ();
        int [] actual = function.getOdd(given);
         
        //expected
        int [] result = {45,3,9};

        assertArrayEquals(actual, result);

}

           @Test
     public static void testThatArrayIsEven(){
        //givin
        int[] given = {45,60,3,10,9,22};

        //actual
        NumberArrays function = new NumberArrays ();
        int [] actual = function.getEven(given);
         
        //expected
        int [] result = {60,10,22};

        assertArrayEquals(actual, result);

}

}

