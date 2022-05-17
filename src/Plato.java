public class Plato {
    public Plato(String nombre, Integer precio, Integer stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    private String nombre;
    private Integer precio;
    private Integer stock;

    // Getters
    public String getNombre() {
        return nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public Integer getStock() {
        return stock;
    }

    // Disminuir stock
    public void decreaseStock(int num){
        this.stock -= num;
    }
}
