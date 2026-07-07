package estructura_datos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaNotas {
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        List<Integer> notas = new ArrayList<>();

        int cantidadNotas;


        System.out.println("cuantas notas deseas ingresar");
        cantidadNotas = entradaDatos.nextInt();

        for (int iterrador = 0; iterrador < cantidadNotas; iterrador++){
            System.out.println("ingrese la nota: "+(iterrador + 1));
            int nota = entradaDatos.nextInt();
            notas.add(nota);


        }
        System.out.println("mostrando notas");
        for (int iterrador = 0; iterrador < notas. size();iterrador++){
            System.out.println("la nota "+ (iterrador + 1)+ " es "+ notas.get (iterrador));
            int nota = notas.get(iterrador);
            //
            if (nota >=13){
                System.out.println("la nota" + (iterrador + 1)+ "es" + nota+"aprobado");

        }else {
                System.out.println("la nota" + (iterrador+1)+ " es" + nota + " desaprobado");
            }

        }





        entradaDatos.close();

    }
}
