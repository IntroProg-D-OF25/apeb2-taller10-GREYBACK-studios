import java.util.Scanner;
public class InventarioTienda_Ejercicio4 {
    public static void main(String[] args) {
        String[][] inventario = new String[100][3];
        int totalProductos = 0;
        int opcion = 0;
        boolean encontrado = false;
        boolean eliminado = false;
        Scanner tcl = new Scanner(System.in);
        String nombre;
        String precio;
        String cantidad;
        while (true) {
            System.out.println("\n--- Gestión de Inventario ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Actualizar existencias");
            System.out.println("3. Buscar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Mostrar inventario");
            System.out.println("6. Salir");
            System.out.print("Elija una opción: ");
            opcion = tcl.nextInt();
            tcl.nextLine(); 
            if (opcion == 1) {
                if (totalProductos < 100) {
                    System.out.print("Nombre del producto: ");
                    nombre = tcl.nextLine();
                    System.out.print("Precio del producto: ");
                    precio = tcl.nextLine();
                    System.out.print("Cantidad del producto: ");
                    cantidad = tcl.nextLine();
                    inventario[totalProductos][0] = nombre;
                    inventario[totalProductos][1] = precio;
                    inventario[totalProductos][2] = cantidad;
                    totalProductos++;
                    System.out.println("Producto agregado.");
                } else {
                    System.out.println("Inventario lleno.");
                }
            } else if (opcion == 2) {
                // Actualizar existencias
                System.out.print("Nombre del producto a actualizar: ");
                nombre = tcl.nextLine();
                encontrado = false;
                for (int i = 0; i < totalProductos; i++) {
                    if (inventario[i][0].equalsIgnoreCase(nombre)) {
                        System.out.print("Nueva cantidad: ");
                        inventario[i][2] = tcl.nextLine();
                        System.out.println("Existencias actualizadas.");
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Producto no encontrado.");
                }
            } else if (opcion == 3) {
                // Buscar producto
                System.out.print("Nombre del producto a buscar: ");
                nombre = tcl.nextLine();
                encontrado = false;
                for (int i = 0; i < totalProductos; i++) {
                    if (inventario[i][0].equalsIgnoreCase(nombre)) {
                        System.out.println("Producto: " + inventario[i][0]);
                        System.out.println("Precio: " + inventario[i][1]);
                        System.out.println("Cantidad: " + inventario[i][2]);
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Producto no encontrado.");
                }
            } else if (opcion == 4) {
                System.out.print("Nombre del producto a eliminar: ");
                nombre = tcl.nextLine();
                eliminado = false;
                for (int i = 0; i < totalProductos; i++) {
                    if (inventario[i][0].equalsIgnoreCase(nombre)) {
                        for (int j = i; j < totalProductos - 1; j++) {
                            inventario[j] = inventario[j + 1];
                        }
                        totalProductos--;
                        System.out.println("Producto eliminado.");
                        eliminado = true;
                        break;
                    }
                }
                if (!eliminado) {
                    System.out.println("Producto no encontrado.");
                }
            } else if (opcion == 5) {
                System.out.println("\n--- Inventario ---");
                for (int i = 0; i < totalProductos; i++) {
                    System.out.println("Producto: " + inventario[i][0]);
                    System.out.println("Precio: " + inventario[i][1]);
                    System.out.println("Cantidad: " + inventario[i][2]);
                    System.out.println("-------------------");
                }
            } else if (opcion == 6) {
                System.out.println("Saliendo del programa...");
                break;
            } else {
                System.out.println("Opción inválida.");
            }
        }
    }
}
/***
 * 
 * --- Gestión de Inventario ---
 * 1. Agregar producto
 * 2. Actualizar existencias
 * 3. Buscar producto
 * 4. Eliminar producto
 * 5. Mostrar inventario
 * 6. Salir
 * Elija una opción: 1
 * Nombre del producto: fg
 * Precio del producto: 2,50
 * Cantidad del producto: 50
 * Producto agregado.
 * 
 * --- Gestión de Inventario ---
 * 1. Agregar producto
 * 2. Actualizar existencias
 * 3. Buscar producto
 * 4. Eliminar producto
 * 5. Mostrar inventario
 * 6. Salir
 * Elija una opción: 5
 * 
 * --- Inventario ---
 * Producto: fg
 * Precio: 2,50
 * Cantidad: 50
 * -------------------
 * 
 * --- Gestión de Inventario ---
 * 1. Agregar producto
 * 2. Actualizar existencias
 * 3. Buscar producto
 * Eliminar producto
 * 5. Mostrar inventario
 * 6. Salir
 * Elija una opción: 1
 * Nombre del producto: dffg
 * Precio del producto: 3,25
 * Cantidad del producto: 25
 * Producto agregado.
 *
 * --- Gestión de Inventario ---
 * 1. Agregar producto
 * 2. Actualizar existencias
 * 3. Buscar producto
 * 4. Eliminar producto
 * 5. Mostrar inventario
 * 6. Salir
 * Elija una opción: 5
 *
 * --- Inventario ---
 * Producto: fg
 * Precio: 2,50
 * Cantidad: 50
 * -------------------
 * Producto: dffg
 * Precio: 3,25 
 * Cantidad: 25
 * -------------------
 *
 * --- Gestión de Inventario ---
 * 1. Agregar producto
 * 2. Actualizar existencias
 * 3. Buscar producto
 * 4. Eliminar producto
 * 5. Mostrar inventario
 * 6. Salir
 * Elija una opción: 6
 * Saliendo del programa...
 */

