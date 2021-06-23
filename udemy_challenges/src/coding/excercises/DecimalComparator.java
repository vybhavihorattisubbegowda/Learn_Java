package coding.excercises;





public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(1.235,1.225));

    }

    public static boolean areEqualByThreeDecimalPlaces(double a, double b){
        //return Math.floor(a * 10000) == Math.floor(b * 10000);
        a = a * 1000;

        b = b * 1000;

        int a1 = (int) a;

        int b1 = (int) b;

        if (a1 == b1) {
            System.out.println("it works");
            return true;
        }

        else
            System.out.println("it doesn't work");
        return false;
    }

}
