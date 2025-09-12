public class caseExample {
    public static void main(String[] args){
        int day = 3;
        // This is a new switch expression in java14+
        // Old switch statement is valid and still like c++
        String dayName = switch(day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
        System.out.println("Today is " + dayName);
    }
}
