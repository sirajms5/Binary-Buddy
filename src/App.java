public class App {
    public static void main(String[] args) throws Exception {
        
        User user = new User();
        char option;
        String loopControl;

        do {
            // menu list
            String message = String.format("%s%n%4s%s%n%4s%s%n", "Choose which type of converter you would like to use:",
            "",
            "1. Convert intger number to binary.",
            "",
            "2. Convert decimal number to binary and hexadecimal using IEEE-754 Floating point converter.");
            option = user.inputCharacter(message);

            // menu options
            switch(option){
                case '1':
                    int userInteger = user.inputInterger("Enter integer");
                    //todo: create class to convert numbers
                break;
                case '2':
                break;
                default:
                    System.out.println("Invalid input");
                break;
            }
            loopControl = user.inputString("Would you like to convert another number Y/N: ");
        } while (loopControl.equalsIgnoreCase("Y"));
    }
}
