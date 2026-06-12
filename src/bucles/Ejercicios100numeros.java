package bucles;

public class Ejercicios100numeros {
    public static void main(String[] args) {

        int total= 0;
        for (int numero = 1; numero<=100; numero++){
            total = numero+total;


        }
        System.out.println("la suma de los primeros 100 numeros:"+ total);


    }
}
