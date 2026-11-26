/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestorrecreacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Celes
 */
public class PanelResumen {
    private GestorRecreacion gestor;
 
    public PanelResumen(GestorRecreacion gestor) {
        this.gestor = gestor;
    }
 
    public void mostrar() {
        int opcion = -1;
 
        while (opcion != 0) {
            String lectura = JOptionPane.showInputDialog(
                    "RESUMEN -> 1. Vista general | 2. Listado de reservas | 0. Volver  -  Digite una opción:");
 
            if (lectura == null) {
                opcion = 0; 
            } else {
                lectura = lectura.trim();
                if (!gestor.esNumero(lectura)) {
                    JOptionPane.showMessageDialog(null, "Digite un número válido.");
                } else {
                    opcion = Integer.parseInt(lectura);
                    switch (opcion) {
                        case 1:
                            verVistaGeneral();
                            break;
                        case 2:
                            verListado();
                            break;
                        case 0:
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opción no válida.");
                    }
                }
            }
        }
    }
 
 
    private void verVistaGeneral() {
        int mesasOcupadas = gestor.getTotalMesas() - gestor.getMesasLibres();
        int canchasOcupadas = gestor.getTotalCanchas() - gestor.getCanchasLibres();
 
        JOptionPane.showMessageDialog(null,
                "VISTA GENERAL: Mesas libres: " + gestor.getMesasLibres() + " de " + gestor.getTotalMesas()
                + " (ocupadas: " + mesasOcupadas + ") | Canchas libres: " + gestor.getCanchasLibres()
                + " de " + gestor.getTotalCanchas() + " (ocupadas: " + canchasOcupadas + ")"
                + " | Reservas registradas: " + gestor.getRegistro().getCantidad());
        JOptionPane.showMessageDialog(null, gestor.mostrarMesas());
        JOptionPane.showMessageDialog(null, gestor.mostrarCanchas());
    }
 
    private void verListado() {
        if (gestor.getRegistro().getCantidad() == 0) {
            JOptionPane.showMessageDialog(null, "Todavía no hay reservas registradas.");
        } else {
            JOptionPane.showMessageDialog(null,
                    "LISTADO DE RESERVAS: " + gestor.getRegistro().getListado());
        }
    }
}
