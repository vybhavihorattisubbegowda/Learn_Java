package coding.excercises;

public class MethodOverLoading {

    public static void main(String[] args) {

        calcFeetAndInchesToCentimeters(40);
        //double cent = calcFeetAndInchesToCentimeters(24);
        //System.out.println(cent);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet >= 0 && (inches >= 0 && inches <= 12)){
            double centimeters = ((feet*12) + inches) * 2.54;
            System.out.println(feet+" feet, "+inches+" inches = "+centimeters+" centimeters");
            return centimeters;
        }else {
            System.out.println("Invalid");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches >= 0 ){
            double feet = (int) inches / 12;
            double remainingInches = (int) (inches % 12);
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }else {
            return -1;
        }
    }
}
