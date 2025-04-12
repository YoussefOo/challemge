public class FirstClas {
    public static void main(String[] args) {

        int myValue = 30;
        if (myValue == 30){
            System.out.println("This is trure");
        }
        double scdvalue = 50;
        if (myValue> 20 || scdvalue < 40){
            System.out.println(" Holalalalal");
        }
// The Tenary operator
        int myAge = 31;
        String agetext = myAge >=32 ? " Over Therty" : "Still as Kiid";
        int scAge = myAge >=32 ? 32 : 21;
        System.out.println(" This is my Age " + myAge + " : " + agetext + scAge);

        double one = 20.00d;
        double two = 80.00d;
        double tree = (one + two)*100.00d;
        double four = tree%40.00d;
        System.out.println(four);
        boolean five = (four == 0) ? true : false;
        System.out.println(five);
        if(!five){
            System.out.println("Got some remainder ");
        }

    }
}
