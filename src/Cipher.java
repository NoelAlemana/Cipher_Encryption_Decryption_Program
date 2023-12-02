public interface Cipher {
    String encrypt (CipherContext context,String text,int key);
    String decrypt(CipherContext context,String text,int key);
}