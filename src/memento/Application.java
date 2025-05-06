package memento;

import memento.abc.Memento;
import memento.abc.Originator;

import java.util.Stack;

public class Application {
    public static void main(String[] args) {
        Stack<Memento> mementos = new Stack<>();

        Originator originator = new Originator();

        originator.setState("state 1");
        mementos.push(originator.createMemento());
//        Memento memento = new Memento("state Something"); //X
//        memento.getState(); //X
        originator.setState("state 2");
        mementos.push(originator.createMemento());
        originator.setState("state 3");
        mementos.push(originator.createMemento());
        originator.setState("state Final");
        mementos.push(originator.createMemento());

        originator.restoreMemento(mementos.pop());
        System.out.println(originator.getState()); //state Final
        originator.restoreMemento(mementos.pop());
        System.out.println(originator.getState()); //state 3
        originator.restoreMemento(mementos.pop());
        System.out.println(originator.getState()); //state 2
        originator.restoreMemento(mementos.pop());
        System.out.println(originator.getState()); //state 1
    }
}
