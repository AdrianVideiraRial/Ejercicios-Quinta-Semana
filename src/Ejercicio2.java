import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        /*Crea un programa que pida al usuario un número introducido por el usuario y compruebe, si no es mayor que 100,
         si es primo o no, mostrando un valor booleano true o false.
         Pista: Son número primos aquellos que solo tiene como divisor la unidad (1) y el mismo, como por ejemplo el número 3.
         */

        int divisor = 0;
        int numero;
        boolean primo = true;

        Scanner memoria = new Scanner(System.in);

        System.out.println("Introduce un número");
        numero= memoria.nextInt();
        
        if (numero>100){
            System.out.println("El numero es mayor que 100");
        }else {
            System.out.println("El numero no es mayor a 100");
        }

        for(int i=1;i<=numero;i++) {
            int calculo = numero%i;

            if(calculo==0){
                divisor++;
                //System.out.println("Divisores" + divisor);
            }
        }
        if (divisor>=3){
            primo=false;
            System.out.println("El numero No es primo");
        } else {
            primo=true;
            System.out.println("El numero es primo");

        }



    }

}

