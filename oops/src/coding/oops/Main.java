package coding.oops;

public class Main {
    public static void main(String[] args) {
        /*
        Car c1 = new Car();
        c1.setModel("Porsche");
        System.out.println(c1.getModel());

        SumCalculator s1 = new SumCalculator();
        s1.setFirstNumber(9.0);
        s1.setSecondNumber(5.0);
        System.out.println(s1.getAdditionResult());
        System.out.println(s1.getDivisionResult());
        System.out.println(s1.getMultiplicationResult());

        getFullName();

         */
        BankAccount vybhavi = new BankAccount();
        vybhavi.setBalance(100);//vybhavi.balance = 100
        vybhavi.withdrawal(50);
        vybhavi.deposit(100); // vybhavi.balance = vybhavi.balance + 100



    }





    public static boolean isTeen(){
        Person p1 = new Person();
        if(p1.getAge() >= 12 && p1.getAge() <= 20 ){
            return true;
        }else{
            return false;
        }
    }

    public static void getFullName(){
        Person p1 = new Person();
        p1.setFirstName(" ");
        p1.setLastName("Horatti");
        p1.setAge(10);

        String firstName = p1.getFirstName();
        String lastName = p1.getLastName();
        int age = p1.getAge();
        if(firstName.isEmpty() && lastName.isEmpty()){
            System.out.println("Name is:");
        }else if(firstName.isEmpty()){
            System.out.println("Name is: "+lastName);
        }else if(lastName.isEmpty()){
            System.out.println("Name is: "+firstName);
        }else{
            System.out.println("Name is:"+firstName+" "+lastName+". The Age is: "+age);
        }
    }
}
