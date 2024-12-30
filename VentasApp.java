package producto;
import java.util.*;

public class VentasApp {
    public static void main(String[] args){
            Inventario inventario = new Inventario();
            System.out.println("  PRODUCTOS EN VENTA   ");
            inventario.listaProductos();
    }
}
