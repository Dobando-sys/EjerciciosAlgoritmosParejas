import java.util.Scanner;
public class ejercicio8algoritmos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = 0;
        System.out.println("Ingrese un año: ");
        year = sc.nextInt(); 
        if (year %100 == 0) {
        if (year %400 == 0){
        System.out.println(year + "es bisiesto");}
        else {System.o9ut.println(year + "no es bisiesto");}
        else if (year %4 == 0) {System.out.println(year + "es bisiesto");}
        else {System.out.println(year + "no es bisiesto")}
    }
}
}