package selectivas;

import java.util.Scanner;

public class EjercicioProducto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
                double costo;
        System.out.printf("ingrese el costo del producto:");
        costo = entrada.nextDouble();
        if (costo > 200) {
            System.out.printf("el producto se paga en efectivo.");
        } else if (costo < 200) {
            System.out.printf("el producto se paga con targeta.");
        } else {
            System.out.printf("el costo es exactamente 200.");


        }
    }
    }

