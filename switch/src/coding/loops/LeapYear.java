package coding.loops;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(leapYear(2012));
    }
    public static boolean leapYear(int year){
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    return true;
                }else{
                    return false;
                }
            }else{
                return true;
            }
        }else{
            return false;
        }
    }
}
