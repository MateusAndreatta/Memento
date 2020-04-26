package com.company;

import java.util.Stack;

public class CareTaker {

    private Stack<Memento> mementoList = new Stack<>();

    public void addMemento(Memento state){
        mementoList.push(state);
        System.out.println("[CaraTaker] Adicionado: " + state.getState());
    }

    public Memento getMemento(){
        if(mementoList.empty()){
            try {
                throw new Exception("Exception: Pilha vazia");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }else{
            Memento removido = mementoList.pop();
            System.out.println("[CaraTaker] Removido: " + removido.getState());
            return removido;
        }

        return null;
    }

}
