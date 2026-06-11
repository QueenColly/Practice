import java.util.Scanner;

public class UniversityAdmission {
public static void main (String[] args){

    Scanner input = new Scanner(System.in); 
    System.out.print("Enter Mathematics score: ");
    int score1 = input.nextInt();
    System.out.print("Enter English score: ");
    int score2 = input.nextInt();

        getScore(score1,score2);

 }

public static double getScore(int score1, int score2){
        int sum = score1 + score2;
        double average = 0;
        if(score1 >= 70 && score2 >= 60){
            average = (double)sum/2; 
            System.out.println("Admitted");            
        }
         else{
            System.out.println("not admitted");
            }

//        if(score2 >= 60){
//             average = (double)sum/2; 
//            System.out.println("Admitted");
//        }

        if(average >= 80){
             average = (double)sum/2; 
           System.out.println("full admission");
            }

        if(average < 70 || average <= 79 ){
             average = (double)sum/2; 
            System.out.println("conditional admission");
            }
        return average;
    }
}
