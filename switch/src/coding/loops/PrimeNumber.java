package coding.loops;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(primeNumber(2));
        loop();
        System.out.println("hai");
        int sum = 0;
        int count = 0;
        for (int i=1; i<=1000; i++){
            if((i%3 == 0) && (i%5 == 0)){
                sum = sum + i;
                System.out.println(i);
                count++;
            }
            if(count == 5){
                break;
            }
        }
        System.out.println(sum);
    }

    public static boolean primeNumber(int n){
        if (n <= 1){
            return false;
        }else{
            for(int i=2; i<= n/2; i++){
                if(n%i == 0){
                    return false;
                }
            }
            return true;
        }

    }
    public static void loop(){
        int count = 0;
        for ( int i = 10; i<15; i++){
            if(primeNumber(i)){
                count = count+1;
                System.out.println(i+" is a prime number");

                if(count == 3){
                    System.out.println("Existing the loop");
                    break;
                }
            }
        }
    }
}
