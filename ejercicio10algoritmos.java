import java.util.Scanner;
public class ejercicio10algoritmos {
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        double promedio = 0.0;
        double asistencia = 0.0; 
        System.out.println("Ingrese su promedio: ");
        promedio = sc.nextInt();
        System.out.println("Ingrese su asistencia: ");
        asistencia = sc.nextInt();
        sc.close();
        if (promedio >= 8.5 && asistencia >= 0.9) {
            System.out.println("¡Felicidades, es usted elegible para una beca!")
        } else { System.out.println("Lo sentimos, usted no es elegible para una beca.")}
    }
}