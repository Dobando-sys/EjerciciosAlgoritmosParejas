import java.util.Scanner;

public class ejercicioTres {
    public static void main(String[] args) {
        
        //Definición de las variables
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        float numeroA = sc.nextFloat();

        System.out.println("Ingrese el operador (+, -, *, /, %): ");
        char operador = sc.next().charAt(0);

        System.out.println("Ingrese el segundo número:");
        float numeroB = sc.nextFloat();

        sc.close();

        switch (operador) {
            case '+':
                System.out.println("La suma de los números es: " + (numeroA + numeroB));
                break;
            case '-':
                System.out.println("La resta de los números es: " + (numeroA - numeroB));
                break;
            case '*':
                System.out.println("La multiplicación de los números es: " + (numeroA * numeroB));
                break;
            case '/':
                if (numeroB == 0) {
                    System.out.println("No se puede dividir por cero.");
                    break;
                }else{
                    System.out.println("La división de los números es: " + (numeroA / numeroB));
                    break;
                }
            case '%':
                System.out.println("El módulo de los números es: " + (numeroA % numeroB));
                break;
            default:
                System.out.println("Operador inválido.");
        }
    }
}
