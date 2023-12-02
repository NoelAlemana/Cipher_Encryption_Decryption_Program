public class CeasarASCIICipher implements  Cipher{
    @Override
    public String encrypt(CipherContext context, String text, int key) {
        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            int shiftedAscii = (int) currentChar + key;
            char encryptedChar = (char) shiftedAscii;
            encryptedText.append(encryptedChar);
        }
        return encryptedText.toString();
    }
    @Override
    public String decrypt(CipherContext context, String text, int key) {
        StringBuilder decryptedText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            int shiftedAscii = (int) currentChar - key;
            char decryptedChar = (char) shiftedAscii;
            decryptedText.append(decryptedChar);
        }
        return decryptedText.toString();
    }
}
