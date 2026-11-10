/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestiontallerautomotriz;
import javax.swing.SwingUtilities;
import Vista.FrmVentanaPrincipal;
/**
 *
 * @author PC
 */
public class GestionTallerAutomotriz {

    public static void main(String[] args) {
       SwingUtilities.invokeLater(() -> {
            FrmVentanaPrincipal ventana = new FrmVentanaPrincipal();
            ventana.setVisible(true);
        });

    
    }
}
