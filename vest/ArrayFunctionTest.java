import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class ArrayFunctionTest{

    @Test
    public void testThatArrayElementsArePrime(){
        //givin
        int[] given = {4,3,13,5,11,7, 0 , 8 ,3,59};


        //actual
        ArrayFunctions functions = new ArrayFunctions();
        int [] actual = functions.getPrimes(given);
         
        //expected
        int [] result = {3, 13, 5, 11, 7, 3, 59, 0, 0, 0};


        assertArrayEquals(actual, result);

}


    @Test
    public void testThatArrayIsSorted(){
        //given
    int[] given = {4,3,13,5,11,7, 0 , 8 ,3,59};
        //actual
    ArrayFunctions functions = new ArrayFunctions();
    int [] actual = functions.sorted(given);
        //expected
    int [] expected = {0, 3, 3, 4, 5, 7, 8, 11, 13, 59};

        assertArrayEquals(actual, expected);

    }
}

