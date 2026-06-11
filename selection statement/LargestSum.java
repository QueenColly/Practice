public class LargestSum {
public static void main(String[] args){
        System.out.println(getLargestSum(10, 2, 38, 4, 5);
    }

    public static int getLargestSum(int a, int b, int c, int d, int e) {
        int largest = a;
        int secondLargest = b;

        if (largest < b) {
            secondLargest = largest;
            largest = b;
        } else {
            secondLargest = b;
        }

        if (largest < c) {
            secondLargest = largest;
            largest = c;
        } else if (secondLargest < c){
            secondLargest = c;
        }

        if (largest < d) {
            secondLargest = largest;
            largest = d;
        } else if (secondLargest < d){
            secondLargest = d;
        }

        if (largest < e) {
            secondLargest = largest;
            largest = e;
        } else if (secondLargest < e){
            secondLargest = e;
        }

        return largest + secondLargest;
        
    }

   
}
