import java.util.Arrays;
import java.util.Random;

public class Stringing{

public static void main(String[]args){
//7.9 b
    int[] arr = {2,4,5,7,8,9,6,4,3,6,2};
//    int[] array = replaceArray(ar);
//    System.out.println(Arrays.toString(array));
    System.out.println("The output of the replacement of 6 elements in an array is: "+ Arrays.toString(replaceArray(arr)));

//7.9 a
    int[] ar = {2,4,5,7,8,9,6,4,3,6,2};
    int[] array = tenthElement(ar);
    System.out.println("The tenth element is: "+ Arrays.toString(array));
//7.9 a
     int[] arrays = tenthElements(ar);
    System.out.println("The tenth element is: "+arrays[0]);

//7.9 c
    Random random = new Random();
  
    float numbers[] = new float[100];
    for(int index = 0; index < 100;index++){
    numbers[index] = random.nextFloat(0,101);            
    }
    float[] maximum = getMaximum(numbers);
    System.out.println("The maximum number of 100 number is: "+ Arrays.toString(maximum));
    System.out.println(Arrays.toString(numbers));


    Random main = new Random();
    double result []= new double [100]; 
    for(int index = 0; index < 100; index++){
    result[index] = main.nextDouble(0,101);
    }
    double [] d = getRandom(result);
    System.out.println("100 random numbers are : "+ Arrays.toString(d));

//reverse array
    int[] ary = {2,4,5,7,8,9,6,4,3,6,2};
    int[] arrayElement = reverseArray(ary);
    System.out.println("The reverse elements are: "+ Arrays.toString(arrayElement));
}

//7.9 b
public static int[] replaceArray(int [] array){
    int r = -1;
        for(int i = 0; i < 6;i++){
        array[i] = r;
        }
        return array;
        }
//7.9 a
public static int[] tenthElement(int [] array){
  
   int result [] = new int[1];
   result[0] = array[9];
   
    return result;

}
//7.9 a
public static int[] tenthElements(int [] arrays){
  
    int result [] = new int[arrays.length];

    for(int index = 0; index < arrays.length; index++){
   result[index] = arrays[9];
    }
   
    return result;

}
    public static float[] getMaximum(float [] c){
  
    float[] max = new float [1];

    for(int index = 0; index < 100; index++){
        if(max[0] < c[index]){
            max[0] = c[index];
        }
    }
   
    return max;
}

public static double [] getRandom(double[] d){
    double [] b = new double[d.length];

    for(int i = 0; i< 100;i++){
        b[i] = Math.random() * 100;
    }
         return b;
    }

public static int[] reverseArray(int [] arrayElement){
   
   int result [] = new int[arrayElement.length];
   int reverse = 0;
    for(int index = arrayElement.length-1; index >= 0;index--){
        result[reverse] = arrayElement[index];
        reverse ++;
        }
  
    return result;
}
public static int[] productOf(int[]value){
    int []r = new int [100];

    result 
    }
}
