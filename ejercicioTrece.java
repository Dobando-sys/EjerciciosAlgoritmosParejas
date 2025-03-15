import java.util.Scanner;

public class ejercicioTrece {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una temperatura en grados Celsius (°C): ");
        float grados = sc.nextFloat();

        sc.close();

        if(grados*9/5+32 < 50) {
            System.out.println("¡Hace frío! (" + (grados*9/5+32) + " °F)");
        } else {
            System.out.println("¡Hace calor! (" + (grados*9/5+32) + " °F)");
        }
    }
}
