import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        /*Crea un programa que calcule la media acumulada de 10 números que introduzca el usuario y muestre
        por pantalla cual es la media en cada momento.
        Pista: La media aritmética es igual a (N1+...+Nm) / m , es decir, la suma de todos los factores dividido
        por la cantidad total de factores.
        */

        int valor_inicial = 0;

        for (int i=1; i<=10; i++){
            int numero = 0;
            Scanner entrada = new Scanner(System.in);
            System.out.println("Introduce un número");
            numero = entrada.nextInt();

            double suma = valor_inicial += numero;
            System.out.println("Resultado suma " + suma);


        }

    }
}
