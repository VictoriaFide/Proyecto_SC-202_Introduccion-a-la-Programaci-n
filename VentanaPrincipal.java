
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tomas
 */

public class VentanaPrincipal {
    public void mostrarVentana(){
        int opcion=0;
        String opciont="";
        do{
            opciont = JOptionPane.showInputDialog(""
                    + "---SISTEMA-DE-GESTION---\n"
                    + "1.-GESTION DE EMPLEADOS-\n"
                    + "2.-------HISTORIAL------\n"
                    + "3.--------SALIR---------\n");
            if(opciont==null){
                opcion =3;
            }else{
                opcion=Integer.parseInt(opciont);
                if(opcion==1){
                    PanelEmpleados panel=new PanelEmpleados();
                    panel.mostrarMenu();
                }else if (opcion==2){
                    JOptionPane.showMessageDialog(null,"Historial en proceso");
                } else if (opcion!=3){
                    JOptionPane.showMessageDialog(null,"opcion incorrecta ");
                    
                }
                
            }
        }while (opcion!=3);
        JOptionPane.showMessageDialog(null,"programa finalizado");
        
        
        }
    }

