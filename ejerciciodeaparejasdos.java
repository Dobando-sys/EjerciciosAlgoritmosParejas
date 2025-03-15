import java.util.Scanner;
public class ejerciciodeaparejasdos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroA = 0;
        System.out.println("Ingrese el numero:");
        numeroA = sc.nextInt(); 
        sc.close ();
       if (numeroA%2 == 0) {
        System.out.println("El numero es par");
        
       } else {
        System.out.println("El numero es impar");
        
       }
            
        }
    }
