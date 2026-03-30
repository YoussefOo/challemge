// coding exercise: Barking Dog 4
// we have a dog that likes to bark and we need to wake up if the dog is barking at night.

public class BarkingDog {
    public static boolean shouldWakeup(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        return barking && (hourOfDay < 8 || hourOfDay > 22);
    }
}
