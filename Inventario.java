package producto;


import java.util.*;

public class Inventario {
    private ArrayList<Producto> productos;

// Constructor
    public Inventario(){
        productos = new ArrayList<>();
    }
    public void agregarProducto(Producto producto){
            productos.add(producto);
            System.out.println("Producto agregado: "+producto.getNombre());
    }
    public void mostrarProductos(){
    if (productos.isEmpty()) {
        System.out.println("El inventario esta vacio");
    }else {
        System.out.println("Productos en el inventario: ");
        for (Producto p : productos) {
            p.mostrarInfo();
            System.out.println();
        }
    }
}
public void calcularValorTotal(){
    double valorTotal = 0;
    for (Producto p : productos) {
        valorTotal += p.getPrecio() * p.getCantidad();
    }
    System.out.println("El valor total del inventario es: $"+valorTotal);
}
    public Producto buscarProducto(String nombre) {
        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Producto encontrado:");
                p.mostrarInfo();
                return p;
            }
        }
        System.out.println("Producto no encontrado");
        return null;
    }
    public void actualizarPrecio(String nombre, double nuevoPrecio) {
        Producto producto = buscarProducto(nombre);
        if (producto != null) {
            producto.setPrecio(nuevoPrecio);
            System.out.println("El precio del producto " + producto.getNombre() + " ha sido actualizado a $" + nuevoPrecio);
        } else {
            System.out.println("No se pudo actualizar el precio porque el producto no existe.");
        }
    }
    public void listaProductos(){
        for (Producto p : productos) {
            p.mostrarAventas();
        }
    }
}

