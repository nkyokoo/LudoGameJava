package com.github.notoriouskyoko.graphic;

import com.github.notoriouskyoko.game.Dice.Dice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame extends JFrame{

    JFrame jf = new JFrame();
    JPanel UIPanel = new UIPanel();
    JPanel gamePanel = new GamePanel();
    JButton rollDiceButton = new JButton();
    public void frame(){

        jf.setTitle("Ludo");
        jf.setSize(800,600);
        jf.setResizable(false);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        UIPanel.setPreferredSize(new Dimension(jf.getSize().width,jf.getSize().height));
        UIPanel.setLayout(null);
        gamePanel.setBounds(160,50, 400, 400);
        gamePanel.setPreferredSize(UIPanel.getPreferredSize());

        rollDiceButton.setText("Roll dice");
        rollDiceButton.addActionListener(e -> {
            Dice dice = new Dice();
            dice.roll();
        });


        jf.add(UIPanel);
        UIPanel.add(gamePanel);


    }



}
