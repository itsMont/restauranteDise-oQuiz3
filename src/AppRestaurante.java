import java.util.Scanner;
public class AppRestaurante {
    public static void main(String[] args) {
        // Creación de platos
        Plato poutine = new Plato("Poutine", 9000, 34);
        Plato sandwich = new Plato("Sandwich", 7500, 12);
        Plato alitasMini = new Plato("Alitas Pequeñas", 5000, 4);
        Plato alitasXL = new Plato("Alitas XL", 12000, 15);
        // Creación de Menus
        Plato []menuFrisby = {alitasMini, alitasXL};
        Menu frisby = new Menu(menuFrisby);
        Plato []menuKatharsis = {poutine, sandwich};
        Menu katharsis = new Menu(menuKatharsis);
        // Franjas horarias
        FranjaHoraria horario1 = new FranjaHoraria(12,"Lunes - Viernes", "8am-7pm");
        FranjaHoraria horario2 = new FranjaHoraria(15,"Sabado - Domingo","10am - 6pm");
        FranjaHoraria horario3 = new FranjaHoraria(23,"Lunes - Viernes","12am - 8pm");
        FranjaHoraria horario4 = new FranjaHoraria(20,"Sabado","12am - 9pm");
        FranjaHoraria [] horarioFrisby = {horario1, horario4};
        FranjaHoraria [] horarioKatharsis = {horario2, horario3};
        // Creación de restaurante para utilizar
        System.out.println("Bienvenid@ al Sistema de Gestión de restaurantes");
        Restaurante restaurante1 = new Restaurante("Frisby", frisby, horarioFrisby);
        Restaurante restaurante2 = new Restaurante("Katharsis", katharsis, horarioKatharsis);
        // Viendo información de cada restaurante
        System.out.println(restaurante1.getNombre());
        restaurante1.verHorariosDisponibilidad();


        System.out.println(restaurante2.getNombre());
        restaurante2.verHorariosDisponibilidad();
        // Crear comensales y reservas
        Comensal pablo = new Comensal("Pablo R.", restaurante1);
        Comensal daniel = new Comensal("Daniel O.", restaurante1);
        restaurante1.verHorariosDisponibilidad();
        Comensal laura = new Comensal("Laura G.", restaurante2);
        Comensal german = new Comensal("Germán P.", restaurante2);
        restaurante2.verHorariosDisponibilidad();

        german.buy();
    }
}
