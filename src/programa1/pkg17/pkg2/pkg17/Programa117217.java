/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa1.pkg17.pkg2.pkg17;
import java.util.Scanner;
/**
 *
 * @author FabricioArturo
 */
public class Programa117217 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
     int numero;
        numero = solicitarNumero();
        calFact(numero);
    }
    
    public static int solicitarNumero(){
        int numero;
        System.out.println("Inserta el numero para sacar factorial:");
        Scanner entradaNumero = new Scanner(System.in);
        numero = entradaNumero.nextInt();
        if (numero < 1 || numero > 10){
            System.out.println("Numero fuera del rango disponible para esta aplicacion.");
            solicitarNumero();
        } else {
            
        }
        return numero;
    }
    
    public static void calFact(int numero){
        int factorial, contador;
        contador = 1;
        factorial = 1;
        do {
            contador++;
            factorial = factorial*(contador);
        } while (contador < (numero));
        System.out.println("El factorial de tu numero es: " + factorial);
    }
    
}