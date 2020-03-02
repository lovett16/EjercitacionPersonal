package operacionesmatematicas;

/*---------------------------- BREVE DESCRIPCIÓN DEL PROGRAMA -------------------------------------------------------------------------
        Programa que realiza operaciones matemáticas de suma, resta, multiplicación y división.
        En dicho programa el usuario puede elegir los números y el tipo de operación matemática a realizar.
        El siguiente programa si bien se puede optimizar, tiene como objetivo la implementación de estructuras básicas de programación, 
        como operadores, expresiones, estructuras de control de flujo, excepciones. 
        No se busca que sea una calculadora, sino demostrar ciertas habilidades en el bloque de código.
        Muchas gracias!!
*/

import java.util.Scanner;

public class OperacionesMatematicas {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el número 1: "); 
        float num1 = teclado.nextFloat();
        System.out.println("Ingrese el número 2: ");
        float num2 = teclado.nextFloat();
        System.out.println("Ingrese el número referido a la operación de su elección: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        int opcionElegida = teclado.nextInt();
        
        switch(opcionElegida){
            case 1:
                System.out.println("Suma entre " + num1 + " y " + num2 + ". Resultado: " +(num1 + num2));
                break;
            case 2:
                System.out.println("Resta entre: " + num1 + " y " + num2 + ". Resultado: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Multiplicación entre " + num1 + " y " + num2 + ". Resultado: " + (num1 * num2));
                break;
            case 4:
                try {
                    System.out.println("División entre " + num1 + " y " + num2 + ". Resultado: " + (num1 / num2));
                    break;
                } catch (Exception e) {
                    System.out.println("No se puede dividir por cero");
                    break;
                }
            default:
                System.out.println("Debe elegir el número asociado a la operación");
        }
    }
}
