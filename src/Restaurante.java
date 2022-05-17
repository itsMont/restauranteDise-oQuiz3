public class Restaurante {
    public Restaurante(String nombre, Menu menu, FranjaHoraria[] horarios){
        this.nombre = nombre;
        this.menu = menu;
        this.horarios = horarios;
    };
    private String nombre;
    private Menu menu;
    private FranjaHoraria[] horarios;

    // Getters
    public String getNombre() {
        return nombre;
    }
    public FranjaHoraria[] getHorarios() {
        return horarios;
    }
    public Menu getMenu() {
        return menu;
    }

    public void verHorariosDisponibilidad(){
        for (int i = 0; i < getHorarios().length; i++){
            System.out.println(i+1 + ". " + getHorarios()[i].getDias()+ "\n\t" + getHorarios()[i].getHora() + "\n\tDisponibilidad: " + getHorarios()[i].getDisponibilidad());
        }
    }
    public void verStock(){
        System.out.println("Stock Disponible");
        Plato[] platosArr = getMenu().getPlatos();
        int cantidadPlatos = platosArr.length;

        for (int i = 0;i < cantidadPlatos; i++ ){
            System.out.println(i+1 + ". Nombre: " + platosArr[i].getNombre() + "\nStock: " + platosArr[i].getStock());
        }
        System.out.println("----------");
    }

    public void verPlatos(){
        System.out.println("Menú y precios");
        Plato[] platosArr = getMenu().getPlatos();
        for (int i = 0;i < platosArr.length; i++ ){
            System.out.println(i+1 +". Nombre: " + platosArr[i].getNombre() + "\nPrecio: $" + platosArr[i].getPrecio());
        }
        System.out.println("----------");
    }

}
