
public class Main {
    public static void main(String[] args) {
        double newheight = covertToCentimeters(68);
        System.out.println("the height in Centimeters: "+ newheight);
        int newfeet = covertToCentimeters(8,5);
        System.out.println("the "+covertToCentimeters(newfeet));
    }

    public static double covertToCentimeters( int height) {
        System.out.println("The height in Inches " + height );
        return height* 2.54 ;
    }
    public static int covertToCentimeters(int height, int height2){
        System.out.println("The height in Feet " + height2 + " the niches aree "+ height);
        return height +(height2 * 12);
    }
}
