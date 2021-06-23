package coding.excercises;

public class HashEqualSum {
    public static void main(String[] args) {
        System.out.println(hashEqualSum(1,+(-1),2));
    }


    public static boolean hashEqualSum(int a, int b, int c){
        if ( a + b == c){
            return  true;

        }else{
            return  false;
        }

    }
}
