/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestorrecreacion;

/**
 *
 * @author Celes
 */
public class Reserva {
    private String empleado;
    private String tipo;    
    private int numero;
 
    public Reserva(String empleado, String tipo, int numero) {
        this.empleado = empleado;
        this.tipo = tipo;
        this.numero = numero;
    }
 
    public String getEmpleado() {
        return empleado;
    }
 
    public String getTipo() {
        return tipo;
    }
 
    public int getNumero() {
        return numero;
    }
 
    public String descripcion() {
        return tipo + " " + numero + " - " + empleado;
    }
}
