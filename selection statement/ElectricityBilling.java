public class ElectricityBilling {
public static void main (String[] args){

 double number = getBill(10,20,30);
    System.out.println(number);
}

    public static double getBill (int first, int second , int third){
     double totalBill = first + second + third ;
     double add = 0;
        if(totalBill > 10000){
            add = totalBill + 0.05;
         System.out.println("add 5% tax");
        }
        else{
            add = totalBill + 0.1;
         System.out.println("add 10% tax");
        }
        return add;
    }
}
