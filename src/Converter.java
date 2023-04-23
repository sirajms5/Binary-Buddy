// Converter class will convert integer value to binary or hexadecimal
public class Converter {

    // method convert will convert integer to binary
    private String intToBinary(int userInt){
        String binaryValue = Integer.toBinaryString(userInt);
        return binaryValue;
    }

    // method report will return the binary value of the integer
    public String report(int userInput){
        String binaryValue = intToBinary(userInput);
        String report = String.format("Binary value: %s", binaryValue);
        return report;
    }

    // floatToBinary method will convert float to binary in IEEE-754 format
    private String floatToBinary(float userInt){
        int binaryValue = Float.floatToIntBits(userInt);
        String binaryIeee = Integer.toBinaryString(binaryValue);
        String hexValue = Integer.toHexString(binaryValue);
        String report = String.format("Binary value: %s%nHexadecimal value: %s", binaryIeee, hexValue);
        return report;
    }

    // method report will return the binary value and hexadecimal value of the float
    public String report(float userInput){
        String report = floatToBinary(userInput);
        return report;
    }
}
