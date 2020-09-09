package sumamatrices;

import java.util.Scanner;

public class SumaMatrices {

    int[][] array1;
    int[][] array2;
    int[][] array3;

    public SumaMatrices(int i, int j) {

        array1 = new int[i][j];
        array2 = new int[i][j];
        array3 = new int[i][j];

    }

    public void LlenarMatrices() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los datos de la primera Matriz: ");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = entrada.nextInt();

            }

        }

        System.out.println("Ingrese los datos de la segunda Matriz: ");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = entrada.nextInt();

            }
        }

        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                array3[i][j] = array1[i][j] + array2[i][j];

            }
        }
    }

    public void imprimirMatriz() {
        System.out.println("Matriz 1 : ");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.println("[" + array1[i][j] + ""
                        + "]");
            }

            System.out.println(" ");
        }

        System.out.println("Matriz 2 : ");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.println("[" + array2[i][j] + " "
                            +"]");
            }
            System.out.println(" ");
        }
    }

    public void SumarMatrices() {
        System.out.println("Matriz sumada es igual a :  ");
        for(int i = 0; i< array3.length; i++){
          for(int j=0; j< array3[i].length; j++){
              System.out.println("[" + array3[i][j] + " "
                   + "]");
          }  
            System.out.println(" ");
        }
    }

}


