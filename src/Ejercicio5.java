import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        /*Crea un programa que permita usar una calculadora simple. Debe ofrecer al
        usuario la posibilidad de hacer sumas, restas, multiplicaciones y divisiones.
         */

        Scanner leer = new Scanner(System.in);

         int seleccion_operacion=0;
         double numero1 = 0;
         double numero2 = 0;
         double resultado = 0;

         do{

             System.out.println("Selecciona un número para realizar una operación");
             System.out.println("1 para SUMA");
             System.out.println("2 para RESTA");
             System.out.println("3 para MULTIPLICACION");
             System.out.println("4 para DIVISION");
             System.out.println("5 PARA SALIR DE LA CALCULADORA");
             seleccion_operacion=leer.nextInt();

             if (seleccion_operacion!=5){
                 System.out.println("Introduce el primer número");
                 numero1=leer.nextInt();
                 System.out.println("Introduce el segundo número");
                 numero2=leer.nextInt();
             }
             switch (seleccion_operacion){
                 case 1:
                     seleccion_operacion = 1;
                     resultado = numero1 + numero2;
                     System.out.println("El resultado de la SUMA es "+ resultado);
                     break;
                 case 2:
                     seleccion_operacion = 2;
                     resultado = numero1 - numero2;
                     System.out.println("El resultado de la RESTA es "+ resultado);
                     break;
                 case 3:
                     seleccion_operacion = 3;
                     resultado = numero1 * numero2;
                     System.out.println( "El resultado de la MULTIPLICACION es " + resultado);
                 case 4 :
                     seleccion_operacion = 4;
                     resultado = numero1 / numero2;
                     System.out.println("El resultado de la DIVISION es " + resultado);
                     break;

             }

         }while (seleccion_operacion!=5);

    }
}
