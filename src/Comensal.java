import java.util.Scanner;
public class Comensal {
    Scanner sc = new Scanner(System.in);
    public Comensal(String nombre, Restaurante restaurante) {
        this.nombre = nombre;
        this.restaurante = restaurante;
        System.out.println(nombre + " Elige un horario:");
        getRestaurante().verHorariosDisponibilidad();
        int dec = sc.nextInt();
        switch (dec) {
            case 1 -> this.hora = getRestaurante().getHorarios()[0];
            case 2 -> this.hora = getRestaurante().getHorarios()[1];
        }
        // Disminuye disponibilidad en la franja horaria del comensal
        hora.disminuirDisp();
    }
    private String nombre;
    private Restaurante restaurante;
    private FranjaHoraria hora;
    private Plato[] compra;

    // Getters
    public String getNombre() {
        return nombre;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public Plato[] getCompra() {
        return compra;
    }

    public void buy(){
        // Numero porciones
        int numPor = 0, costo = 0;
        char continuar = 's';
        while (continuar == 's'){
            System.out.println(getNombre() + " , selecciona la comida que deseas ordenar");
            getRestaurante().verPlatos();
            Plato []menuRest = getRestaurante().getMenu().getPlatos();
            int menuLen = menuRest.length;
            int sel = sc.nextInt();
            switch (sel) {
                case 1 -> {
                    System.out.println("¿Qué número de ordenes de " + menuRest[0].getNombre() + " desea?");
                    numPor = sc.nextInt();
                    if (menuRest[0].getStock() - numPor >= 0) {
                        System.out.println("Ha ordenado " + numPor + " ordenes de " + menuRest[0].getNombre());
                        costo += menuRest[0].getPrecio() * numPor;
                        System.out.println("Total: $" + costo);
                    } else {
                        System.out.println("No se pueden pedir " + numPor + " ordenes de " + menuRest[1].getNombre());
                        System.out.println("Intente con un número menor a " + menuRest[1].getStock());
                    }
                }
                case 2 -> {
                    System.out.println("¿Qué número de ordenes de " + menuRest[1].getNombre() + " desea?");
                    numPor = sc.nextInt();
                    if (menuRest[1].getStock() - numPor >= 0) {
                        System.out.println("Ha ordenado " + numPor + " ordenes de " + menuRest[1].getNombre());
                        costo += menuRest[1].getPrecio() * numPor;
                        System.out.println("Total: $" + costo);
                    } else {
                        System.out.println("No se pueden pedir " + numPor + " ordenes de " + menuRest[1].getNombre());
                        System.out.println("Intente con un número menor a " + menuRest[1].getStock());
                    }
                }
            }
            System.out.println("¿Desea seguir con otro pedido?: s/n ");
            // Leer char en Java
            continuar = sc.next().charAt(0);
        }
        System.out.println("Cliente: " + getNombre() + "\n\tTotal a pagar: $" + costo);
    }
}
