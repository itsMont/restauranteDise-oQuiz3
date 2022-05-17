public class FranjaHoraria {
    public FranjaHoraria(Integer disponibilidad, String dias, String hora) {
        this.disponibilidad = disponibilidad;
        this.hora = hora;
        this.dias = dias;
    }
    private Integer disponibilidad;
    private String hora;
    private String dias;
    // Getters
    public Integer getDisponibilidad() {
        return disponibilidad;
    }
    public String getHora() {
        return hora;
    }
    public String getDias() {
        return dias;
    }
    // disminuir disponibilidad
    public void disminuirDisp(){
        this.disponibilidad --;
    }
}
