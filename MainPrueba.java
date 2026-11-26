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
public class MainPrueba {
     public static void main(String[] args) {
        RegistroReservas registro = new RegistroReservas();
        GestorRecreacion gestor = new GestorRecreacion(registro);
        PanelRecreacion panelRecreacion = new PanelRecreacion(gestor);
        PanelResumen panelResumen = new PanelResumen(gestor);
 
        int opcion = -1;
        while (opcion != 0) {
            String lectura = JOptionPane.showInputDialog(
                    "MENÚ DE PRUEBA -> 1. Recreación | 2. Resumen | 0. Salir  -  Digite una opción:");
            if (lectura == null) {
                opcion = 0;
            } else if (lectura.trim().equals("1")) {
                panelRecreacion.mostrar();
            } else if (lectura.trim().equals("2")) {
                panelResumen.mostrar();
            } else if (lectura.trim().equals("0")) {
                opcion = 0;
            } else {
                JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        }
    }
}
