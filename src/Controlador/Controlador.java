package Controlador;


import Vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class Controlador implements ActionListener {

    private final VentanaPrincipal objV;
   // private final Medida objM;

    public Controlador(VentanaPrincipal frmV /*Medida objM*/) {
        this.objV = frmV;
        // this.objM = objM;
      //  this.objV.getBtnEjecutar().addActionListener(this);
    }

    public Controlador() {
        this.objV = new VentanaPrincipal();
       // this.objM = new Medida();
       // this.objV.getBtnEjecutar().addActionListener(this);
    }

    public void setVisible(boolean bln) {
        this.objV.pack();
        this.objV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.objV.setLocationRelativeTo(null);
        objV.setVisible(bln);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
       /* if (this.objV.getBtnEjecutar() == evento.getSource()) {
            if (!this.objV.getTxtMedida().getText().equals(" ")) {
                this.objM.setValor(Double.parseDouble(this.objV.getTxtMedida().getText()));
                this.objV.getTxtResp().append("El valor de " + objM.getValor()
                        + " en centímetros es " + objM.convEnCm() + "cms");
            }
            } else {
                this.objV.getTxtResp().append("El valor digitado no es correcto");
            }
       */ 
    }
       
}
