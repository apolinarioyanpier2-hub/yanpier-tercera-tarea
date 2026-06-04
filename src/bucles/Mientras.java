package bucles;

public class Mientras {
    // se pide crear un algoritmo que permita impremir los numeros del 1 al 5
    public static void main(String[] args) {
        //while (condicion){//entonces
            // bloque de codigo o instrucciones a ejecutar s i es verdadero

        int numero = 0;
        while (numero <= 10){
            System.out.println(numero);
           // numero =numero+2;// forma extensa
            numero+=2;// forma corta, usando operador dde asignacion
        }
    }
}
