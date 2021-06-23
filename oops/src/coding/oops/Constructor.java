package coding.oops;

public class Constructor {
    private String accNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;





    public Constructor(){
        this("DE-3797 3077",5000,"Vybhavi","vybhavi@gmail.com","176-3797 3077");
        System.out.println("The empty constructor is called.");
    }

    public Constructor(String accNumber, double balance, String name, String email, String phoneNumber) {
        this.accNumber = accNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("2 constructor is called");
    }

    public Constructor(String name, String email, String phoneNumber) {
        this("DSZ-3797 3077",5000,"foo","foo@gmail.com","176-3797 3077");
        System.out.println("3 constructor is called");
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
