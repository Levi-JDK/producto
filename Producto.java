package producto;
public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;
    public Producto(){

    }

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public String getNombre(){
            return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public int getCantidad(){
        return cantidad;
    }
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    public void mostrarInfo(){
        System.out.println("Producto: "+ nombre );
        System.out.println("Precio: $"+precio);
        System.out.println("Cantidad disponible: "+cantidad);
    }
    public void calcularDescuento(int porcentaje){
        double precioConDescuento = precio - (precio * porcentaje / 100);
        System.out.println("Precio con descuento (" + porcentaje + "%): $"+ precioConDescuento);
    }
    public void calcularValorTotal(){
        double valorTotal = precio*cantidad;
        System.out.println("El valor total del inventario es: $" + valorTotal);
    }

    public void mostrarAventas(){
        System.out.println(nombre + " :              $" + precio);
    }
}
