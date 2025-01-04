import java.util.Random;
public class OperacionesMatricesBasico_Ejercicio2 {
    public static void main(String[] args) {
        int tamaño = 3; 
        int[][] matriz1 = new int[tamaño][tamaño];
        int[][] matriz2 = new int[tamaño][tamaño];
        int[][] suma = new int[tamaño][tamaño];
        int[][] multiplicacion = new int[tamaño][tamaño];
        Random random = new Random();
        System.out.println("Matriz 1:");
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                matriz1[i][j] = random.nextInt(10); // Número aleatorio entre 0 y 9
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matriz 2:");
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                matriz2[i][j] = random.nextInt(10); // Número aleatorio entre 0 y 9
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Suma de las matrices:");
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
                System.out.print(suma[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Multiplicación de las matrices:");
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                multiplicacion[i][j] = 0;
                for (int k = 0; k < tamaño; k++) {
                    multiplicacion[i][j] += matriz1[i][k] * matriz2[k][j];
                }
                System.out.print(multiplicacion[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/***
 * Matriz 1:
 * 1 9 8 
 * 8 9 3 
 * 4 5 7 
 * Matriz 2:
 * 5 6 0 
 * 1 9 8 
 * 2 3 1 
 * Suma de las matrices:
 * 6 15 8 
 * 9 18 11 
 * 6 8 8 
 * Multiplicación de las matrices:
 * 30 111 80 
 * 55 138 75 
 * 39 90 47 
 */
