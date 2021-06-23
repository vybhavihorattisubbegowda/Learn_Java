package coding.oops;

public class Car {
    private int modelYear;
    private String colour;
    private int doors;
    private String model;

    public String getModel(){
        return this.model;
    }
    public void setModel(String model){
        String input = model.toLowerCase();
        if (input.equals("porsche") || input.equals("Audi")){
            this.model = model;
        }
    }
}
