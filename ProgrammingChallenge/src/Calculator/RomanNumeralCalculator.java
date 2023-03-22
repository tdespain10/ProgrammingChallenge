package Calculator;

public class RomanNumeralCalculator {
    private String convertedNumber;
    private String notconvertedNumber;
    RomanNumeralCalculator(String notconvertedNumber){
        this.notconvertedNumber = notconvertedNumber;
    }
    public static void main(String[] args){
        String userInput = "";
        //Check for a valid argument and set the userinput
        if(args.length != 0){
            System.out.println(args[0]);
            userInput = args[0];
        }
        else{
            System.out.println("No input");
        }
        RomanNumeralCalculator calculator = new RomanNumeralCalculator(userInput);
        calculator.convertedNumber = calculator.calculateNumber(calculator.notconvertedNumber);
        if(calculator.convertedNumber == null){
            System.out.println("Invalid Number: "+ calculator.notconvertedNumber);
        }
        else{
            System.out.println("Converted Number: " + calculator.convertedNumber);
        }
    }

    public String calculateNumber(String notconvertedNumber){
        String number = null;
        //Check to see if the user input is a roman numeral or a decimal, or invalid
        if(notconvertedNumber.chars().allMatch(Character::isLetter)){ //is roman numeral
            RomanNumeraltoDecimal converter = new RomanNumeraltoDecimal(notconvertedNumber);
            number = converter.RomanNumeralConverter();
        }
        else if(notconvertedNumber.chars().allMatch(Character::isDigit)){ //is deciaml
            DeciamltoRomanNumeral converter = new DeciamltoRomanNumeral(notconvertedNumber);
            number = converter.DecimalConverter();
        }
        else{
            System.out.println("Input is invalid: " + notconvertedNumber);
        }
        return number;
    }


}
