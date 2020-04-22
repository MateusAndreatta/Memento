package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Mateus Andreatta on 09/03/2020
 **/
public class LeitorBotoes implements ActionListener {

    Originator originator = new Originator();
    CareTaker careTaker = new CareTaker();

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("opa");
        JButton origem = (JButton) actionEvent.getSource();
        switch (origem.getText()){
            case "Salvar":
                System.out.println("a");
                break;
            case "Recuperar":
                System.out.println("b");
                break;
        }
    }
}
