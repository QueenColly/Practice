public class ElectricityBilling {
public static void main (String[] args){

    double result = getBill(800,true);
    System.out.println(result);
}

public static double getBill (int unit, boolean isSeniorCitizen){
    double totalBill =0;
    double discountedBill =0;
    

   
    if(unit > 0 && unit <= 100){
        totalBill = 10 * unit;  
        System.out.println("the bill in the first 100 unit is: " + totalBill);  
        }    
    else if (unit > 100 && unit <= 300){
        int customerBilForFirst100Units = 100 * 10; 
        double customerBillForNext200Units = (unit - 100) * 15;
        totalBill = customerBilForFirst100Units + customerBillForNext200Units;
        System.out.println("the bill in the next 200 unit is: " + totalBill);
        }
    else if(unit > 300){
        int customerBilForFirst100Units = 100 * 10 ;
        int customerBillForNext200Units = 200 * 15;
        double customerBillAbove300Units = (unit - 300) * 20;
        totalBill =  customerBilForFirst100Units + customerBillForNext200Units + customerBillAbove300Units;
           System.out.println("the bill above 300 unit is: " + totalBill);
        }
             System.out.println("the  bill before tax is: " + totalBill);
       if(totalBill > 10000){
       double tax = totalBill * 0.05;
       totalBill = totalBill + tax;
        System.out.println("tax is: " + tax);
         System.out.println("the bill after 5% tax is added is: " + totalBill);
        }
            discountedBill = totalBill;
        if(isSeniorCitizen){
            discountedBill = totalBill * 0.10;
            totalBill = totalBill - discountedBill;
         System.out.println("the bill of senior citizen at 10% discount is: " + totalBill);
                    
        }
         System.out.println("senior citizen: " + isSeniorCitizen);
        System.out.println("the bill is: " + totalBill);
        return totalBill;
    }
}
