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
        DeCoder deCoder = new DeCoder();
        deCoder.deCoderUI();

    }

    private void deCoderUI() {
        System.out.print("\nSelect an action:\n\n1 - Encode message;\n2 - Decode the message;\n\n0 - Exit\n\n>>> ");
        int selectAction = deCoderScanner.nextInt();
        switch (selectAction) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Error! Please input number from 0 to 2.");
                deCoderUI();
        }
    }

}
