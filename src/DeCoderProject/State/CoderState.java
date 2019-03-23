package DeCoderProject.State;

import DeCoderProject.DeCoder;

import java.util.Scanner;

public class CoderState implements State {

    DeCoder deCoder;
    private Scanner coderScanner = new Scanner(System.in);
    private String codeWord;
    private int codeNumber;
    private String cipher;

    public CoderState(DeCoder deCoder) {
        this.deCoder = deCoder;
    }

    @Override
    public void cipherProcessing() {

    }

    @Override
    public void outputCipher() {

    }
}
