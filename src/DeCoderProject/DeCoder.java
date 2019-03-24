package DeCoderProject;

import DeCoderProject.State.State;

import java.util.Scanner;

public class DeCoder {

    State currentState;
    private State decoderState;
    private State coderState;
    private Scanner deCoderScanner = new Scanner(System.in);

    public void setState(final State currentState) {
        this.currentState = currentState;
    }

    public State getState() {
        return currentState;
    }

    public static void main(String[] args) {
        DeCoderUI deCoderUI = new DeCoderUI();
        deCoderUI.selectCoderOrDecoder();

    }

}
