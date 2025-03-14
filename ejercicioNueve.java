import java.util.Scanner;

public class ejercicioNueve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int numero = sc.nextInt();

        sc.close();

        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("El número es múltiplo de 3 y de 5");
        } else if (numero%3==0) {
            System.out.println("El número es múltiplo de 3, pero no de 5");
        } else if (numero%5==0) {
            System.out.println("El número es múltiplo de 5 pero no de 3");
        } else{
            System.out.println("El número no es múltiplo ni de 3 ni de 5");
        }
    }
}
