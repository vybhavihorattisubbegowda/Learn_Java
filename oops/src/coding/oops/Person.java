package coding.oops;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return this.firstName = firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        if(!(age < 0 && age > 100)) {
            this.age = age;
        }else{
            this.age = 0;
        }
    }
}
