import java.util.Scanner;

public class ejercicioSiete {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("¿El comprador es miembro (S/n)?:");
    char respuesta = sc.next().charAt(0);

    System.out.println("Ingrese el valor de la compra: ");
    float valorCompra = sc.nextFloat();

    sc.close();

    if (respuesta == 'S' || respuesta == 's') {
        if (valorCompra > 100) {
            System.out.println("El valor de la compra es: " + valorCompra*0.9);
        } else {
            System.out.println("El valor de la compra es: " + valorCompra);
        }

    }else if (respuesta == 'N' || respuesta == 'n') {
        System.out.println("El valor de la compra es: " + valorCompra);
    } 
    else {
        System.out.println("Respuesta inválida");
    }
 }   
}
