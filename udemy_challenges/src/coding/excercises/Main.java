package coding.excercises;

public class Main {
    public static void main(String[] args) {
        long output = SpeedConvertor.toMilesPerHour(10.5);
        System.out.println(output);
        MegaByteConvertor.printMegaBytesAndKiloBytes(2500);
        boolean isBarking = BarkingDog.shouldWakeup(true,11);
        System.out.println(isBarking);
    }
}
