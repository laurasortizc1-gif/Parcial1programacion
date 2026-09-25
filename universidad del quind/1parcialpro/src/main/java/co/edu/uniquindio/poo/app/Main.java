package co.edu.uniquindio.poo.app;
import co.edu.uniquindio.poo.model.Reserva;
import co.edu.uniquindio.poo.model.Habitacion;
import co.edu.uniquindio.poo.model.Hotel;
import co.edu.uniquindio.poo.model.Huesped;

import javax.swing.*;

public class Main {

    static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Bienvenidos al sistema de gestion de reservas");

        String nombre = " StayPlus";

        Hotel hotel = new Hotel(nombre);
        //Hotel: tipo de variable (clase) , hotel: nombre de la variable, new: crea objeto de la clase Hotel)


        int opcion;

        do {
            opcion = Integer.valueOf(JOptionPane.showInputDialog(null,
                    "Por favor selecciones una opcion :\n ---Menu--\n" +
                            "1. Consultar huesped\n" +
                            " 2. Ver disponibilidad de habitaciones\n" +
                            " 3. Mostrar matriz de ocupación semanal\n" +
                            " 4. verificar reserva especial\n" +
                            " 5. Ver ingresos del hotel\n" +
                            ""));

            switch (opcion) {
                case 1:
                    registrarReserva(hotel);
                    break;
                case 2:
                    registrarHuesped(hotel);
                    break;
                case 3:
                    consultarHuesped(hotel);
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Muchas gracias por usar nuestro sistema");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion Invalida");

            }

        } while (opcion != 0);


    }

    private static void registrarReserva(Hotel hotel) {

        String cantidadHuespedes = JOptionPane.showInputDialog(null,
                "Por favor ingresar el numero de de huespedes que habra.");

        String numeroNoches = JOptionPane.showInputDialog(null,
                "Por favor ingresar el numero de noches de la reserva");
        String metodoPago = JOptionPane.showInputDialog(JOptionPane.showInputDialog(null, "Por favor, ingrese el metodo de pago"));

        String resultado = hotel.registrarReserva(cantidadHuespedes, numeroNoches, metodoPago);

        JOptionPane.showMessageDialog(null, resultado);

    }
    private static void registrarHuesped(Hotel hotel) {

        String identificacion = JOptionPane.showInputDialog(null,
                "Por favor ingresar la indentificaion del huesped");

        String nombre = JOptionPane.showInputDialog(null, "Por favor ingresar el nombre del huesped.");
        String edad = JOptionPane.showInputDialog(null, "Por favor ingresar la edad del huesped");
        String ciudadProcedencia = JOptionPane.showInputDialog(null, "Por favor ingresar la ciudad de procedencia del huesped");
        String telefono = JOptionPane.showInputDialog(null, "Por favor ingresar el telefono del estudiante nuevo");

    }

    private static void consultarHuesped(Hotel hotel) {
        String telefono = JOptionPane.showInputDialog(null,
                "Por favor ingresar el telefono del huesped");
        Huesped  huespedEncontrado = hotel.buscarHuesped(telefono);

        if (huespedEncontrado != null) {
            JOptionPane.showMessageDialog(null, "Huesped:");
        } else JOptionPane.showMessageDialog(null, "El estudiante con la identificacion " + telefono + " no existe");
    }

    private static void disponibilidadHabitaciones(Hotel hotel) {
        String identificacion = JOptionPane.showInputDialog(null,
                "Por favor ingresar la indentificaion del estudiante que desea buscar");


    }
}
