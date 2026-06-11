public class SumLarge {
    public static void main(String[] args){
        System.out.println(getLargest(10,2,38,4,5));
    }

    public static int getLargest(int first,int second,int third,int fourth,int fifth){

        int sumOne =  first + second;           
        int sumTwo = first + third;
        int sumThree = first + fourth;
        int sumFour = first + fifth;
      
        int largestOne = sumOne;
        // compare largestone
        if (largestOne < sumTwo) { // a plain single selection condition
            largestOne = sumTwo; 
        }
        else if(largestOne < sumThree) { // a double selection statement: use when any one result is enough
            largestOne = sumThree;
        }
        else //(largestOne < sumFour) // a double selection statement: use as a final resort if all fail
{
            largestOne = sumFour;
        }

        int sumFive = third + second;
        int sumSix = fourth + second;
        int sumSeven = fifth + second;

        int largestTwo = sumFive;
        // compare largestTwo
        if (largestTwo < sumFive) {
            largestTwo = sumFive;
        }
        if (largestOne < sumSix) {
            largestTwo = sumSix;
        }
        if (largestTwo < sumSeven) {
            largestTwo = sumSeven;
        }
   
        int sumEight = fourth + third;
        int sumNine = fifth + third;
        // compare largestThree
        int largestThree = sumEight;
        if (largestThree < sumEight) {
            largestThree = sumEight;
        }
        if (largestThree < sumNine) {
            largestThree = sumNine;
        }

        int largestFour = fifth + fourth;

        // compare largestThree
        int largestSum = largestOne;

        if (largestSum < largestTwo) {
            largestSum = largestTwo;
        }
            
        if (largestSum < largestThree) {
            largestSum = largestThree;
        }
              
        if (largestSum < largestFour) {
            largestSum = largestFour;
        }

       return largestSum;
    }
}
