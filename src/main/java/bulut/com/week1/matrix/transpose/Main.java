package bulut.com.week1.matrix.transpose;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Matris kaç satırlı olsun: ");
        int row = scanner.nextInt();
        System.out.print("Matris kaç sütunlu olsun: ");
        int column = scanner.nextInt();

        int matrix[][] = new int[row][column];

        // Matris elemanlarını alma
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = getUserInput(scanner, i, j);
            }
        }

        // Transpoze matrisi oluşturma
        int matrix_transpose[][] = new int[column][row];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix_transpose[j][i] = matrix[i][j];
            }
        }

        // Orijinal matrisi yazdırma
        System.out.println("\nGirilen matris:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Transpoze matrisi yazdırma
        System.out.println("\nMatrisin transpozu:");
        for (int i = 0; i < matrix_transpose.length; i++) {
            for (int j = 0; j < matrix_transpose[i].length; j++) {
                System.out.print(matrix_transpose[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close(); // Resource management
    }

    // Kullanıcıdan güvenli bir şekilde sayı alma
    public static int getUserInput(Scanner scanner, int i, int j) {
        while (true) {
            System.out.print("Matrisin " + i + ". satırı " + j + ". sütununu giriniz: ");
            try {
                int value = scanner.nextInt();
                return value;
            } catch (Exception e) {
                scanner.nextLine(); // Buffer temizleme
                System.out.println("Lütfen geçerli bir sayı giriniz!");
            }
        }
    }
}