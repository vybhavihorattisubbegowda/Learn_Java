package coding.oops;

public class ConstructorMain {
    public static void main(String[] args) {
        Constructor c1 = new Constructor();
        System.out.println(c1.getAccNumber());
        Constructor c2 = new Constructor("foo","foo@gmail.com","176-3797 3077");
        System.out.println(c2.getEmail());
        System.out.println(c2.getAccNumber());

        VipCustomer p1 = new VipCustomer();
        System.out.println(p1.getName());
        System.out.println(p1.getCreditLimit());
        System.out.println(p1.getEmail());

        VipCustomer p2 = new VipCustomer("vybhavi",25000);
        System.out.println(p2.getName());
        System.out.println(p2.getCreditLimit());
        System.out.println(p2.getEmail());


    }
}
