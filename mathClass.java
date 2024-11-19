import java.util.Scanner;

public class mathClass {
    public static void main(String[] args) {
        double x = 3.14;
        double y = -10;

        double max = Math.max(x, y);
        double abs = Math.abs(y);
        double square = Math.sqrt(x);
        double floor = Math.floor(x);

        System.err.println(max);
        System.out.println(abs);
        System.out.println(square);
        System.out.println(floor);

        // Find the hypotenus of a triangle
        double firstSide;
        double secondSide;
        double hypo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first side: ");
        firstSide = scanner.nextDouble(); 
        System.out.println("Enter the second side: ");
        secondSide = scanner.nextDouble();

        hypo = Math.hypot(firstSide, secondSide);
        System.out.println("The hypotenus is " + hypo);

        scanner.close();
    }
}
