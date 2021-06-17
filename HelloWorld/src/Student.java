public class Student {
    int a;
    static int b;
    //long myLongValue = 100;
    Student(){
        a++;
        b++;
    }
    public void showData() {
        System.out.println("Value of a = "+a);
        System.out.println("Value of b = "+b);
    }

    public void showValue(){
        System.out.println("Minvalue"+Long.MIN_VALUE);
    }


    public void switchCase() {
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Tursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("week day");
        }
    }
    public void checkDay(int a, String b){
        if(a == 1 && b == "Montag"){
            System.out.println("First Weekday");
        }
        else if (a == 2 && b == "Dienstag"){
            System.out.println("Second Weekday");
        }
        else {
            System.out.println("Some other Weekday");
        }
    }

    public void challenge1(){
        byte a = 10;
        short b = 20;
        int c = 30;
        long d = 5000 + 10 * (a + b + c);
        System.out.println((double) d);
        int i = 0;
        while (i < 10){
            i++;
            System.out.println(i);
        }
        int j = 10;
        do {
            j++;
            System.out.println(j);
        }
        while (j > 20);
    }



}

