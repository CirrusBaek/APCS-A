import java.util.Scanner;

/**
 * Decryption Class
 *

 * @version 4/6/23
 */
public class Decryption
{
    public static final String ALPHABET = "abcefghijklmnopqrstuvwxyz";   
    public static int shift=0;
    public static String message="";
    private static String decryptStr;
      
     
    Decryption(int s, String m) {
        shift = s;
        message = m.toLowerCase().trim();
    }
    Decryption(int s) {
        shift = s;
    }
    public void getString(){
        
    }
    public static String decryptData()   
    {   
        decryptStr = "";     
        for (int i = 0; i <message.length(); i++)   
        {   
              
         if (!(message.charAt(i)==' ')){
            int pos = ALPHABET.indexOf(message.charAt(i));   
        
            int decryptPos = (pos-shift)% 26;   
            if (decryptPos < 0){   
                decryptPos = ALPHABET.length() + decryptPos;   
            }   
            char decryptChar = ALPHABET.charAt(decryptPos);   
              
    
            decryptStr += decryptChar;   
        }   else{
             char decryptChar= ' ';
             decryptStr += decryptChar;
        }
    }
          
        return decryptStr;   
    }   
    public static int getShift() {
        return shift;
    }
    
    public static void printDecryptedMessage() {
        System.out.print("Decrypted Message: ");
        System.out.println(decryptStr);
        System.out.println("\n");
    }
    public static void printAlphabet(){
     Decryption cse = new Decryption(shift, ALPHABET);
     System.out.println("Alphabet: "+ALPHABET);
     System.out.println("Decrypted Alphabet "+cse.decryptData());
     
}
    }

