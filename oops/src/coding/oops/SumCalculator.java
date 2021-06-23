package coding.oops;

public class SumCalculator {
    private double number1;
    private double number2;

    public double getFirstNumber(){
        return this.number1;
    }
    public void setFirstNumber(double number1){
        this.number1 = number1;
    }

    public double getSecondNumber(){
        return this.number2;
    }
    public void setSecondNumber(double number2){
        this.number2 = number2;
    }
    public double getAdditionResult(){
        return getFirstNumber() + getSecondNumber();
    }

    public double getSubtractionResult(){
        return getFirstNumber() - getSecondNumber();
    }

    public double getMultiplicationResult(){
        return getFirstNumber() * getSecondNumber();
    }

    public double getDivisionResult(){
        if (getSecondNumber() == 0){
            System.out.println("the denominator is 0");
        }
        return getFirstNumber() / getSecondNumber();
    }


}
