/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import modelo.ProductoGrafico;
import javax.swing.*;
import java.awt.*;
import java.util.List;
/**
 *
 * @author PC
 */
public class CanvasInventario2D extends JPanel {

    private List<ProductoGrafico> datos;

    public void setDatos(List<ProductoGrafico> datos) {
    this.datos = datos;

    int ancho = Math.max(900, datos.size() * 150 + 100);

    setPreferredSize(new Dimension(ancho, 320));
    setMinimumSize(new Dimension(ancho, 320));

    revalidate();
    repaint();
}

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (datos == null || datos.isEmpty()) {
            return;
        }

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
        );

        g2d.setColor(Color.BLACK);
        g2d.drawString("Existencias de repuestos", 30, 25);

        int x = 40;
        int anchoBarra = 45;
        int base = 250;

        setMinimumSize(new Dimension(600, 320));

        double maxCantidad = datos.stream()
                .mapToDouble(ProductoGrafico::getValorVentas)
                .max().orElse(1);

        for (ProductoGrafico prod : datos) {

            int altoBarra = (int)
                    ((prod.getValorVentas() / maxCantidad) * 160);

            int y = base - altoBarra;

            g2d.setColor(new Color(41, 128, 185));
            g2d.fillRect(x, y, anchoBarra, altoBarra);

            g2d.setColor(Color.BLACK);
            g2d.drawString(
                    String.valueOf((int) prod.getValorVentas()),
                    x, y - 5
            );

            g2d.drawString(prod.getNombre(), x - 10, base + 20);

            x += 90;
        }
    }
}
