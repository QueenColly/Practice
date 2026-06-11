import org.junit.jupiter.api.Test;
//import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class StringingTest{

    @Test
        public void testReplacments(){

        Stringing string = new Stringing();
        int[] given = {2,3,4,5,6,5};

        int []actual = string.replaceArray(given);

        int []expected = {-1,-1,-1,-1,-1,-1};
        assertArrayEquals(actual,expected);

    }

     @Test
        public void testThatTheTenthElementIsAccurate(){

        Stringing string = new Stringing();
        int[] given = {2,4,5,7,8,9,6,4,3,6,2};

        int []actual = string.tenthElement(given);

        int []expected = {6};
        assertArrayEquals(actual,expected);

    }

    @Test
        public void testThatFloatArrayReturns_TheRandomOutput_FromFirst100elements(){
        
        Stringing string = new Stringing();
        double[] array = new double[100];

        for(int index = 0; index < 100; index++){
            array[index] = Math.random() * 100;
        }

        double[] result = string.getRandom(array);

        assertEquals(100, result.length);
        assertNotNull(result);
    }

     @Test
        public void testThatNumbersInAnArrayAre_Reversible(){
        
        Stringing string = new Stringing();
        int []given =  {2,4,5,7,8,9,6,4,3,6,2};

        int [] actual = string.reverseArray(given);
        int []expected = {2, 6, 3, 4, 6, 9, 8, 7, 5, 4, 2};
        assertArrayEquals(actual,expected);
               }
}
