
package vista;
import modelo.Producto;
import controlador.GestorProductos;
import java.util.Scanner;

public class GestionProductosPOO {//inicia clase
    
    public static void main(String[] args) {//inicia main
        Scanner entradaDato=new Scanner(System.in);//captuara cualñquier tipo de dato
        GestorProductos gestor = new GestorProductos();//para uso y llamado de los metodos 
        
        //para alta de productos
        System.out.println("Sistema de productos\nCaptura ID:");
        int id=entradaDato.nextInt();
        System.out.println("Captura Nombre:");
        String nombre=entradaDato.next();
        System.out.println("Captura Precio:");
        double precio=entradaDato.nextDouble();
        System.out.println("Captura Stock:");
        int stock=entradaDato.nextInt();
        
        gestor.agregarProducto(new Producto(id, nombre, precio, stock));//almacena datos N 
        
        //consultar
        gestor.listarProductos();
        //buscar por id
        System.out.println("ID a buscar: ");
        Producto p =gestor.buscarPorId(entradaDato.nextInt());
        System.out.println(p != null ? p : "Producto no encontrado.");
        System.out.println("Captura ID a eliminar :");
        gestor.eliminarProducto(entradaDato.nextInt());
        //consultar para actualizar
        gestor.listarProductos();
    }//termina main
    
    
}//termina clase
