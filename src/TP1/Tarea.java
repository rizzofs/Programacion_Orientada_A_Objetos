package src.TP1;

import java.time.LocalDate;

public class Tarea {

    public enum Prioridad {
        PENDIENTE, EN_PROCESO, COMPLETADO
    }

    private String descripcion;
    private Prioridad prioridad;
    private boolean estado;
    private LocalDate fecha;

    public Tarea(String descripcion, Prioridad prioridad, boolean estado, LocalDate fecha) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estado = estado;
        this.fecha = fecha;
    }

    public void crear_descripcion(String nueva_descipcion){
        descripcion = nueva_descipcion;
    }
    public void asignar_prioridad(Prioridad asignar){
        prioridad = asignar;
    }
    public void Esta_finalizada(boolean finalizada){
        estado = finalizada;
    }
    public void fecha_limite(LocalDate f_limite){
        fecha=f_limite;
    }

    public boolean esta_vencida(){
        return LocalDate.now().isAfter(fecha) && (!estado);
    }
    public boolean esCompleta(){
        return estado;
    }
    public String mostrar() {
        String x="";
        if(esta_vencida()){
            x="(Vencida)... ";
        }
        return x + descripcion;
    }
    public Prioridad obtener_prioridad() {
        return prioridad;
    }
    public LocalDate obtener_fecha() {
        return fecha;
    }
}