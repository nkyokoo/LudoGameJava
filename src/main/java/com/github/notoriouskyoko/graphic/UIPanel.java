package com.github.notoriouskyoko.graphic;

import com.github.notoriouskyoko.game.GameEngine;

import javax.swing.*;
import java.awt.*;

public class UIPanel extends JPanel {


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Current turn: " + GameEngine.getInstance().getTurn(), 25, 54);

    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800, 600);
    }


}
