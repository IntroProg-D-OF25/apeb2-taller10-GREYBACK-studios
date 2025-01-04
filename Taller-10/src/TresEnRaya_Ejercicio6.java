import java.util.Scanner;
public class TresEnRaya_Ejercicio6 {
    public static void main(String[] args) {
        // Variables
        char[][] tablero = new char[3][3]; 
        char jugadorActual = 'X';
        boolean juegoTerminado = false;
        int fila, columna;
        Scanner tcl = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' '; 
            }
        }
        while (!juegoTerminado) {
            System.out.println("\nTablero:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Jugador " + jugadorActual + ", ingresa fila (0-2) y columna (0-2):");
            fila = tcl.nextInt();
            columna = tcl.nextInt();
            if (tablero[fila][columna] == ' ') {
                tablero[fila][columna] = jugadorActual;
                if (verificarGanador(tablero, jugadorActual)) {
                    System.out.println("\nTablero final:");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(tablero[i][j] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println("¡Jugador " + jugadorActual + " ha ganado!");
                    juegoTerminado = true;
                } else {
                    if (esEmpate(tablero)) {
                        System.out.println("\nTablero final:");
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 3; j++) {
                                System.out.print(tablero[i][j] + " ");
                            }
                            System.out.println();
                        }
                        System.out.println("¡Es un empate!");
                        juegoTerminado = true;
                    } else {
                        jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
                    }
                }
            } else {
                System.out.println("Casilla ocupada, intenta de nuevo.");
            }
        }
        tcl.close();
    }
    public static boolean verificarGanador(char[][] tablero, char jugador) {
        for (int i = 0; i < 3; i++) {
            if ((tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) || // Fila
                (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador)) { // Columna
                return true;
            }
        }
        if ((tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) ||
            (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador)) {
            return true;
        }

        return false;
    }
    public static boolean esEmpate(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
/**
 * Tablero:
  _  _  _ 
  _  _  _ 
  _  _  _ 

Jugador X, ingresa fila (0-2) y columna (0-2):
1 1

Tablero:
  _  _  _ 
  _  X  _ 
  _  _  _ 

Jugador O, ingresa fila (0-2) y columna (0-2):
0 0

Tablero:
  O  _  _ 
  _  X  _ 
  _  _  _ 

Jugador X, ingresa fila (0-2) y columna (0-2):
1 2

Tablero:
  O  _  X 
  _  X  _ 
  _  _  _ 

Jugador O, ingresa fila (0-2) y columna (0-2):
2 2

Tablero:
  O  _  X 
  _  X  _ 
  _  _  O 

Jugador X, ingresa fila (0-2) y columna (0-2):
2 0

Tablero:
  O  _  X 
  _  X  _ 
  X  _  O 

¡Jugador X ha ganado!

 */

