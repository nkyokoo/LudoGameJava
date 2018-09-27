package com.github.notoriouskyoko.graphic;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {



    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int[] x = new int[]{100, 200, 300, 400};
        int[] y = new int[]{50, 150, 250, 350};
        g.setColor(Color.RED);
        g.drawPolygon(x, y, x.length);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(400, 400);
    }



}
