package german.fpconsola;

import java.util.Scanner;
import java.util.ArrayList;

public class FPConsola {
    //Creamos una lista vacía con cien elementos
    public static ArrayList crearLista(){
        ArrayList lista = new ArrayList<>();
        return lista;
    }
    //Pedimos al usuario un dato para agregar a la lista
    public int entradaUsuario(){
        Scanner usuario = new Scanner(System.in);
        System.out.println("Ingrese dato: ");
        int entrada =usuario.nextInt();
        return entrada;
    }
    //Agregamos tipo pila
    public ArrayList agregarPila(ArrayList lista,int entrada){
        lista.add(entrada);
        return lista;
    }
    //Agregamos tipo fila
    public ArrayList agregarFila(ArrayList lista,int entrada){
        lista.add(0, entrada);
        return lista;
    }
    //Eliminamos último elemento
    public ArrayList eliminarPila(ArrayList lista){
        int longitud=lista.size();
        lista.remove(longitud);
        return lista;
    }
    //Eliminamos primer elemento
    public ArrayList eliminarFila(ArrayList lista){
        lista.remove(0);
        return lista;
    }
    //Pedimos la accion. Eliminamos el elemento o agregamos el de entrada
    public ArrayList listaEjecucion(ArrayList lista){
        System.out.println("1 para fila, 2 para pila");
        int menu=entradaUsuario();
        if (menu==1){
            System.out.println("1 para agregar, 2 para eliminar");
            int eleccion=entradaUsuario();
            if (eleccion==1){
                int entrada=entradaUsuario();
                lista=agregarFila(lista,entrada);
                System.out.println(lista);
            }
            else{
                lista=eliminarFila(lista);
                System.out.println(lista);
            }
            }
        else{
            System.out.println("1 para agregar, 2 para eliminar");
            int eleccion=entradaUsuario();
            if (eleccion==1){
                int entrada=entradaUsuario();
                lista=agregarPila(lista,entrada);
                System.out.println(lista);
            }
            else{
                lista=eliminarPila(lista);
                System.out.println(lista);
            }
        }
        return lista;
    } 
    public static void main(String[] args) {
        ArrayList lista=crearLista();
        listaEjecucion(lista);
    }
}
