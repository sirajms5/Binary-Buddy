public class App {
    public static void main(String[] args) throws Exception {
        
        char option;
        String loopControl;
        User user = new User();
        Converter integerConverter = new Converter();

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
                    int userInteger = user.inputInterger("Enter an integer: ");
                    String binaryValue = integerConverter.report(userInteger);
                    System.out.println(binaryValue);
                break;
                case '2':
                    float userFloat = user.inputFloat("Enter a decimal: ");
                    String ieeeValue = integerConverter.report(userFloat);
                    System.out.println(ieeeValue);
                break;
                default:
                    System.out.println("Invalid input");
                break;
            }
            String request = String.format("%n%s", "Would you like to convert another number Y/N: ");
            loopControl = user.inputString(request);
        } while (loopControl.equalsIgnoreCase("Y"));
    }
}
