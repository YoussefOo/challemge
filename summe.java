public class summe {
     public static void main(String[] args) {
        System.out.println(x());
    }
    public static int x() {
    ;
        for (int i = 0; i <= 1000000; i++) {
            if (i%2==0|| i % 3 == 0 ||  i % 5 == 0 && ((i+2+3+5) % 2 == 0 || (i+2+3+5) % 3 == 0 || (i+2+3+5) % 5 == 0) ){
                return i;
            }
            System.out.println(i);
        }
        return 0;
    }
}
    