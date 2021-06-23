package coding.excercises;

public class BarkingDog {
    public static boolean shouldWakeup(boolean barking, int hourOfDay){
        if (barking && hourOfDay < 8 || hourOfDay > 22){
            return true;
        }else if(hourOfDay < 0 || hourOfDay > 23){
            return false;
        }
        return false;
    }
}
