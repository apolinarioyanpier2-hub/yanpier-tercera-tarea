package bucles;

public class Factorial {
    public static void main(String[] args) {
        int n = 6;
        int factorial = 1;

        for (int f =1; f <=n; f ++) {
            factorial  *=f;
            System.out.println(" el factorial de" + n + "es:" + factorial);
        }
    }
}
