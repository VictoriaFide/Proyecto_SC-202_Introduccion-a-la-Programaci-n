
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tomas
 */
public class Empleado {
    String id;
    String nombre;
    String puesto;
   
    public void mostrarEmpleado(){
        JOptionPane.showMessageDialog(null,
                "identificacion. "+this.id
                +"Nombre. "+this.nombre
                +"Puesto. "+this.puesto);
    }
        
    
    }

