package co.edu.uniquindio.poo.model;
import java.util.ArrayList;

public class Huesped {

    private String nombre;
    private String identificacion;
    private byte edad;
    private String telefono;
    private String ciudadProcedencia;

    private ArrayList<Reserva> listaReservas;

    private Hotel ownedByHotel;

    public Huesped(String nombres, String apellidos, String identificacion,
                   byte edad, String correo) {
        this.nombre = nombres;
        this.edad = edad;
        this.identificacion = identificacion;
        this.ciudadProcedencia = ciudadProcedencia;
        this.telefono = telefono;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono() {
        this.telefono = telefono;
    }

    public String getCiudadProcedencia() {
        return ciudadProcedencia;
    }

    public void setCiudadProcedencia() {
        this.ciudadProcedencia = ciudadProcedencia;
    }

    public ArrayList<Reserva> getListaReservas() {
        return listaReservas;
    }
}