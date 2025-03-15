import java.util.Scanner;

public class ejercicioDiecisiete {
    public static void main(String[] args) {
        
        //Definición de las variables
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el primer lado: ");
        int ladoA1 = sc.nextInt();

        System.out.println("Ingrese el segundo lado: ");
        int ladoB1 = sc.nextInt();

        System.out.println("Ingrese el tercer lado: ");
        int ladoC1 = sc.nextInt();


        sc.close();
        if(ladoA1 + ladoB1 > ladoC1 || ladoA1 + ladoC1 > ladoB1 || ladoB1 + ladoC1 > ladoA1){
            if (ladoA1 > ladoB1 && ladoA1> ladoC1){
                if(Math.pow(ladoA1,2) == (Math.pow(ladoB1,2) + Math.pow(ladoC1,2))){
                    System.out.println("El triángulo es rectángulo");
                }else{
                    System.out.println("El triángulo NO es rectangulo");
                }
            }else if (ladoB1 > ladoA1 && ladoB1> ladoC1){
                if(Math.pow(ladoB1,2) == (Math.pow(ladoC1,2) + Math.pow(ladoA1,2))){
                    System.out.println("El triángulo es rectángulo");
                }else{
                    System.out.println("El triángulo NO es rectangulo");
                }
            }else{
                if(Math.pow(ladoC1,2) == (Math.pow(ladoB1,2) + Math.pow(ladoA1,2))){
                    System.out.println("El triángulo es rectángulo");
                }else{
                    System.out.println("El triángulo NO es rectangulo");
                }
            }
        }else{
            System.out.println("Los lados ingresados no corresponden a un triángulo");
        }
    }
}
