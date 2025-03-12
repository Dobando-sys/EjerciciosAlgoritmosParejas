import java.util.Scanner;

public class ejercicioCinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String UsuarioPredf = "admin";
        String ContraPredf = "1234";

        System.out.println("Ingrese el usuario:");
        String Usuario = sc.nextLine();

        System.out.println("Ingrese la contraseña:");
        String Contrasena = sc.nextLine();

        if (Usuario.equals(UsuarioPredf) && Contrasena.equals(ContraPredf)) {
            System.out.println("Acceso Permitido");
        } else {
            System.out.println("Acceso Denegado");
        }

        sc.close();
    }
}
