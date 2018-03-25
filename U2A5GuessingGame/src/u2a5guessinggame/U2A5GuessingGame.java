/*
 * It is a guessing game application, where the computer picks a random number 
 * between 1 and 100 and lets you keep guessing until you get it right
*/
package u2a5guessinggame;
import java.util.Scanner; 
/*
 *
 * @Ivory Xu
 */
public class U2A5GuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int randNum = (int)Math.ceil(Math.random()*100);
        int guess=0;
        Scanner input = new Scanner(System.in);
        
        while(guess!=randNum){
        System.out.println("Enter the number of your guess:");
        guess = input.nextInt();
        
       if(guess!=randNum){
           
           if(guess>randNum){
               System.out.println("Too High!");
           }else{
               System.out.println("Too Low!");
           }
           
           if(Math.abs(guess-randNum)>50){
               System.out.println("Freezing");
           }else if(Math.abs(guess-randNum)>25){
               System.out.println("Cold");
           }else if(Math.abs(guess-randNum)>15){
               System.out.println("Cool");
           }else if(Math.abs(guess-randNum)>10){
               System.out.println("Warm");
           }else if(Math.abs(guess-randNum)>5){
               System.out.println("Hot");
           }else{
               System.out.println("Boiling");
           }
       }else{
           System.out.println("You Got It!");
       }
        }
    }
    
}
