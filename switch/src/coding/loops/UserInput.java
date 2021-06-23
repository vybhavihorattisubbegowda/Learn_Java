package coding.loops;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        System.out.println("Please enter your year of birth.");
        boolean isInt = scanner.hasNextInt();
        if(isInt){
            int birthYear = scanner.nextInt();
            if(birthYear >0){
                int currentAge = 2021 - birthYear;
                System.out.println("Hello "+name+", you are "+currentAge+" years old now.");
            }else{
                System.out.println("Please enter a valid year");
            }
        }else{
            System.out.println("Please enter a valid year");
        }
        scanner.close();

         */
        addUserInput();
    }

    private static void addUserInput(){
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int sum = 0;
        while(true){
            System.out.println("Enter number #"+counter+":");
            int inputNum = scanner.nextInt();
            sum = sum + inputNum;
            if( counter == 10){
                break;
            }
            counter++;
        }
        System.out.println("Your total sum is: "+sum);
        scanner.close();
    }


}
