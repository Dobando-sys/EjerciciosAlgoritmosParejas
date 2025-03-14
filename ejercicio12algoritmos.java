import java.util.Scanner;
public class ejercicio12algoritmos {
    public static void main(Strinng[] args){
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        System.out.println("Ingrese un número: ");
        numero = sc.nextInt();
        sc.close();
        if (numero < 2) {
        System.out.println("El número"+ numero +"no es primo.");}
        else if (numero == 2 || numero == 3|| numero == 5 || numero == 7) {
        System.out.println("El número"+ numero +"es primo.");}
        else if (numero %2 == 0 || numero %3 == 0 || numero %5 == 0 || numero %7 == 0){
        System.out.println("El número" + numero + "es primo.");}
        else {System.out.println("El número"+ numero + "no es primo.");}
            
    }
}
        