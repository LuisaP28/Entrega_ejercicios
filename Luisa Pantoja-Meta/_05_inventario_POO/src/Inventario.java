import java.util.ArrayList;

public class Inventario {
    private int nuevoId;
    private ArrayList<Producto> listaProductos; //Visibilidad, tipo de dato y nombre

    public int getNuevoId() {
        return nuevoId;
    }

    public void setNuevoId(int nuevoId) {
        this.nuevoId = nuevoId;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public Inventario(){
        this.listaProductos = new ArrayList<>();
    }

    //Métodos
    public int aumentarId(){
        for (Producto objProducto: this.listaProductos){
            nuevoId += 1;
        }
        nuevoId += 1;
        return nuevoId;
    }
    //Añadir
    public void agregarProducto(Producto producto){
        this.listaProductos.add(producto);
    }

    //Eliminar
    public boolean eliminarProducto(int id){
       return listaProductos.removeIf(producto -> producto.getId() == id);
    }

    public  Producto buscarPorNombre(String nombreBuscar){
        for (Producto objProducto: this.listaProductos){
            if(objProducto.getNombre().equalsIgnoreCase(nombreBuscar)){
                return objProducto;

            }
        }
        return null;
    }

    //Listar
    public void setListaProductos(){
        for(Producto producto : this.listaProductos) {
            System.out.println("Id: " + producto.getId() + " Nombre: " + producto.getNombre() +
                    " Precio: " + producto.getPrecio());
        }
    }
}