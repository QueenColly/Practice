import java.util.Arrays;

public class Practicing{

    public static void main(String[] args){

       int []array = {5,3,2,3,7,1,8,9,2,2,2,2,2};
        //System.out.println(getMinimum(array));

         System.out.println(getMostOccuredNum(array));

                
       int []arrays = {5,3,2,3,7,1,8,9,2,2,2,2,2};
      
             System.out.println(Arrays.toString(getSort(arrays)));

    
    }



    public static int getMostOccuredNum(int [] array){
        int temp = 0;
        for(int count = 0; count < array.length; count++){
            int digitNum = 0;
            for(int index = 0; index <array.length; index++){
                if(array[count] == array[index]){
                  digitNum++;
                }
                if(temp < digitNum ){
                    temp = array[count];
            
                } 
               
                
            }

            }
 return temp;
       
    
}

        public static int[] getSort(int [] arrays){
                  
               // int  arrayss = new int[arrays.length];

            for(int index = 0; index < arrays.length;index++){
                for(int count = index + 1; count < arrays.length; count++){

                    int temp = arrays[index];
                    if(arrays[index] > arrays[count]){
                        arrays[index] = arrays[count];
                        arrays[count] = temp;

                    }
                 }
    
                }
                    return arrays;
            }
      }



