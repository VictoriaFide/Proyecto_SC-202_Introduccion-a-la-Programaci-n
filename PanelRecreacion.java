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
public class PanelRecreacion {
 
    private GestorRecreacion gestor;
 
    public PanelRecreacion(GestorRecreacion gestor) {
        this.gestor = gestor;
    }
 
    public void mostrar() {
        int opcion = -1;
 
        while (opcion != 0) {
            String lectura = JOptionPane.showInputDialog(
                    "RECREACIÓN -> 1. Ver estado | 2. Reservar mesa | 3. Liberar mesa | "
                    + "4. Reservar cancha | 5. Liberar cancha | 0. Volver  -  Digite una opción:");
 
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
                            verEstado();
                            break;
                        case 2:
                            reservarMesa();
                            break;
                        case 3:
                            liberarMesa();
                            break;
                        case 4:
                            reservarCancha();
                            break;
                        case 5:
                            liberarCancha();
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
 
 
    private void verEstado() {
        JOptionPane.showMessageDialog(null, gestor.mostrarMesas());
        JOptionPane.showMessageDialog(null, gestor.mostrarCanchas());
    }
 
    private void reservarMesa() {
        int numero = pedirNumero("Digite el número de mesa a reservar:");
        if (numero == -1) {
            return; 
        }
        String nombre = pedirNombre();
        if (nombre == null) {
            return; 
        }
        JOptionPane.showMessageDialog(null, gestor.reservarMesa(numero, nombre));
    }
 
    private void liberarMesa() {
        int numero = pedirNumero("Digite el número de mesa a liberar:");
        if (numero == -1) {
            return;
        }
        JOptionPane.showMessageDialog(null, gestor.liberarMesa(numero));
    }
 
    private void reservarCancha() {
        int numero = pedirNumero("Digite el número de cancha a reservar:");
        if (numero == -1) {
            return;
        }
        String nombre = pedirNombre();
        if (nombre == null) {
            return;
        }
        JOptionPane.showMessageDialog(null, gestor.reservarCancha(numero, nombre));
    }
 
    private void liberarCancha() {
        int numero = pedirNumero("Digite el número de cancha a liberar:");
        if (numero == -1) {
            return;
        }
        JOptionPane.showMessageDialog(null, gestor.liberarCancha(numero));
    }
 
    private int pedirNumero(String mensaje) {
        String lectura = JOptionPane.showInputDialog(mensaje);
        if (lectura == null) {
            return -1;
        }
        lectura = lectura.trim();
        if (!gestor.esNumero(lectura)) {
            return 0;
        }
        return Integer.parseInt(lectura);
    }
 
    private String pedirNombre() {
        String nombre = JOptionPane.showInputDialog("Digite el nombre del empleado:");
        if (nombre == null) {
            return null;
        }
        nombre = nombre.trim();
        if (nombre.equals("")) {
            JOptionPane.showMessageDialog(null, "El nombre no puede estar vacío.");
            return null;
        }
        return nombre;
    }    
}
