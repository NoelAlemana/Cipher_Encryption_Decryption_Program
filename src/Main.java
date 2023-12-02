
public class Main {
    public static void main(String[] args) {
        CipherContext context = new CipherContext(new CeasarCipher());
        System.out.println("Encrypted Ceasar Message: "+context.encrypt("Hello World", 3));
        System.out.println("Decrypted Ceasar Message: "+context.decrypt(context.encrypt("Hello World", 3), 3));
        context.setCipherMode(new CeasarASCIICipher());
        System.out.println("Encrypted Ceasar ASCII Message: "+context.encrypt("Hello World", 5));
        System.out.println("Decrypted Ceasar ASCII Message: "+context.decrypt(context.encrypt("Hello World", 5), 5));
    }
}