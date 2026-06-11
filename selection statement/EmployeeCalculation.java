import java.util.Scanner;

public class EmployeeCalculation {
public static void main (String[] args){

    Scanner input = new Scanner(System.in); 
    System.out.print("Enter the years of empoyment for employee: ");
    int years = input.nextInt();
    System.out.print("Enter the  salary: ");
    double salary = input.nextInt();



    // System.out.println("\nno bonus because number of year is "+ years );  
    
    
   getYears(years,salary); 
   
   
}
    public static double getYears(int years, double salary){
        
    double  bonus = 0;
        
        if(years< 2){
           // System.out.println("\nno bonus because number of year is "+ years );      
            }
        if( years < 5){
            if(salary < 100_000){
            bonus = salary * 0.1;
                 System.out.println("\nsalary is  less than 100,000 and bonus is 10% if year is: "+ years + " and bonus is: "+ bonus );  
                  }   
            else{
            bonus = salary * 0.5;
                 System.out.println("\nsalary is  less than 100,000 and bonus is 5% if year is: "+ years + " and bonus is: "+ bonus );  
                }  
            }
        if(years > 5){           
                if(salary < 100000){
                bonus = salary * 0.2;  
                     System.out.println("\nsalary is  less than 100,000 and bonus is 20% if year is: "+ years + " and bonus is: "+ bonus );         
                }  
                else if ( salary <= 500000){
                bonus = salary *  0.15; 
                     System.out.println("\nsalary is between 100,000 and 500,000 and bonus is 15% if year is: "+ years+ " and bonus is: "+ bonus );     
                }  
                else {
                bonus = salary * 0.1;
                     System.out.println("\nsalary is greater than 500,000 and bonus is 10% if year is: "+ years + " and bonus is: "+ bonus );  
                } 
            }
        return bonus;
    }
}
