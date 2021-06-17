public class HelloWorld {

    public static void main(String[] args) {
        System.out.println((10 + 5) + (2 * 5));
        System.out.println(Integer.MAX_VALUE);
        int pound = 2;
        double kg = 0.45359237;
        double result = pound * kg;
        System.out.println(result);
        System.out.println(sum(10, 20));
        System.out.println(check());
        int x = 10;
        boolean age = x >= 10 ? true : false;
        System.out.println("The age is " + age);
        challenge();
        finalScore(false,5,150,50);


    }

    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }

    public static boolean check() {
        boolean a = true;
        int y = 120;
        boolean age = y >= 125 ? true : false;
        System.out.println(age);
        if (!a) {
            return true;
        } else {
            return false;
        }
    }

    public static void challenge() {
        String text;
        double x = 20.00d;
        double y = 30.00d;
        double result = (x + y) * 100.00;
        System.out.println(result);
        double reminder = (result % 40.00);
        System.out.println(reminder);
        boolean check = (reminder == 0) ? true : false;
        System.out.println(check);
        if (!check) {
            text = "Got some reminder";
            System.out.println(text);
        } else {
            text = "Got no reminder";
            System.out.println(text);
        }
        System.out.println("hai "+text);
    }

    public static int finalScore(boolean gameOver,int levelCompleted,int score,int bonus){
        int finalScore;
        if(!gameOver){
            finalScore = -1;
            System.out.println("you have scored "+finalScore);
        }else{
            finalScore = score + (levelCompleted * bonus);
            System.out.println("You have got "+finalScore);
        }
        return finalScore;
    }

}





