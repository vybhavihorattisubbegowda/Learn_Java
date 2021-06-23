package coding.oops;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() {
        this("foo",2000,"foo@gmail");
        System.out.println("1 constructor is called.");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit,"unknown@gmail");
        System.out.println("2 constructor is called.");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
