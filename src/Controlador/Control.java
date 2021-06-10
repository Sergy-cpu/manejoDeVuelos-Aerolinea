/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Lenovo
 */

import Vista.VentanaPrincipal;
import Vista.AgregarVuelos;
import Vista.Modificar;
import Vista.EliminarVuelos;
import Vista.MostrarVuelos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Control implements ActionListener{
    VentanaPrincipal Frmppal;
    AgregarVuelos FrmAgregar;
    Modificar FrmModificar;
    EliminarVuelos FrmEliminar;
    MostrarVuelos FrmMostrar;
    
    public Control(){
    Frmppal = new VentanaPrincipal();
    FrmAgregar = new AgregarVuelos();
    FrmModificar =new Modificar();
    FrmEliminar = new EliminarVuelos();
    FrmMostrar = new MostrarVuelos();
    
    Frmppal.getEscritorio().add(FrmAgregar);
    Frmppal.getEscritorio().add(FrmModificar);
    Frmppal.getEscritorio().add(FrmEliminar);
    Frmppal.getEscritorio().add(FrmMostrar);
    
    Frmppal.getMenuItemAgregar().addActionListener(this);
    Frmppal.getMenuItemModificar().addActionListener(this);
    Frmppal.getMenuItemEliminar().addActionListener(this);
    Frmppal.getMenuItemNacionales().addActionListener(this);
    Frmppal.getMenuItemInternacionales().addActionListener(this);
    Frmppal.getMenuItemTransOceanicos().addActionListener(this);
    
    FrmAgregar.getBtnAgregar().addActionListener(this);
    FrmAgregar.getBtnCancelar().addActionListener(this);
    FrmModificar.getBtnModificar().addActionListener(this);
    FrmModificar.getBtnCancelar().addActionListener(this);
    FrmEliminar.getBtnEliminar().addActionListener(this);
    FrmEliminar.getBtnCancelar().addActionListener(this);
    
    }
    
    public void iniciar(){
    Frmppal.setVisible(true);
        
    }

    
  
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()==Frmppal.getMenuItemAgregar()) 
            {FrmAgregar.setVisible(true);}
      
    }
    
    
    
}
