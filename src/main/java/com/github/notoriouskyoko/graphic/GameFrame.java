package com.github.notoriouskyoko.graphic;

import javax.swing.*;

public class GameFrame extends JFrame {

    JFrame jf = new JFrame();
    JPanel jp = new GamePanel();
    public void frame(){

        jf.setTitle("Ludo");
        jf.setSize(800,600);
        jf.setResizable(false);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(jp);


    }

}
