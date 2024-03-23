import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj długość podstawy trójkąta: ");
        double podstawa = scanner.nextDouble();

        System.out.print("Podaj wysokość trójkąta: ");
        double wysokosc = scanner.nextDouble();

        double pole = obliczPoleTrojkata(podstawa, wysokosc);
        System.out.println("Pole trójkąta wynosi: " + pole);
    }

    public static double obliczPoleTrojkata(double podstawa, double wysokosc) {
        return 0.5 * podstawa * wysokosc;
    }
}
