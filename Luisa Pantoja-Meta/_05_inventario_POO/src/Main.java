import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Inventario objInventario = new Inventario();

        Producto pro1 = new Producto(1, "Lápiz", 2000);
        ProductoEspecifico pro2 = new ProductoEspecifico(2, "Cuaderno", 7000, "Papelería", "Norma");

        objInventario.agregarProducto(pro1);
        objInventario.agregarProducto(pro2);

        System.out.println("Lista de productos");
        objInventario.setListaProductos();

        objInventario.eliminarProducto(1);
        System.out.println("Lista de eliminar el producto");
        objInventario.setListaProductos();

        System.out.println(objInventario.buscarPorNombre("cuaderno"));

    }

}