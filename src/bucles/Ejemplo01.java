package bucles;

import java.util.Scanner;

public class Ejemplo01 {
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        String nombreusuario = "";
        String clave = "";

        while (!nombreusuario.equals("juan") || !clave.equals("12345")){
            System.out.println("ingrese nombre de usuario");
            nombreusuario = entradaDatos.nextLine();

            System.out.println("ingrese su clave");
            clave = entradaDatos.nextLine();

            if (!nombreusuario.equals("juan") || !clave.equals("12345")){
                System.out.println("datos incorrectos, no puedes ingresar");

            }
        }
        System.out.println("bienvenido al sistema,");

        entradaDatos.close();

    }
}
