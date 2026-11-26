/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestorrecreacion;

/**
 *
 * @author Celes
 */
public class RegistroReservas {
 
    private String listado = "";
    private int cantidad = 0;
 
    public void agregarReserva(Reserva reserva) {
        if (cantidad > 0) {
            listado += " | ";
        }
        cantidad++;
        listado += cantidad + ". " + reserva.descripcion();
    }
 
    public int getCantidad() {
        return cantidad;
    }
 
    public String getListado() {
        return listado;
    }
}
