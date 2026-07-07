package estructura_datos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaContactos {
    // se pide crear una lista de contactos el cual
    // permita preguntar al usuario cuantos desea agregar y segun eso añadir y
    // mostrar los contactos
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        List<String> contactos = new ArrayList<>();
       // contactos.add(2);
        int cantidadcontactos;

        System.out.println("cuantos contactos deseas ingresar");
        cantidadcontactos = entradaDatos.nextInt();
        entradaDatos.nextLine();

        for (int iterador = 0; iterador < cantidadcontactos;iterador++){
            System.out.println("ingrese el contacto: "+(iterador +1));
            String contacto = entradaDatos.next();
            contactos.add(contacto);

        }
        System.out.println("mostrando contactos");
        for (int iterador = 0; iterador < contactos.size(); iterador++){
            System.out.println("el contacto " + (iterador+ 1) + " es "+ contactos.get(iterador));


        }
        System.out.println("busqueda de contactos");
        System.out.println("ingrese el nombre del comntacto a buscar");
        String nombrecontacto = entradaDatos.nextLine().toLowerCase();

        if (contactos.contains(nombrecontacto)){
            System.out.println("el nombre " + nombrecontacto+ "si existe");

        }else{
            System.out.println("el nombre " + nombrecontacto+ " no existe");
        }
        entradaDatos.close();

    }
}
