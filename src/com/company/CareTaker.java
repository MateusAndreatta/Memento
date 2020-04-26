package com.company;

import java.util.ArrayList;

public class CareTaker {

    private ArrayList<Memento> mementoList = new ArrayList<>();

    public void addMemento(Memento state){
        mementoList.add(state);
    }

    public Memento getMemento(int index){
        return mementoList.get(index);
    }

}
