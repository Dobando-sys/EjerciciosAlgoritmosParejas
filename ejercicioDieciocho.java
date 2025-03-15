import java.util.Scanner;
public class ejercicioDieciocho {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String contrasena = "";
    System.out.println("Ingrese la contraseña:");
    contrasena = sc.nextLine();
    sc.close();

    if (contrasena.matches(".*\\d+.*") == true && contrasena.matches(".*[a-zA-Z]+.*") == true && contrasena.length() >= 8){
        System.out.println("Contraseña válida.");
    } else {System.out.println("Contraseña inválida.");}
    }
}