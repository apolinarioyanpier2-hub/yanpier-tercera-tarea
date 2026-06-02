package selectivas;

import java.util.Scanner;

public class EjercicioAnidada {
    // se pide crear un algoritmo que permita evaluar el ingreso al sistema
    //mediante el asuario y la clave

    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);

        System.out.println("ingrese su usuario:");
        String usuario = entradaDatos.nextLine();

        System.out.printf("ingrese su contraseña:");
        String clave = entradaDatos.nextLine();

        String usuarioSistema = "juan";
        String claveSistema = "tita123";

        if (usuario.equalsIgnoreCase(usuarioSistema)){
            System.out.println("usuario correcto");

            if (clave.equalsIgnoreCase(claveSistema)){
                System.out.println("bienvenido al sistema");

            }else {
                System.out.printf("clave incorrecta.");

            }

        }else {
            System.out.printf("usuario incorrecto");
        }





    }
}
