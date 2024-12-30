import producto.Inventario;
import producto.Producto;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Inventario inventario = new Inventario();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n=== Menú del Inventario ===");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Calcular valor total del inventario");
            System.out.println("4. Buscar producto por nombre");
            System.out.println("5. Actualizar precio de producto");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.println("Nombre del producto: ");
                    String nombre = sc.nextLine();
                    System.out.print("Precio del producto: ");
                    double precio = sc.nextDouble();
                    System.out.print("Cantidad del producto: ");
                    int cantidad = sc.nextInt();
                    Producto nuevoProducto = new Producto(nombre, precio, cantidad);
                    inventario.agregarProducto(nuevoProducto);
                    break;
                case 2:
                    inventario.mostrarProductos();
                    break;
                case 3:
                    inventario.calcularValorTotal();
                    break;
                case 4:
                    System.out.println("Nombre del producto a buscar: ");
                    String nombreBuscado = sc.nextLine();
                    inventario.buscarProducto(nombreBuscado);
                    break;
                case 5:
                    System.out.println("Nombre del producto a cambiar precio: ");
                    String nombreActualizar = sc.nextLine();
                    System.out.println("Ingrese el nuevo precio: ");
                    double precioNuevo = sc.nextDouble();
                    inventario.actualizarPrecio(nombreActualizar,precioNuevo);
                    break;
                case 6:
                    System.out.println("Saliendo del sistema de inventarios. . . ");
                    break;
                default:
                    System.out.println("Opcion invalida, intentalo de nuevo");
            }
        } while (opcion != 6);
        sc.close();
    }
}
