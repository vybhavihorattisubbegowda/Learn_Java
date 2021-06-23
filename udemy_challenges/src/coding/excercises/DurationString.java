package coding.excercises;

public class DurationString {
    public static void main(String[] args) {
        getDurationString(130);

    }
    public static void getDurationStringSample(double minutes, double seconds){
        if(minutes >=0 && (seconds >= 0 && seconds <= 59)){
           double totalSeconds = (minutes * 60) + seconds;
            System.out.println(totalSeconds);
           double hour = totalSeconds / 3600;
           double restSeconds = totalSeconds % 3600;
            System.out.println(restSeconds);// 90

           double minute =  restSeconds / 60;
            System.out.println("a "+minute); //1,5

           double restminute = minute % 1;
            System.out.println(restminute);

           double second = restminute * 60;
            System.out.println(minutes+" M "+seconds+" S "+
                    "is = "+(int)hour+"h "+(int)minute+"m "+(int)second+"s ");
        }else{
            System.out.println("Invalid");
        }
    }

    private static String getDurationString(long minutes, long seconds){
        if(minutes >=0 && (seconds >= 0 && seconds <= 59)){
            long hour = minutes / 60;
            long restMinute = minutes % 60;

            String hourString = hour + "h";
            if (hour < 10){
                hourString = "0"+hourString;
            }

            String minuteString = restMinute + "m";
            if (restMinute < 10){
                minuteString = "0"+minuteString;
            }

            String secondString = seconds + "s";
            if (seconds < 10){
                secondString = "0"+secondString ;
            }

            return (hourString+minuteString+secondString);
        }else{
            return "Invalid";
        }
    }

    private static void getDurationString(long seconds){
        if (seconds > 0){
            long min = seconds / 60;
            long restMin = seconds % 60;
            System.out.println(getDurationString(min,restMin));

        }else{
            System.out.println("Invalid");
        }

    }

}
