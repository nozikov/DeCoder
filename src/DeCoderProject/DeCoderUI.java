package DeCoderProject;

import DeCoderProject.State.CoderState;
import DeCoderProject.State.DecoderState;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class DeCoderUI {

    private Scanner deCoderScanner = new Scanner(System.in);

    public void selectCoderOrDecoder() {
        System.out.print("\nSelect an action:\n\n1 - Encode message;\n2 - Decode the message;\n\n0 - Exit\n\n>>> ");
        int selectAction = deCoderScanner.nextInt();
        switch (selectAction) {
            case 1:
                encryptMessage();
                break;
            case 2:
                decryptMessage();
                break;
            case 0:
                break;
            default:
                System.out.println("Error! Please input number from 0 to 2.");
                selectCoderOrDecoder();
        }
    }

    private void encryptMessage() {
        final String codeWord = inputCodeWord();
        deCoderScanner.nextLine();
        final int codeNumber = inputCodeNumber();
        CoderState.CoderStateBuilder coderStateBuilder = new CoderState.CoderStateBuilder();
        coderStateBuilder.codeWord(codeWord).codeNumber(codeNumber).build();
        CoderState coderState = new CoderState(coderStateBuilder);
        coderState.messageEncrypt();
        String out = coderState.getCipher();
        System.out.println(out);
        selectCoderOrDecoder();
    }

    private void decryptMessage() {
        final String cipher = inputCipher();
        deCoderScanner.nextLine();
        final int codeNumber = inputCodeNumber();
        deCoderScanner.nextLine();
        DecoderState.DecoderStateBuilder decoderStateBuilder = new DecoderState.DecoderStateBuilder();
        decoderStateBuilder.cipher(cipher).codeNumber(codeNumber).build();
        DecoderState decoderState = new DecoderState(decoderStateBuilder);
        decoderState.messageEncrypt();
        System.out.println(decoderState.getCodeWord());
        selectCoderOrDecoder();
    }

    private String inputCodeWord() {
        System.out.print("Input code word: ");
        return deCoderScanner.nextLine();
    }

    private String inputCipher() {
        System.out.print("Input cipher: ");
        return deCoderScanner.nextLine();
    }

    private int inputCodeNumber() {
        System.out.print("Input code number: ");
        return deCoderScanner.nextInt();
    }

}
