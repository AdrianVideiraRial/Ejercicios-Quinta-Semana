import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        /*Crea un programa que pida al usuario una cadena de caracteres y que muestre por pantalla cada caracter
        de forma individual.
        Pista: Todas las cadenas de caracteres tienen una función conocida como charAt(índice).
        */

        String cadena_texto ="";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe una cadena de texto");
        cadena_texto=entrada.nextLine();

        System.out.println("El texto tiene "+ cadena_texto.length() + " letras");

        int largo=cadena_texto.length();


        for (int i=0;i<=(largo-1);i++){

            System.out.println(cadena_texto.charAt(i));

        }

    }
}
