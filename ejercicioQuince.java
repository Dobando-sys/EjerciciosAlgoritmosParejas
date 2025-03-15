import java.util.Scanner;

public class ejercicioQuince {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();

        sc.close();

        if(edad >= 18) {
            System.out.println("El usuario es un adulto");
        } else if (edad < 12) {
            System.out.println("El usuario es un niño");
        } else {
            System.out.println("El usuario es un adolescente");
        }
    }
}
