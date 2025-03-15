import java.util.Scanner;
public class ejercicioSeis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int calificacion = 0; 
        System.out.println("Ingrese su calificacion:");
        calificacion = sc.nextInt ();
        sc.close();
        
        if (calificacion >= 0 && calificacion <=10) {
            if (calificacion >= 6) {
                System.err.println("Aprobado");
            } else {
                System.out.println("Reprobado");  
            }
        } else { 
            System.out.println("Ingrese un valor entre 0 y 10");
            
        }
    }
}
