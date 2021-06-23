package coding.loops;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigits(125));
    }

    private static int sumDigits(int number){
        int sum = 0;
        if (number >= 10){
            while (number > 0) {
                int digit = number % 10;
                sum = sum + digit;
                number = number / 10;
            }
        }else{
            return -1;
        }
        return sum;
    }
}
