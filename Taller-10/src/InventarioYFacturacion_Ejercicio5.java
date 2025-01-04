import java.util.Scanner;
public class InventarioYFacturacion_Ejercicio5 {
public static void main(String[] args) {
        String[][] inventario = new String[100][3]; 
        int totalProductos = 0;
        int opcion = 0;
        String nombre = "";
        String precio = "";
        String cantidad = "";
        int cantidadDeseada = 0;
        double precioUnitario = 0, subtotal = 0, iva = 0, total = 0;
        boolean encontrado = false;
        Scanner tcl = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Gestión de Inventario y Facturación ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Facturar producto");
            System.out.println("3. Mostrar inventario");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            opcion = tcl.nextInt();
            tcl.nextLine(); 
            if (opcion == 1) {
                if (totalProductos < 100) {
                    System.out.print("Nombre del producto: ");
                    nombre = tcl.nextLine();
                    System.out.print("Precio del producto: ");
                    precio = tcl.nextLine();
                    System.out.print("Cantidad en stock: ");
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
                // Facturar producto
                System.out.print("Nombre del producto a facturar: ");
                nombre = tcl.nextLine();
                System.out.print("Cantidad deseada: ");
                cantidadDeseada = tcl.nextInt();
                tcl.nextLine(); 
                encontrado = false;
                for (int i = 0; i < totalProductos; i++) {
                    if (inventario[i][0].equalsIgnoreCase(nombre)) {
                        int stockActual = Integer.parseInt(inventario[i][2]);
                        if (cantidadDeseada > stockActual) {
                            System.out.println("Stock insuficiente.");
                        } else {
                            precioUnitario = Double.parseDouble(inventario[i][1]);
                            subtotal = precioUnitario * cantidadDeseada;
                            iva = subtotal * 0.15;
                            total = subtotal + iva;
                            if (total > 100) {
                                total *= 0.9; // Aplicar descuento del 10%
                                System.out.println("Descuento aplicado por compra mayor a $100.");
                            }
                            System.out.println("\n--- Factura ---");
                            System.out.println("Producto: " + nombre);
                            System.out.println("Cantidad: " + cantidadDeseada);
                            System.out.println("Subtotal: $" + subtotal);
                            System.out.println("IVA (15%): $" + iva);
                            System.out.println("Total a pagar: $" + total);
                            inventario[i][2] = String.valueOf(stockActual - cantidadDeseada);
                        }
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Producto no encontrado.");
                }
            } else if (opcion == 3) {
                // Mostrar inventario
                System.out.println("\n--- Inventario ---");
                for (int i = 0; i < totalProductos; i++) {
                    System.out.println("Producto: " + inventario[i][0]);
                    System.out.println("Precio: " + inventario[i][1]);
                    System.out.println("Cantidad: " + inventario[i][2]);
                    System.out.println("-------------------");
                }
            } else if (opcion == 4) {
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
 * --- Gestión de Inventario y Facturación ---
 * 1. Agregar producto
 * 2. Facturar producto
 * 3. Mostrar inventario
 * 4. Salir
 * Elija una opción: 1
 * Nombre del producto: camisa
 * Precio del producto: 25
 * Cantidad en stock: 50
 * Producto agregado.
 * 
 * --- Gestión de Inventario y Facturación ---
 * 1. Agregar producto
 * 2. Facturar producto
 * 3. Mostrar inventario
 * 4. Salir
 * Elija una opción: 3
 *
 * --- Inventario ---
 * Producto: camisa
 * Precio: 25
 * Cantidad: 50
 * -------------------
 * 
 * --- Gestión de Inventario y Facturación ---
 * 1. Agregar producto
 * 2. Facturar producto
 * 3. Mostrar inventario
 * 4. Salir
 * Elija una opción: 2
 * Nombre del producto a facturar: camisa
 * Cantidad deseada: 4
 * Descuento aplicado por compra mayor a $100.
 * 
 * --- Factura ---
 * Producto: camisa
 * Cantidad: 4
 * Subtotal: $100.0
 * IVA (15%): $15.0
 * Total a pagar: $103.5
 * 
 * --- Gestión de Inventario y Facturación ---
 * 1. Agregar producto
 * 2. Facturar producto
 * 3. Mostrar inventario
 * 4. Salir
 * Elija una opción: 4
 * Saliendo del programa...
 */