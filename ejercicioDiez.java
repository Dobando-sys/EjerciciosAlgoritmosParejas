import java.util.Scanner;

public class ejercicioDiez {
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        double promedio = 0.0;
        double asistencia = 0.0;
        System.out.println("Bienvenido al sistema de becas.");
        System.out.println("Escriba sus respuestas usando la coma (,) como separador decimal."); 
        System.out.println("Ingrese su promedio (entre 1 y 10): ");
        promedio = sc.nextDouble();
        System.out.println("Ingrese su porcentaje de asistencia (entre 0 y 1): ");
        asistencia = sc.nextDouble();
        sc.close();

        if(promedio >= 0 && promedio <= 10 && asistencia >= 0 && asistencia <= 1) {
            if (promedio > 8.4 && asistencia > 0.89) {
                System.out.println("¡Felicidades, es usted elegible para una beca!");
            } else { 
                System.out.println("Lo sentimos, usted no es elegible para una beca.");
            }
        } else {
            System.out.println("Ingrese un valor válido para el promedio y la asistencia.");
        }
    }
}