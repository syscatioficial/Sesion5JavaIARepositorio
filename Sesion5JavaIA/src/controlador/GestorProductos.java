
package controlador;
import java.util.ArrayList;
import modelo.Producto;//llamada del paquete modelo y clase producto
import java.util.List;


public class GestorProductos {//inicia clase
    //arraylist almacenamiento 
    List<Producto> productos = new ArrayList<>();
    
    public void agregarProducto(Producto p){//inicia el metodo agregar objetos productos Lista
        productos.add(p);//agreaga objetos producto a la Lista
    }//termina agregarProducto()
    
    public void listarProductos(){//inicia el metodo consultar
        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados....");
            return;
        }
        productos.forEach(System.out::println);//imprime lista de productos
    }//termina metodo para consultar
    
    public Producto buscarPorId(int id){//inicia metodo buscar por campo distintivo id
        for (Producto p : productos) {//inicia foreach
            if (p.getId() == id){//inicia if
                return p;
            }//termina
        }//termina foreach
            return null;
    }//termina metodo 
    
    public void eliminarProducto(int id){//inicia metodo  eliminar
        Producto p = buscarPorId(id);
        if (p != null) {
            productos.remove(p);
            System.out.println("Producto elimnado!!!!");
        } else {
            System.out.println("Error no existe producto....");
        }
    }//termina metodo eliminar 
    
}//termina clase
