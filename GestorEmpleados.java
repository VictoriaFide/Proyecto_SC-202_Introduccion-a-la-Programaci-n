
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tomas
 */
public class GestorEmpleados {
    public Empleado empleado1;
    public Empleado empleado2;
    public Empleado empleado3;
    
    public void agregarEmpleado(int espacio, Empleado empleado){
        if (espacio==1 ){
            this.empleado1=empleado;
        }
        if (espacio==2){
            this.empleado2=empleado;
        }
        if (espacio==3){
            this.empleado3=empleado;
        }
        JOptionPane.showInternalMessageDialog(null,"Empleado agregado correctamente");
    }
    public String consultarEmpleado(int espacio){
        if(espacio == 1 && this.empleado1 !=null){
            return this.empleado1.nombre;
        }
         if(espacio == 2 && this.empleado2 !=null){
            return this.empleado2.nombre;
        }
          if(espacio == 3 && this.empleado3 !=null){
            return this.empleado3.nombre;
        }
          return "EMPLEADO NO ENCONTRADO";
    }
    public void eliminarEmpleado(int espacio){
        if(espacio==1){
            this.empleado1=null;
        }
         if(espacio==2){
            this.empleado2=null;
        }
          if(espacio==3){
            this.empleado3=null;
        }
          JOptionPane.showInternalMessageDialog(null,"Operacion realizada");
    }

  
}
