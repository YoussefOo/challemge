public class Switch {
    public static void main(String [] args) {
//        int value = 3;
//        switch (value){
//            case 1:
//                System.out.println("value was 1");
//                break;
//            case 2:
//                System.out.println("Value is 2");
//                break;
//            case 3: case 4 :case 5:
//                System.out.println("The ");
//                break;
//            default:
//                System.out.println("Was not 1,2,3,4,5 or 5 ");
//        }
//        String month = "July";
//        System.out.println(month + " is " + getQuarter(month)+ " quarter");
//    }
//    public  static  String getQuarter( String month){
//        return switch (month) {
//            case "January", "february", "March" -> "1st ";
//            case "April", " May", "June" -> "2nd";
//            case "July", "August", "September" -> "3rd";
//            case "October", "November", "December" -> "4th";
//            default -> "Bad";
//            // String badResponse = month + " is bad ";
//            // yield badResponse;
//        };

        char variable = 'A';
        switch (variable) {
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie ");
                break;
            case 'D':
                System.out.println("Dog ");
                break;
            case 'E':
                System.out.println(" Easy");
                break;
            default:
                System.out.println(" Not found");
                break;

        }
    }
}
