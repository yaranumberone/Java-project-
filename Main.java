// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
        System.out.print("Enter your speed: ");
        int speed = input.nextInt();
        if (speed < 0 )
        {
            System.out.println("Invalid speed");
        } else if ( speed <= 20) {
            System.out.println("Very slow");
        }
        else if (speed <=60){
            System.out.println("normal speed ");
        }
        else if (speed <=120){
            System.out.println("fast ");
        }
        else {
            System.out.println("very fast");
        }
        
        input.close();
    }
}
