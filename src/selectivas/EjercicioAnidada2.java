package selectivas;

import java.util.Scanner;

public class EjercicioAnidada2 {
    // se pide crear un algoritmo para una tienda que quiere aplicar descuentos asus clientes
    // si la compra es igual o mayor a 500 y el cliente tiene una menbrecia
    // obtiene el 20% de descuento si no tiene obtiene el 10% y si no cumple ninguno
    // no tiene descuento
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        System.out.println("ingrese el monto de su compra:");
        double MontoCompra = entradaDatos.nextDouble();

        System.out.println("¿ tienes una  menbresia? si o no:");
        String menbresia = entradaDatos.nextLine().toLowerCase();

        if (MontoCompra >= 500){
            System.out.println("has aprobado");
            if (menbresia.equalsIgnoreCase("si")){
                double descuento = MontoCompra *1.20;
                descuento = MontoCompra-descuento;
                System.out.println("tu descuento es el 20% "+descuento);

            }else {
                double descuento =MontoCompra *1.10;
                descuento = MontoCompra-descuento;
                System.out.println("tu descuento es el 10% "+descuento);

            }
        }else {
            System.out.println("no tienes descuento");
        }






    }
}
