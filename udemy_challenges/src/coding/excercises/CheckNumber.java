package coding.excercises;

public class CheckNumber {
    public static void main(String[] args) {
        checkNumber(0);
    }

    public static void checkNumber(int number) {
        String status = "Zero ";
        //String status;
        if (number > 0) {
            status = "Positive";
        } else if (number < 0) {
            status = "Negetive";
        }
        //else if (number == 0) {
        //    status = "Zero";
        //}
        System.out.println(status);
    }
}