import java.util.Scanner; 
public class ejercicio14algoritmos {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int compra = 0;
        double compraDos = 0.0;
        boolean descuento = false;
        System.out.println("Ingrese el monto de compra: ");
        compra = sc.nextInt();
        System.out.println("Tiene descuento? (true/false):");
        descuento = sc.nextBoolean();
        sc.close();
        if (desuento == true && compra > 50){
            (compraDos = compra * 0.85);
            System.out.println("El monto a pagar es:" + compraDos);
        } else {
            System.out.println("El monto a pagar es: "+ compra);
        }

    }
}