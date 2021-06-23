package coding.oops;

public class Car {
    private int modelYear;
    private int modelMonth;
    private int modelNumber;
    private String colour;
    private int doors;
    private String model;
    private String engine;

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
