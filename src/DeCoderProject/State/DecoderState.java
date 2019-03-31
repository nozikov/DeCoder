package DeCoderProject.State;

public class DecoderState implements State{

    @Override
    public String encryptMessage(final String message, final int codeNumber) {
        StringBuilder cipherMessage = new StringBuilder();
        String returnMessage;
        for (int i = 0; i < message.length(); i++) {
            int characterNumber = message.charAt(i) - codeNumber;
            char encryptedСharacter = (char) characterNumber;
            cipherMessage.append(encryptedСharacter);
        }
        returnMessage = cipherMessage.toString();
        return returnMessage;
    }
}
