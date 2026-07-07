package estructura_datos;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        // lista de arreglos - mutables o que pueden
        // ser manipulables al momento de hacer el uso
        /*
        List<tipoDato> nombreListas = new ArrayList<>();

         */
        List<String> frutas = new ArrayList<>();
        frutas.add("piña");
        frutas.add("platano");
        frutas.add("manzana");
        frutas.add("sandia");
        frutas.add("fresa");
        System.out.println(frutas);

        for (int iterador = 0; iterador <= frutas.size(); iterador++) {
            System.out.println(frutas.get(iterador));


        }
    }
}

