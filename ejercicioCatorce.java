import java.util.Scanner;

public class ejercicioCatorce {
    public static void main(String[]args){
        //Definición de las variables
        Scanner sc = new Scanner(System.in);
        double compra = 0;
        boolean descuento = false;
        System.out.println("Ingrese el monto de compra: ");
        compra = sc.nextDouble();

        System.out.println("Tiene descuento? (true/false):");
        descuento = sc.nextBoolean();
        sc.close();
        if (descuento == true && compra > 50){
            compra = compra * 0.85;
            System.out.println("El monto a pagar es: " + compra);
        } else {
            System.out.println("El monto a pagar es: "+ compra);
        }

    }
}