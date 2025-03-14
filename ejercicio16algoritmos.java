import java.util.Scanner;
public class ejercicio16algoritmos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int numeroDos = 0;
        int resultado = 0;
        System.out.println("Ingrese el primer número:");
        numero = sc.nextInt();
        System.out.println("Ingrese el segundo número:");
        numeroDos = sc.nextInt();
        sc.close();
        if (numero > numeroDos){
                System.out.println("El"+ numeroDos + "no es múltiplo de" + numero);} 
                else {
            (resultado = numeroDos % numero);}
            if (resultado == 0){
                System.out.println("El"+ numeroDos + "es múltiplo de"+ numero);
            } else { 
                System.out.println("El"+ numeroDos + "no es múltiplo de" + numero);
            }     
        
    }
}