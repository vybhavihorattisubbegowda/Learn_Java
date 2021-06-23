package coding.loops;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class InterestCalculate {
    public static void main(String[] args) {
        double d1 = interestCalculate(2000,2);
        BigDecimal bd = new BigDecimal(d1).setScale(2, RoundingMode.HALF_UP);
        System.out.println(bd.doubleValue());

        for(int i = 1; i< 5; i++){
            double result = interestCal(10000.500,i);
            System.out.println("The interest value for 10000.500 is as follows "+String.format("%.2f",result));
        }
        for(int i = 5; i>0; i--){
            double result = interestCal(10000.500,i);
            System.out.println("The interest value for 10000.500 is as follows "+i+"%"+" = "+String.format("%.2f",result));
        }



    }

    public static double interestCalculate(double amount, double interest){
        double result = amount * (interest / 100);
        System.out.println("The interest rate for "+amount+" is "+result);
        return result;
    }

    public static double interestCal(double amount, double interest){
        double result = amount * (interest / 100);
        //System.out.println("The interest rate for "+amount+" is "+result);
        return result;
    }


}
