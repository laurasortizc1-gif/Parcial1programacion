package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public class Reserva {

    private String codigo;
    private String fecha;
    private byte numeroNoches;
    private byte cantidadHuespedes;
    private String metodoPago;
    private String valorTotal;

    private Reserva ownedbyHotel;
    private Huesped[] listaHuespedes;

    public Reserva(String codigoReserva, String fecha,
                   byte numeroNoches, byte cantidadHuespedes,
                   String metodoPago, String valorTotal) {

        this.codigo = codigoReserva;
        this.fecha = fecha;
        this.numeroNoches = numeroNoches;
        this.cantidadHuespedes = cantidadHuespedes;
        this.metodoPago = metodoPago;
        this.valorTotal = valorTotal;

    }
    public void setCodigoReserva(){
        this.codigoReserva = codigoReserva;
    }

    public String getCodigoReserva() {
        return codigo;
    }
    public void setFecha(){
        this.fecha = fecha;
    }
    public String getFecha() {
        return fecha;
    }
    public void setNumeroNoches(){
        this.numeroNoches = numeroNoches;
    }
    public byte getNumeroNoches() {
        return numeroNoches;
    }
    public void setCantidadHuespedes(){
        this.cantidadHuespedes = cantidadHuespedes;
    }

    public byte getCantidadHuespedes() {
        return cantidadHuespedes;
    }
    public void setMetodoPago(){
        this.metodoPago = metodoPago;
    }

    public String getMetodoPago() {
        return metodoPago;
    }
    public void setValorTotal(){
        this.valorTotal = valorTotal;
    }
    public String getValorTotal() {
        return valorTotal;
    }

}
