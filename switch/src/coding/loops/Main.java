package coding.loops;

public class Main {

    public static void main(String[] args) {
        switchCase("jaNuary");
    }

    public static void switchCase(String month){

        switch(month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "february":
                System.out.println("Feb");
                break;
            case "märz":
                System.out.println("März");
                break;
            case "april":
                System.out.println("Apr");
                break;
            case "mai":
                System.out.println("Mai");
                break;
            default:
                System.out.println("Month not found");
        }
    }
}
