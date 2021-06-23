package coding.oops;

public class BankAccount {
    private String accNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

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

    public void deposit(double amount){
        this.balance = this.balance + amount;
        System.out.println("Your new Balance is: "+this.balance);
    }

    public void withdrawal(double amount){
        if(this.balance - amount < 0){
            System.out.println("Only "+this.balance+" available. Withdrawal cannot proceed.");
        }else{
            this.balance = this.balance - amount;
            System.out.println("Withdrawal of "+amount+" processed. Remaining balance is "+ this.balance);
        }
    }

}
