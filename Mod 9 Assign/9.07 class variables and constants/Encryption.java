import java.util.ArrayList;
/**
 * Encryption Class
 *
 * @author 
 * @version 4/6/23
 */

public class Encryption {
    private static int shift;
    private static String message;
    private static String encryptStr;
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
  
    
    Encryption(int s, String m) {
        shift = s;
        message = m.toLowerCase();
    }
     Encryption(int s) {
        shift = s;
    }
    public static String getMessage() {
       return message;
    }
    public static int getShift() {
       return shift;
    }
     public static String getALPHABET() {
       return ALPHABET;
    }
    
     public static String encryptMessage(){
         encryptStr="";
        
    for (int i = 0; i < message.length(); i++)   
        {   
             
            if (!(message.charAt(i)==' ')){
               
            int pos = ALPHABET.indexOf(message.charAt(i));   
            int encryptPos = (shift + pos) % 26;   
            char encryptChar = ALPHABET.charAt(encryptPos);   
            encryptStr += encryptChar;  
            
        }else{
             char encryptChar= ' ';
             encryptStr += encryptChar;
        }
      
    }
     return encryptStr;
}
    
    
    public static void printEncryptedMessage() {
        System.out.print("Encrypted Message: ");
        System.out.println(encryptStr);
        System.out.println("\n");
        System.out.println("Shift Used: " + getShift());
    }
    
    public static void printAlphabet(){
     Encryption cse = new Encryption(shift, ALPHABET);
     System.out.println("Alphabet: "+ALPHABET);
     System.out.println("Encrypted Alphabet "+cse.encryptMessage());
     
}
      
}