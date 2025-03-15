import java.util.Scanner;

public class ejercicioOnce {
    public static void main(String[] args) {
        
        //Definición de las variables
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer lado del triángulo: ");
        int ladoA = sc.nextInt();

        System.out.println("Ingrese el segundo lado del triángulo: ");
        int ladoB = sc.nextInt();

        System.out.println("Ingrese el tercer lado del triángulo: ");
        int ladoC = sc.nextInt();

        sc.close();

        if(ladoA + ladoB > ladoC || ladoA + ladoC > ladoB || ladoB + ladoC > ladoA) {

            if(ladoA == ladoB && ladoA == ladoC) {
                System.out.println("El triángulo es equilátero");
            } else if(ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                System.out.println("El triángulo es isósceles");
            } else {
                System.out.println("El triángulo es escaleno");
            }
        } else {
            System.out.println("Los lados ingresados no corresponden un triángulo");
        }
    }
}
