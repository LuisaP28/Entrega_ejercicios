public class ProductoEspecifico extends Producto {
    private String categoria;
    private String marca;
    public ProductoEspecifico(int id, String nombre, double precio, String categoria, String marca){
        super(id, nombre, precio);
        this.categoria = categoria;
        this.marca = marca;
    }

    //Getter y setter
    public String getCategoria() {
        return categoria;
    }

    public String getMarca() {
        return marca;
    }

    //To string
    @Override
    public String toString() {
        return "ProductoEspecifico{" +
                "categoria='" + categoria + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
