package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public class Hotel {

    private String nombre;

    private ArrayList<Huesped> listaHuespedes;
    private ArrayList<Habitacion> listaHabitaciones;

    public Hotel(String nombre) {//parametros informacion que entra
        //inicializar las variables
        this.nombre = nombre;
        listaHuespedes = new ArrayList<>();
        listaHabitaciones = new ArrayList<>();
    }
    //matriz
    //filas=habitaciones
    //columnas=dias
    private char[][] matrizocupacionSemanal;

    private String[] diasSemana = {
            "Lunes",
            "Martes",
            "Miércoles",
            "Jueves",
            "Viernes",
            "Sábado",
            "Domingo"
    };
    // set y get
    //matriz
    public Hotel(String nombre) {

        this.nombre = nombre;

        listaHabitaciones = new ArrayList<>();
    }
    public String Nombre() {
        return nombre;
    }

    public ArrayList<Habitacion> ListaHabitaciones() {
        return listaHabitaciones;
    }
    public void agregarHabitacion(Habitacion habitacion) {

        listaHabitaciones.add(habitacion);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setListaHuespedes(ArrayList<Huesped> listaHuespedes) {
        this.listaHuespedes = listaHuespedes;
    }

    public ArrayList<Huesped> getListaHuesped() {
        return listaHuespedes;
    }

    public void setListaHabitaciones(ArrayList<Habitacion> listaHabitaciones) {
        this.listaHabitaciones = listaHabitaciones;
    }

    public ArrayList<Habitacion> getListaHabitaciones() {
        return listaHabitaciones;
    }


    public String registrarhuesped(String nombre, String identificacion,
                                   byte edad, String telefono, String ciudadProcedencia) {
        String mensaje = "";
        Huesped buscado = buscarHuesped(telefono);
        if (buscado != null) {
            return mensaje += "Error el huesped que usted desea registra ya se encuentra registrado";
        } else {
            Huesped huespedNuevo = new Huesped(nombre, identificacion, telefono, edad, ciudadProcedencia);
            listaHuespedes.add(huespedNuevo);
            mensaje = "Huesped registrado con exito";
        }
        return mensaje;
    }

    public Huesped buscarHuesped(String telefono) {
        for (Huesped aux : listaHuespedes) {
            if (aux.getIdentificacion().equals(telefono)) {
                return aux;
            }
        }
        return null;

    }

    public String registrarReserva(String cantidadHuespedes, String numeroNoches, String metodoPago) {
       String mensaje="";
        if(metodoPago!=null){
            mensaje+="Su reserva se ha realizado con exito";
        }
        return mensaje;
    }


}
