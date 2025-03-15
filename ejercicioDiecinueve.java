import java.util.Scanner;

public class ejercicioDiecinueve {
    public static void main(String[] args) {
        //Definición de las variables
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un valor de velocidad m/s: ");
        float velocidad = sc.nextFloat();

        sc.close();

        if (velocidad > 70) {
            System.out.println("Exceso de velocidad grave.");
        } else if (velocidad > 50) {
            System.out.println("Exceso de velocidad leve.");
        } else if (velocidad ==0) {
            System.out.println("Carro detenido");
        }else if (velocidad < 0) {
            System.out.println("No. No puedes ir a velocidad negativa, Toretto.");  
        }else if (velocidad < 20) {
            System.out.println("La velocidad es demasiado baja.");
        }else {
            System.out.println("Velocidad permitida.");
        }
    }
}
