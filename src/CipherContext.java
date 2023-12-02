public class CipherContext {
        private Cipher cipherMode;
        public CipherContext(Cipher cipherMode) {
            this.cipherMode = cipherMode;
        }

        public Cipher getCipherMode() {
            return cipherMode;
        }

        public void setCipherMode(Cipher cipherMode) {
            this.cipherMode = cipherMode;
        }
        public String encrypt(String text,int key){
            return cipherMode.encrypt(this,text,key);
        }
        public String decrypt(String text,int key){
            return cipherMode.decrypt(this,text,key);
        }
}
