import java.util.Arrays;

public class ArrayFunctions{
public static void main(String[] args){

    int[] numbers = {4,3,13,5,11,7, 0 , 8 ,3,59};

    
    System.out.println(Arrays.toString(getPrimes(numbers)));

    System.out.println(Arrays.toString(sorted(numbers)));

    }



    public static int[] sorted(int[] numbers){

        for (int index = 0; index < numbers.length; index++){


            for(int inner = index + 1; inner < numbers.length; inner ++){
                
                if(numbers[index] > numbers[inner]){

                  int collete = numbers[index];
                    numbers[index] = numbers[inner];
                    numbers[inner] = collete;
                }

            }
            
            

          }

         return numbers;
    } 


    public static int[] getPrimes(int[] numbers){
            
        int[] arrays = new int [numbers.length];

        int counter = 0;
       
        for(int outer = 0; outer < numbers.length; outer++){

                 int count = 0;
            for(int inner = 2 ; inner < numbers[outer]; inner++){
                if(numbers[outer] % numbers[inner] == 0){
                    count++;
                        break;        
            
            }

    

}
            if(count ==0 && numbers[outer] > 1){

            arrays[counter] = numbers[outer];
                counter++;
    
         
    }

}
                return arrays;



  



}             
}



