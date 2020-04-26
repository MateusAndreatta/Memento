package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");//Definido no originator, mas não salvo no Memento
        originator.setState("State #2");
        careTaker.addMemento(originator.saveStateToMemento());

        originator.setState("State #3");
        careTaker.addMemento(originator.saveStateToMemento());

        originator.setState("State #4");
        System.out.println("State atual: " + originator.getState());

        originator.getStateFromMemento(careTaker.getMemento());
        System.out.println("Ultimo state recuperado: " + originator.getState());
        originator.getStateFromMemento(careTaker.getMemento());
        System.out.println("Recuperado: " + originator.getState());
    }
}
