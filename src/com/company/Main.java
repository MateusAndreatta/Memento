package com.company;

public class Main {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.addMemento(originator.saveStateToMemento());

        originator.setState("State #3");
        careTaker.addMemento(originator.saveStateToMemento());

        originator.setState("State #4");
        System.out.println("State atual: " + originator.getState());

        originator.getStateFromMemento(careTaker.getMemento(0));
        System.out.println("Primeiro state salvo: " + originator.getState());
        originator.getStateFromMemento(careTaker.getMemento(1));
        System.out.println("Segundo state salvo: " + originator.getState());
    }
}
