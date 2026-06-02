package selectivas;

import java.util.Scanner;

public class Anidadas {
    // crear un algoritmo que permita evaluar si un
    // estudiante aprobo y obtuvo una buena califiaccion
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        System.out.println("ingrese una calificacion:");
        int calificacion = entradaDatos.nextInt();

        if (calificacion >=13){
            System.out.println("has aprobado");
            if (calificacion >=15){
                System.out.println("obtuviste una buena calificacion");
            }
        }else {
            System.out.println("has reprobado el curso, sigue estudiante");

        }

    }
}
