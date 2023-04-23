import java.util.Scanner;

// User class will ask user for input
public class User {

    private Scanner keyboard = new Scanner(System.in);

    // inputString methood will request user to input a string and it will return it
    public String inputString(String message){
        System.out.print(message);
        String userInput = keyboard.nextLine();
        return userInput;
    }

    // inputCharacter will ask the user to enter a character
    public char inputCharacter(String message){
        System.out.printf(message);
        char userInput = inputCharacter();
        return userInput;
    }

    // this method will make sure to select on character
    private char inputCharacter(){
        char userinput = keyboard.next().charAt(0);
        keyboard.nextLine();
        return userinput;
    }

    // inputInteger method will request user to input an integer
    public int inputInterger(String message){
        System.out.print(message);
        int userInput = inputInteger();
        return userInput;
    }

    // this method will check if input is integer
    private int inputInteger(){
        boolean isInputBad = true;
        int value = 0;
        while(isInputBad){
            if(keyboard.hasNextInt()){
                value = keyboard.nextInt();     
                isInputBad = false;
            } else {
                System.out.print("Invalid input. Enter an integer number: ");
            }                       
            keyboard.nextLine();
        }
        return value;
    }

     // inputfloat method will request user to input a float
     public float inputFloat(String message){
        System.out.print(message);
        float userInput = inputFloat();
        return userInput;
    }

    // this method will check if input is float
    private float inputFloat(){
        boolean isInputBad = true;
        float value = 0.0F;
        while(isInputBad){
            if(keyboard.hasNextFloat()){
                value = keyboard.nextFloat();     
                isInputBad = false;
            } else {
                System.out.print("Invalid input. Enter a decimal number: ");
            }                       
            keyboard.nextLine();
        }
        return value;
    }
}
