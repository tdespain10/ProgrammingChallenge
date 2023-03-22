package Calculator;

import java.util.ArrayList;

public class RomanNumeraltoDecimal {
    String I = "1";
    String V = "5";
    String X = "10";
    String L = "50";
    String C = "100";
    String D = "500";
    String M = "1000";
    private String numeral;
    private String decimal;

    RomanNumeraltoDecimal(String numeral){
        this.numeral = numeral;
    }

    //Converts the Roman Numeral provided and returns the decmial nubmer
    public String RomanNumeralConverter(){
        int number = 0;
        boolean isvalid = isValidRomanNumeral();
        if(isvalid) {
            for (int i = numeral.length() - 1; i > -1; ) {
                if (i - 1 > -1) {
                    int val1 = getValueOfNumeral(String.valueOf(numeral.charAt(i)));
                    int val2 = getValueOfNumeral(String.valueOf(numeral.charAt(i - 1)));
                        if (val1 > val2) {
                            number += (val1 - val2);
                            i -= 2;
                        } else {
                            number += val1;
                            i--;
                        }
                } else {
                    number += getValueOfNumeral(String.valueOf(numeral.charAt(i)));
                    i--;
                }
            }
            setDecimal(String.valueOf(number));
            return decimal;
        }
        else{
            return null;
        }
    }
    public boolean isValidRomanNumeral() {
        numeral = numeral.toUpperCase();
        ArrayList<Integer> numeralValueList = new ArrayList<>();
        for (int i = 0; i < numeral.length(); i++) {
            String letter = String.valueOf(numeral.charAt(i));
            if (!letter.equals("I") && !letter.equals("V") && !letter.equals("X") && !letter.equals("L") && !letter.equals("C") && !letter.equals("D") && !letter.equals("M")) {
                System.out.println("Input is invalid: " + numeral);
                return false;
            }
            int val = getValueOfNumeral(String.valueOf(numeral.charAt(i)));
            for (int j: numeralValueList) {
                if(val > j*10+1){
                    return false;
                }
                if(val/2 == j){
                    return false;
                }
            }
            numeralValueList.add(val);
        }
        return true;
    }
    public int getValueOfNumeral(String letter){
        int tempNumber= 0;
        if (letter.equals("I")){
            tempNumber = Integer.parseInt(I);
        }
        if (letter.equals("V")){
            tempNumber = Integer.parseInt(V);
        }
        if (letter.equals("X")){
            tempNumber = Integer.parseInt(X);
        }
        if (letter.equals("L")){
            tempNumber = Integer.parseInt(L);
        }
        if (letter.equals("C")){
            tempNumber = Integer.parseInt(C);
        }
        if (letter.equals("D")){
            tempNumber = Integer.parseInt(D);
        }
        if (letter.equals("M")){
            tempNumber = Integer.parseInt(M);
        }
        return tempNumber;
    }
    public String getNumeral() {
        return numeral;
    }

    public void setNumeral(String numeral) {
        this.numeral = numeral;
    }

    public String getDecimal() {
        return decimal;
    }

    public void setDecimal(String decimal) {
        this.decimal = decimal;
    }


}
