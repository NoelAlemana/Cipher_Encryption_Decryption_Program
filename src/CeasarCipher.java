public class CeasarCipher implements Cipher{
    @Override
    public String encrypt(CipherContext context, String text, int key) {
        StringBuilder encryptedText = new StringBuilder();

        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base;
                if (Character.isUpperCase(ch))
                    base = 'A';
                else
                    base = 'a';
                int originalAlphabetPosition = ch - base;
                int newAlphabetPosition = (originalAlphabetPosition + key) % 26;
                char encryptedChar = (char) (base + newAlphabetPosition);
                encryptedText.append(encryptedChar);
            } else {
                encryptedText.append(ch);
            }
        }

        return encryptedText.toString();
    }
    @Override
    public String decrypt(CipherContext context, String text, int key) {
        StringBuilder encryptedText = new StringBuilder();

        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base;
                if(Character.isUpperCase(ch))
                    base = 'A';
                else
                    base = 'a';
                int originalAlphabetPosition = ch - base;
                int newAlphabetPosition = (originalAlphabetPosition - key) % 26;
                char encryptedChar = (char) (base + newAlphabetPosition);
                encryptedText.append(encryptedChar);
            } else {
                encryptedText.append(ch);
            }
        }

        return encryptedText.toString();
    }
}
