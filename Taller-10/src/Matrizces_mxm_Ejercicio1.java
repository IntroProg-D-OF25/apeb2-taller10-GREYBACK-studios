import java.util.Scanner;
public class Matrizces_mxm_Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la matriz (m x m): ");
        int m = sc.nextInt();
        int[][] matriz = new int[m][m];
        System.out.println("Matriz generada:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random() * 100); // Valores entre 0 y 99
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nElementos de la diagonal principal:");
        for (int i = 0; i < m; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();
        System.out.println("\nElementos de la diagonal secundaria:");
        for (int i = 0; i < m; i++) {
            System.out.print(matriz[i][m - 1 - i] + " ");
        }
        System.out.println();
        System.out.println("\nElementos bajo la diagonal principal:");
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println("\nElementos sobre la diagonal principal:");
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println("\nElementos bajo la diagonal secundaria:");
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < m - i; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println("\nElementos sobre la diagonal secundaria:");
        for (int i = 0; i < m - 1; i++) {
            for (int j = m - i; j < m; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println();
    }
}
/***
 * Ingrese el tamaño de la matriz (m x m): 5
 * Matriz generada:
 * 90	22	2	52	41	
 * 22	58	36	24	64	
 * 69	30	93	14	15	
 * 68	99	2	19	6	
 * 79	45	85	35	46	
 *
 * Elementos de la diagonal principal:
 * 90 58 93 19 46 
 * 
 * Elementos de la diagonal secundaria:
 * 41 24 93 99 79 
 *
 * Elementos bajo la diagonal principal:
 * 22 69 30 68 99 2 79 45 85 35 
 *
 * Elementos sobre la diagonal principal:
 * 22 2 52 41 36 24 64 14 15 6 
 *
 * Elementos bajo la diagonal secundaria:
 * 22 58 36 24 69 30 93 68 99 79 
 * 
 * Elementos sobre la diagonal secundaria:
 * 64 14 15 2 19 6 
 */