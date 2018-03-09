//Problem No 1.1 
package problem.no.pkg1;

/**
 *
 * @author Ankon
 */

import java.util.Scanner;
public class ProblemNo1 {

   public static void main(String[] args) {
       float num1,num2;
     double result;
     
     
     
     Scanner data = new  Scanner(System.in);
     
     System.out.println("Enter Total Training Hour:"); //Reading 1st Number
     num1=data.nextInt(); //Taking 1st Number
     System.out.println("Enter Class Hour:"); //Reading 2nd Number
     num2=data.nextInt(); //Taking 2nd Number
     
     if(num2 !=0)
     {
         result=num1/num2;
         System.out.println("\nTotal Number of Class : "+result);
     }
     else 
     {
         System.out.println("ALERT : Class Hour SHOULD BE NON-ZERO.");
         System.out.println("Try Again. \nThank You.");
         
     }
        
     System.exit(0);
    }
    
}
