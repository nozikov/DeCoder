package DeCoderProject;

import DeCoderProject.State.CoderState;
import DeCoderProject.State.State;

import java.util.Scanner;

public class DeCoderUI {

    private String code;

    private Scanner scannerUI = new Scanner(System.in);

    void runDeCoderUI(State state) {
        String message = inputMessage();
        int codeNumber = inputCodeNumber();
        String result = state.encryptMessage(message, codeNumber);
        setCode(result);
        System.out.print("\nCipher: " + getCode() + "\n");
        DeCoder deCoder = new DeCoder();
        deCoder.runDeCoder();
    }

    private void setCode(String code) {
        this.code = code;
    }

    private String getCode() {
        return code;
    }

    private String inputMessage() {
        String message;
        System.out.print("\nInput message: ");
        message = scannerUI.nextLine();
//        scannerUI.nextLine();
        return message;
    }
    private int inputCodeNumber() {
        int codeNumber;
        System.out.print("\nInput code number: ");
        codeNumber = scannerUI.nextInt();
        return codeNumber;
    }

}
