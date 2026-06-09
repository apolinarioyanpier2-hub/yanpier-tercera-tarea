package bucles;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        double gasto;
        double total = 0;
        int contador = 0;
        System.out.println("ingrese los gastos del viaje.");
        System.out.println("ingrese 0 para finalizar.");
        gasto = entradaDatos.nextDouble();
        while (gasto != 0){
            total+=gasto;
            contador ++;
            System.out.println("ingrese otro gasto");
            gasto = entradaDatos.nextDouble();

        }
        System.out.println("cantidad de gastos realizados:"+contador);
        System.out.println("total a gastado:s/"+total);
        entradaDatos.close();

    }
}
