package edu.neu.csye7374;

public class ClosedState implements MenuState {
    @Override
    public void showMenu() {
        System.out.println("Sorry, we are closed.");
    }

}
