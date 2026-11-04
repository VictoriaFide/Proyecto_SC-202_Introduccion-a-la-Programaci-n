
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carla
 */
public class Reserva {
    String  codigo;
    String cliente;
    String fecha;
    String hora;
    int cantidadPersonas;
    
    public void mostrarMenu(){
        int opcion = 0;
        String opcionr = "";
        do {
            opcionr = JOptionPane.showInputDialog("" + "=====GESTION DE RESERVAS====" + "1.===HACER RESERVA===" + "2.===CONSULTAR RESERVA===" + "3.===CANCELAR RESERVA===" + "4.===MODIFICAR RESERVA===" + "5.===SALIR===" + "===SELECCIONE UNA OPCION===");
            
            if (opcionr == null){
                opcion = 5;
            } else {
                opcion = Integer.parseInt(opcionr);
                if (opcion == 1){
                    hacerReserva();
                } else if (opcion == 2){
                    consultaReserva();
                } else if (opcion == 3){
                    cancelarReserva();
                } else if (opcion == 4){
                    modificarReserva();
                } else if (opcion == 5){
                    JOptionPane.showMessageDialog(null, "Opcion Invalida");
                }  
            }        
        } while (opcion != 5);
    }    
    public void hacerReserva(){
        codigo = JOptionPane.showInputDialog("Digite el codigo de la reserva:");
        cliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
        fecha = JOptionPane.showInputDialog("Ingrese la fecha de la reserva:");
        hora = JOptionPane.showInputDialog("Ingrese la hora:");
        cantidadPersonas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la csntidad de personas:"));
        JOptionPane.showMessageDialog(null, "Reserva realizada correctamente");
    }  
    public void consultarReserva(){
        if (codigo != null){
            JOptionPane.showMessageDialog(null, "Codigo:" + codigo + "Cliente:" + cliente + "Fecha:" + fecha + "Hora:" + hora + "Cantidad de personas:" + cantidadPersonas);
        } else {
            JOptionPane.showMessageDialog(null, "No hay reserva");
        }    
    }
    public void cancelarReserva(){
        if (codigo !=null) {
            codigo = null;
            cliente = null;
            fecha = null;
            hora = null;
            cantidadPersonas = 0;
            JOptionPane.showMessageDialog(null, "Reserva Cancelada");
        } else {
            JOptionPane.showMessageDialog(null, "No hay reserva");
        }
    }        
    public void modificarReserva(){
        if (codigo != null){
            cliente = JOptionPane.showInputDialog("Nuevo nombre del cliente:");
            fecha = JOptionPane.showInputDialog("Nueva fecha:");
            hora = JOptionPane.showInputDialog("Nueva hora:");
            cantidadPersonas = Integer.parseInt(JOptionPane.showInputDialog("Nueva catidad de personas:"));
            JOptionPane.showMessageDialog(null, "Reserva modificada correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "No hay reserva");
        }
    }
}
