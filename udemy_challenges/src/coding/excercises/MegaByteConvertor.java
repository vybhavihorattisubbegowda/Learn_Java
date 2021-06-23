package coding.excercises;

public class MegaByteConvertor {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int MB = kiloBytes / 1024;
        int rest = kiloBytes % 1024;
        System.out.println(kiloBytes+"KB = "+MB+"MB "+rest+"KB");
    }
}
