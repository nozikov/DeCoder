package DeCoderProject;

import DeCoderProject.State.CoderState;
import DeCoderProject.State.DecoderState;
import DeCoderProject.State.State;

import java.util.Scanner;

public class DeCoder {

    State coderState;
    State decoderState;
    private State state;

    private DeCoderUI deCoderUI = new DeCoderUI();

    DeCoder() {
        coderState = new CoderState();
        decoderState = new DecoderState();
    }

    public static void main(String[] args) {

        DeCoder deCoder = new DeCoder();
        deCoder.runDeCoder();

    }

    void runDeCoder() {
        final int coder = 1;
        final int decoder = 2;
        final int exit = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nChoice act:\n\n1 - Coder;\n2 - Decoder;\n\n0 - Exit;\n\n>>> ");
        int choiceState = scanner.nextInt();
        switch (choiceState) {
            case coder:
                setState(coderState);
                deCoderUI.runDeCoderUI(state);
                break;
            case decoder:
                setState(decoderState);
                deCoderUI.runDeCoderUI(state);
                break;
            case exit:
                break;
            default:
                runDeCoder();
                break;
        }
    }

     private void setState(final State state) {
        this.state = state;
    }



}
