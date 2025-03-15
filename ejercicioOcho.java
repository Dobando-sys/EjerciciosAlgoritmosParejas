import java.util.Scanner;

public class ejercicioOcho {
    public static void main(String[] args) {
        
        //Definición de las variables
        Scanner sc = new Scanner(System.in);
        int year = 0;
        System.out.println("Ingrese un año: ");
        year = sc.nextInt();

        sc.close();

        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println(year + " es bisiesto");
            } else {
                System.out.println(year + " no es bisiesto");
            }
        } else if (year % 4 == 0) {
            System.out.println(year + " es bisiesto");
        } else {
            System.out.println(year + " no es bisiesto");
        }
    }
}
