/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;
import java.util.Scanner;
public class Ejercicio5 {


    public static void main(String[] args) {
    double SUMA=0, X, Y;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de X: ");
        X = entrada.nextDouble();
        
        SUMA = SUMA + X;
        
        System.out.println("Ingrese el valor de Y: ");
        Y = entrada.nextDouble();
        
        X= X + Math.pow(Y, 2);
        
        SUMA = SUMA + (X/Y);
        System.out.println("EL VALOR DE LA SUMA ES: "+ SUMA);

    }
    
}
