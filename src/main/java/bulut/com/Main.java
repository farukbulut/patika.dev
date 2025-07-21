package bulut.com;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("1. matris Kaç satırlı matris olsun");
        int row_one = scanner.nextInt();
        System.out.println("1. matris Kaç sutunlu matris olsun");
        int column_one = scanner.nextInt();

        int matris[][] = new int[row_one][column_one];
        System.out.println("2. matris Kaç satırlı matris olsun");
        int row_two = scanner.nextInt();
        System.out.println("2. matris Kaç sutunlu matris olsun");
        int column_two = scanner.nextInt();

        int matris2[][] = new int[row_two][column_two];

        for (int i=0; i < matris.length; i++){
            for (int j=0; j < matris[i].length; j++){
                System.out.println(" 1. matrisin " + i + " inci satırı " + j + " inci sutunun giriniz");
                matris[i][j] = scanner.nextInt();
            }
        }

        for (int i=0; i < matris2.length; i++){
            for (int j=0; j < matris2[i].length; j++){
                System.out.println(" 2. matrisin " + i + " inci satırı " + j + " inci sutunun giriniz");
                matris2[i][j] = scanner.nextInt();
            }
        }

        System.out.println("1.matris");
        for (int i=0; i < matris.length; i++){
            for (int j=0; j < matris[i].length; j++){
                System.out.print(matris[i][j]);
            }
            System.out.println();
        }

        System.out.println("2.matris");
        for (int i=0; i < matris2.length; i++){
            for (int j=0; j < matris2[i].length; j++){
                System.out.print(matris2[i][j]);
            }
            System.out.println();
        }

        int row_3 = row_two;
        int column_3 = column_two;
        if (row_one > row_two){
            row_3 = row_one;
        }

        if (column_one > column_two){
            column_3 = column_one;
        }

        int matris_3[][] = new int[row_3][column_3];


        for (int k = 0; k < matris_3.length; k++){
            for (int l = 0; l < matris_3[k].length; l++){
                // İlk matris kontrolü
                boolean matris1Var = (k < matris.length && l < matris[k].length);

                // İkinci matris kontrolü
                boolean matris2Var = (k < matris2.length && l < matris2[k].length);

                // Her iki değer de varsa toplama yap
                if (matris1Var && matris2Var) {
                    matris_3[k][l] = matris[k][l] + matris2[k][l];
                }
                // Sadece birinci matris varsa
                else if (matris1Var) {
                    matris_3[k][l] = matris[k][l];
                }
                // Sadece ikinci matris varsa
                else if (matris2Var) {
                    matris_3[k][l] = matris2[k][l];
                }
                // Hiçbiri yoksa 0
                else {
                    matris_3[k][l] = 0;
                }
            }
        }

        System.out.println("3.matris");
        for (int k = 0; k < matris_3.length; k++){
            for (int l = 0; l < matris_3[k].length; l++){
                System.out.print(matris_3[k][l]);
            }
            System.out.println();
        }


    }
}