# Memento
>"O Memento é um padrão de projeto comportamental que permite que você salve e restaure o estado anterior de um objeto."
[Refactoring Guru](https://refactoring.guru/pt-br/design-patterns/memento)

#### Principais classes
* Memento
  
  Objeto que mantém o estado do Originator
  
* Originator

  Cria Mementos do seu próprio estado, assim salvando seu estado em um memento, e pode restaurar estados de um Memento.

* Carataker

  Responsável por manter o histórico de instâncias gerado pelo Originator.

```Java

//Método responsável por receber um memento, e salva-lo em uma lista para assim manter o histórico
careTaker.addMemento();

//Método responsável por retornar um memento salvo em uma determinada posição na lista
careTaker.getMemento();

//Responsável por pegar o estado de um determinado Memento
originator.getStateFromMemento();

//Esse método pega o estado atual do Originator, e retorna em uma instância de Memento.
originator.saveStateToMemento();
```
