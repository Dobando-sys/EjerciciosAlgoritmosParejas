
import java.util.Scanner; 

public class ejercicioDos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Definición de las variables
        int numeroA = 0, numeroB = 0;
        System.out.println("Ingrese el primer numero "); 
        numeroA = sc.nextInt();
        System.out.println("Ingrese el segundo numero " );
        numeroB = sc.nextInt();

        sc.close ();
        
        if (numeroA > numeroB) {
            System.out.println("El primer numero es mayor que el segundo");
        } else { if (numeroB < numeroA) {
        System.out.println("El segundo numero es mayor que el primer numero");
        } else {
            System.out.println("Los dos numeros son iguales");
        }
            
        }
    }
}
    

