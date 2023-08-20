/**
 * 
 * 
 * @version 2021
 * 
 * This Math trick and many more can be found at: http://www.pleacher.com/handley/puzzles/mtricks.html
 * Date: 10/4/22
 *
 */

public class MathTrick {
    /**
     * 
     ******  DO NOT USE ARRAYS OR CONVERT NUMBERS TO STRING UNTIL STEP 7 ******
     *
     */
    
    // Step 1) Creates a random 3 digit (100-999) number where the first and last digit differ by more than one
    // Hint: Use Math.random() to create number in the correct range
    //          use modulus to find the last digit and divide by 100 for the first digit.
    //         calculate the difference, which method can you use so it doesn't matter how the numbers are subtract?
    //          while the difference of the digits is less than 2, create a new random number and try again
    public static int getRandomNum() 
    {    int num = 0;
        int firstDigit = 0;
        int lastDigit = 0;
        int difference=0;
        while(difference<2){
        num=(int)(Math.random()*(1000-100)+100);
        lastDigit=num%10;
        firstDigit=num/100;
        difference=Math.abs(firstDigit-lastDigit);
            
  }
  return num;
}
   
       public static int reverseDigits (int num) {
    int num2=0;
    num2=num%10;
    int num3=(num/10)%10;
    int num4=num/100;
    int numReverse=(num2*100)+(num3*10)+(num4);
    return numReverse;
    
  }
  public static String replaceLtr(String str)
    {
      String str1=str.replaceAll("0","Y").replaceAll("2","P").replaceAll("3","L").replaceAll("4","R").replaceAll("5","O")
      .replaceAll("6","F").replaceAll("7","A").replaceAll("8","I").replaceAll("9","B");
      return str1;
    }
    public static String reverseString(String str) {
       int strLength=str.length();
       char c;
       String reverseString="";

        for(int i=0;i<strLength;i++){
            c=str.charAt(i);
            reverseString=c+reverseString;
     }
     return reverseString;
    }
        
    
   public static void main(String[]args){

int r=getRandomNum();
int s=reverseDigits(r);
System.out.println("1. The Starting number: "+r);
System.out.println("2. The reversed number: "+s);
int difference=Math.abs(s-r);
System.out.println("3. The difference is: "+difference);
int reverseDiff=(reverseDigits(difference))+difference;
System.out.println("4. The reversed number added to difference: "+reverseDiff);
int numXMill= reverseDiff*1000000;
System.out.println("5. The number times a million: "+numXMill);
int numXMill2=Math.abs(numXMill-733361573);
String str = String.valueOf(numXMill2);
System.out.println("6. Number subtraced and converted to string: "+str);
String replaced=replaceLtr(str);
System.out.println("7. Replaced number: "+replaced);
String reversed=reverseString(replaced);
System.out.println("8. Reversed number: "+reversed);


//        2.    Now reverse the digits to form a second number.

//        3.    Subtract the smaller number from the larger one.

//        4.    Now reverse the digits in the answer you got in step 3 and add it to that number.

//        5.    Multiply by one million.

//        6.    Subtract 733,361,573.

//        7.    Convert the number to a string in order to replace the numbers with letters.
//                 Ex: String str = String.valueOf(myNumber);
//            Then, replace each of the digits in your answer, with the letter it corresponds to using the table in the instructions.

//        8.    Now reverse the letters in the string to read your message backward.

    

    } // end main
}
 // end class