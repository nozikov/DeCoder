package DeCoderProject.State;

public class CoderState implements State {

    private String cipher;
    private final String codeWord;
    private final int codeNumber;

    public CoderState(final CoderStateBuilder coderStateBuilder) {
        this.codeWord = coderStateBuilder.getCodeWord();
        this.codeNumber = coderStateBuilder.getCodeNumber();
    }

    @Override
    public void messageEncrypt() {
        StringBuilder cipherMessage = new StringBuilder();
        for (int i = 0; i < codeWord.length(); i++) {
            int characterNumber = codeWord.charAt(i) + codeNumber;
            char encryptedСharacter = (char) characterNumber;
            cipherMessage.append(encryptedСharacter);
        }
        setCipher(cipherMessage.toString());
    }

    public String getCipher() {
        return cipher;
    }

    private void setCipher(final String cipher) {
        this.cipher = cipher;
    }

    public static class CoderStateBuilder {

        private String codeWord;

        private int codeNumber;

        public CoderStateBuilder codeWord(final String codeWord) {
            this.codeWord = codeWord;
            return this;
        }

        public CoderStateBuilder codeNumber(final int codeNumber) {
            this.codeNumber = codeNumber;
            return this;
        }

        public String getCodeWord() {
            return codeWord;
        }

        public int getCodeNumber() {
            return codeNumber;
        }

        public CoderState build() {
            return new CoderState(this);
        }
    }
}
