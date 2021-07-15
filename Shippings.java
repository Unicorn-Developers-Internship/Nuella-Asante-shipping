import java.util.Scanner;

public class Shipping {
    public static void main(String[] args) {
        float w;
        Scanner reader = new Scanner(System.in);
        w = reader.nextFloat();
        if (w > 0 && w <= 2) {
            System.out.println("The cost of the package is USD 2.5");
        } else if (w > 2 && w <= 4) {
            System.out.println("The cost of the package is USD 4.5");
        } else if (w > 4 && w <= 10) {
            System.out.println("The cost of the package is USD 7.5");
        } else if (w > 10 && w <= 20) {
            System.out.println("The cost of the package is USD 10.5");
        } else {
            System.out.println("Package cannot be shipped");
        }
        reader.close();
    }
}