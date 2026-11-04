
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tomas
 */
public class PanelEmpleados {
    public GestorEmpleados gestor;
    public PanelEmpleados(){
        this.gestor=new GestorEmpleados();
    }
  public void mostrarMenu(){
        int opcion =0;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
            "---GESTION DE EMPLEADOS---\n"
            +"1.---AGREGAR EMPLEADO----\n"
            +"2.---CONSULTAR EMPLEADO--\n"
            +"3.---ELIMINAR EMPLEADO---\n"
            +"4.---MODIFICAR EMPLEADO--\n"
            +"5.---SALIR---------------\n"
            +"--SELECIONE UNA OPCION---\n"
            ));
            if(opcion==1){
                agregarEmpleado();  
            }
             if(opcion==2){
                consultarEmpleado();  
            }
              if(opcion==3){
                eliminarEmpleado();  
            }
            if(opcion==4){
                modificarEmpleado();  
            }
        }while(opcion!=5);
        
    }
    public void agregarEmpleado(){
        int espacio=Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el espacio (1-3)."));
        Empleado empleado = new Empleado();
        empleado.id=JOptionPane.showInputDialog("Digite la identificacion. ");
        empleado.puesto=JOptionPane.showInputDialog("Ingrese el puesto . ");
        empleado.nombre=JOptionPane.showInputDialog("Ingrese el nombre . ");
        gestor.agregarEmpleado(espacio, empleado);
        
    }
    public void consultarEmpleado(){
        int espacio=Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el espacio (1-3)."));
        String nombre = gestor.consultarEmpleado(espacio);
        JOptionPane.showMessageDialog(null,"resultado. "+nombre);
        
    }
    public void eliminarEmpleado(){
        int espacio=Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el espacio (1-3)."));
        gestor.eliminarEmpleado(espacio);
        
         
    }
public void modificarEmpleado(){
    int espacio =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el espacio del empleado(1-3)"));
    if (espacio ==1 && gestor.empleado1 !=null){
        gestor.empleado1.id=JOptionPane.showInputDialog("Nueva identificacion. ");
        gestor.empleado1.nombre=JOptionPane.showInputDialog("Nuevo nombre. ");
        gestor.empleado1.puesto=JOptionPane.showInputDialog("Nuevo puesto. ");
    }
    else if (espacio ==2 && gestor.empleado2 !=null){
        gestor.empleado2.id=JOptionPane.showInputDialog("Nueva identificacion. ");
        gestor.empleado2.nombre=JOptionPane.showInputDialog("Nuevo nombre. ");
        gestor.empleado2.puesto=JOptionPane.showInputDialog("Nuevo puesto. ");
    }
    else if (espacio ==3 && gestor.empleado2 !=null){
        gestor.empleado3.id=JOptionPane.showInputDialog("Nueva identificacion. ");
        gestor.empleado3.nombre=JOptionPane.showInputDialog("Nuevo nombre. ");
        gestor.empleado3.puesto=JOptionPane.showInputDialog("Nuevo puesto. ");
    }else{
    JOptionPane.showMessageDialog(null,"EMPLEADO NO ENCONTRADO");
    return;
    }
    JOptionPane.showMessageDialog(null,"Empleado modificado correctamnete");
     
}
    
}


