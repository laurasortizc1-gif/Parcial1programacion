package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

import java.util.ArrayList;

public class Habitacion {

    private String numeroHabitacion;
    private String tipoHabitacion;
    private byte capacidadPersonas;
    private String precioNoche;

    private ArrayList<Reserva> listaReservas;

    public Habitacion(String numeroHabitacion, String tipoHabitacion,
                      byte capacidadPersonas, String precioPorNoche) {

        this.numeroHabitacion = numeroHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.capacidadPersonas = capacidadPersonas;
        this.precioNoche = precioPorNoche;

        listaReservas = new ArrayList<>();
    }
    public void setNumeroHabitacion(){
        this.numeroHabitacion = numeroHabitacion;
    }

    public String getNumeroHabitacion() {
        return numeroHabitacion;
    }
     public void setTipoHabitacion(){
        this.tipoHabitacion = tipoHabitacion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }
    public void setCapacidadPersonas(){
        this.capacidadPersonas = capacidadPersonas;
    }

    public byte getCapacidadPersonas() {
        return capacidadPersonas;
    }
    public void setPrecioPorNoche(){
        this.precioPorNoche = precioPorNoche;
    }

    public String getPrecioPorNoche() {
        return precioNoche;
    }
     public void setListaReservas(ArrayList<Reserva>){
        this.codigoReserva = codigoReserva;
    }

    public ArrayList<Reserva> getListaReservas() {
        return listaReservas;
    }

}
