import java.util.Scanner;
public class ejercicioVeinte {
    public static void main (String[]args){
        
        //Definición de las variables
        Scanner sc = new Scanner(System.in);
        float numero1 = 0;
        float numero2 = 0;
        float numero3 = 0;
        float numerador = 0;
        float denominador = 1;
        float resultado = 0;
        System.out.println("Ingrese el primer número:");
        numero1 = sc.nextFloat();
        System.out.println("Ingrese el segundo número:");
        numero2 = sc.nextFloat();
        System.out.println("Ingrese el tercer número:");
        numero3 = sc.nextFloat();
        sc.close();
        denominador = numero1 - numero2;
        if (denominador == 0){
            System.out.println("Eror: División por cero.");
        } else {
            numerador = (numero1 + numero2) * numero3;
            resultado = numerador / denominador;
            System.out.println("El resultado es:"+ resultado);
        }
    }
}