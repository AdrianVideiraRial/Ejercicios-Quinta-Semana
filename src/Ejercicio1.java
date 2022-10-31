import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        /*Crear un programa que reciba por parámetros dos números que haya introducido el usuario y devuelva
        si son múltiplos o no con un booleano true o false y muéstralo por pantalla.
        Pista: Para saber si un número es múltiplo de otro, el módulo entre ambos debe de ser 0
        */

        Scanner memoria = new Scanner(System.in);
        int valor1;
        int valor2;

        System.out.println("Por favor introduce el primer número entero");

        valor1=memoria.nextInt();

        System.out.println("Por favor introduce el segundo número entero");

        valor2 = memoria.nextInt();

        int operacion;
        boolean resultado = false;

        operacion=valor1%valor2;

        if (operacion==0){
            resultado=true;
            //System.out.println("Los números son multiplos entre ellos");
        } else {
            resultado=false;
            //System.out.println("Los número no son multiplos entre ellos");
        }

        if (resultado==true){
            System.out.println("Son multiplos");
        }else{
            System.out.println("No son multiplos");
        }

    }
}
