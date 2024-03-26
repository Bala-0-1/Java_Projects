package CaeserCipher;

public class CaeserCipher {

    private String str;
    private int key;
    public CaeserCipher(){
        str ="";
        key = 3;
    }

    public CaeserCipher(String str,int key){
        this.str = str;
        this.key = key;
    }

    public CaeserCipher(String str){
        this.str = str;
        key = 3;
    }

    public static void main(String[] args) {
        CaeserCipher c = new CaeserCipher("defg");
        System.out.println(c.decipher(c.cipher()));
    }

    public String cipher(){
        String cipheredString = "";
        for(int i = 0;i<str.length();i++){
            int temp = str.charAt(i)+key;
            cipheredString+=(char)temp;        
        }
        return cipheredString;
    }

// Overloading cipher method with string arguments

    public String cipher(String str){
        String cipheredString = "";
        for(int i = 0;i<str.length();i++){
            int temp = str.charAt(i)+key;
            cipheredString+=(char)temp;        
        }
        return cipheredString;
    }

    public String decipher(String str){
        String decipheredString = "";
        for(int i = 0;i<str.length();i++){
            int temp = str.charAt(i)-key;
            decipheredString+=(char)temp;        
        }
        return decipheredString;
    }

    
}
