package DeCoderProject.State;

import DeCoderProject.*;

import java.util.Scanner;

public class DecoderState implements State {
    private final String codeWord;
    private final String cipher;
    private final int codeNumber;

    public DecoderState(final DecoderStateBuilder decoderStateBuilder) {
        this.codeWord = decoderStateBuilder.getCodeWord();
        this.cipher = decoderStateBuilder.getCipher();
        this.codeNumber = decoderStateBuilder.getCodeNumber();
    }

    @Override
    public void cipherProcessing() {

    }

    @Override
    public void outputCipher() {

    }

    public static class DecoderStateBuilder {

        private String codeWord;

        private String cipher;

        private int codeNumber;

        public DecoderStateBuilder codeWord(final String codeWord) {
            this.codeWord = codeWord;
            return this;
        }

        public DecoderStateBuilder cipher(final String cipher) {
            this.cipher = cipher;
            return this;
        }

        public DecoderStateBuilder codeNumber(final int codeNumber) {
            this.codeNumber = codeNumber;
            return this;
        }

        public String getCodeWord() {
            return codeWord;
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
