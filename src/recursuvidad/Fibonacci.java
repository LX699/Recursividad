package recursuvidad;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        System.out.println(" Ingrese el nuemero deseado para realizar fibonacci");
        int numero = intro.nextInt();
        System.out.println("Resultado: " + fibonacci(numero));

    }

    public static int fibonacci(int numero) {
        if (numero == 0) {
            return 0;
        } else if (numero == 1) {
            return 1;
        } else {
            numero = fibonacci(numero - 1) + fibonacci(numero - 2);

        }
        return numero;

    }
}
