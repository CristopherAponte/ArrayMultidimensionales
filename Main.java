
package sumamatrices;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
      Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas que desee: ");  
        int a = entrada.nextInt();
        System.out.println("Ingrese el numero de columnas que desee: ");  
        int b = entrada.nextInt();  
        
        
        SumaMatrices te = new SumaMatrices(a,b);
        te.LlenarMatrices();
        te.imprimirMatriz();
        te.SumarMatrices();
        
    }
}
