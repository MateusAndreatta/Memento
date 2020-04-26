package com.company;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exemplo {

    static int frameWidth = 800;
    static int frameHeight = 500;

    public static void main(String[] args) {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("");
        careTaker.addMemento(originator.saveStateToMemento());

        JFrame frame = new JFrame("Memento | Desing Pattern");
        frame.setSize(frameWidth, frameHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel painel = new JPanel();
        frame.add(painel);
        inserir_componentes(painel, originator, careTaker);
        frame.setVisible(true);
    }

    private static void inserir_componentes(JPanel painel, Originator originator, CareTaker careTaker) {
        painel.setLayout(null);
        JTextArea textArea = new JTextArea();
        textArea.setColumns(30);
        textArea.setRows(10);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBounds(10, 10, frameWidth - 35, frameHeight-150);
        painel.add(textArea);

        JButton botaoSalvar = new JButton("Salvar");
        botaoSalvar.setBounds(10, frameHeight - 70, 100, 25);
        painel.add(botaoSalvar);
        JButton botaoRecuperar = new JButton("Recuperar");
        botaoRecuperar.setBounds(120, frameHeight - 70, 100, 25);
        painel.add(botaoRecuperar);
        ButtonListener saveListener = new ButtonListener(textArea, originator, careTaker);
        ButtonListener recuperarListener = new ButtonListener(textArea, originator, careTaker);
        botaoSalvar.addActionListener(saveListener);
        botaoRecuperar.addActionListener(recuperarListener);

    }

}

class ButtonListener implements ActionListener {

    JTextArea textArea;
    Originator originator;
    CareTaker careTaker;

    public ButtonListener(JTextArea textArea, Originator originator, CareTaker careTaker) {
        this.textArea = textArea;
        this.originator = originator;
        this.careTaker = careTaker;
    }

    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()){
            case "Recuperar":
                Memento mementoRecuperado = careTaker.getMemento();
                if(mementoRecuperado != null){
                    originator.getStateFromMemento(mementoRecuperado);
                    textArea.setText(originator.getState());
                }
                break;
            case "Salvar":
                originator.setState(textArea.getText());
                careTaker.addMemento(originator.saveStateToMemento());
                break;
        }
    }
}