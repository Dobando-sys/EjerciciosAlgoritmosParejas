import java.util.Scanner;

public class ejercicioUno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        float numeroA = sc.nextFloat();

        System.out.println("Ingrese el segundo número:");
        float numeroB = sc.nextFloat();

        sc.close();

        System.out.println("La suma de los números es: " + (numeroA + numeroB));
        System.out.println("La resta de los números es: " + (numeroA - numeroB));
    }
}
