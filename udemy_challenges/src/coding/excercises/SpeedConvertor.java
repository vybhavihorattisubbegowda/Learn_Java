package coding.excercises;

public class SpeedConvertor {
    public static void main(String[] args) {
        printConversion(1.6);
    }

    public static long toMilesPerHour(double kilometersPerHour){

        if (kilometersPerHour < 0){
            return -1;
        }
        return Math.round(kilometersPerHour/1.609);
    }

    public static void printConversion(double kilometerPerHour){
        if(kilometerPerHour < 0){
            System.out.println("Invalid Value");
        }else {
            System.out.println(kilometerPerHour + "km/h = "
                    + toMilesPerHour(kilometerPerHour) + " mi/h");
        }
    }
}
