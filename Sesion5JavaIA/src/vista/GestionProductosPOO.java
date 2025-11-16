
package vista;
import modelo.Producto;
import controlador.GestorProductos;
import java.util.Scanner;

public class GestionProductosPOO {//inicia clase
    
    public static void main(String[] args) {//inicia main
        Scanner entradaDato=new Scanner(System.in);//captuara cualñquier tipo de dato
        GestorProductos gestor = new GestorProductos();//para uso y llamado de los metodos 
        int ciclo;
        
        do{//inicia do
         System.out.println("Menu Productos\n1. Agregar\n2. Consultar\n3.Eliminar\n4.Salir\n");
            ciclo=entradaDato.nextInt();//para capturar opcion de menu
            switch(ciclo){//incia switch
                case 1:
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
                    break;
                case 2:gestor.listarProductos();break;
                case 3:
                     //buscar por id
        System.out.println("ID a buscar: ");
        Producto p =gestor.buscarPorId(entradaDato.nextInt());
        System.out.println(p != null ? p : "Producto no encontrado.");
        System.out.println("Captura ID a eliminar :");
        gestor.eliminarProducto(entradaDato.nextInt());
        //consultar para actualizar
        gestor.listarProductos();
                    break;
                case 4:System.out.println("Finalizo programa !!!!!"); break;
                default:System.out.println("Opcion invalida solo tengo 1,2,3,4");break;
            }//termina switch
        }while(ciclo!=4);//termina do-while
    }//termina main
}//termina clase
