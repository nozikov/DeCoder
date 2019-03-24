package DeCoderProject.State;

public class DecoderState implements State {
    private String codeWord;
    private final String cipher;
    private final int codeNumber;

    public DecoderState(final DecoderStateBuilder decoderStateBuilder) {
        this.cipher = decoderStateBuilder.getCipher();
        this.codeNumber = decoderStateBuilder.getCodeNumber();
    }

    @Override
    public void messageEncrypt() {
        StringBuilder decryptedMessage = new StringBuilder();
        for (int i = 0; i < cipher.length(); i++) {
            int characterNumber = cipher.charAt(i) - codeNumber;
            char encryptedСharacter = (char) characterNumber;
            decryptedMessage.append(encryptedСharacter);
        }
        setCodeWord(decryptedMessage.toString());
    }

    public String getCodeWord() {
        return codeWord;
    }

    private void setCodeWord(final String codeWord) {
        this.codeWord = codeWord;
    }

    public static class DecoderStateBuilder {

        private String cipher;

        private int codeNumber;

        public DecoderStateBuilder cipher(final String cipher) {
            this.cipher = cipher;
            return this;
        }

        public DecoderStateBuilder codeNumber(final int codeNumber) {
            this.codeNumber = codeNumber;
            return this;
        }

        public String getCipher() {
            return cipher;
        }

        public int getCodeNumber() {
            return codeNumber;
        }

        public DecoderState build() {
            return new DecoderState(this);
        }
    }
}
