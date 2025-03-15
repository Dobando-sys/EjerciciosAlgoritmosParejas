impor java.util.Scanner;
public class ejercicio20algoritmos {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        int numerador = 0;
        int denominador = 1;
        int resultado = 0;
        System.out.println("Ingrese el primer número:");
        numero1 = sc.nextInt();
        System.out.println("Ingrese el segundo número:");
        numero2 = sc.nextInt();
        System.out.println("Ingrese el tercer número:");
        numero3 = sc.nextInt();
        sc.close();
        (denominador = numero1 - numero2);
        if (denominador == 0){
            System.out.println("Eror: División por cero.");
        } else {
            (numerador = (numero1 + numero 2) * numero3);
            (resultado = numerador / demominador);
            System.out.println("El resultado es:"+ resultado);
        }
    }
}