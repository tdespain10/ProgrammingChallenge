package Calculator;

public class DeciamltoRomanNumeral {
    private String decimal;
    private String numeral;
    public DeciamltoRomanNumeral(String number) {
        this.decimal = number;
    }

    public String DecimalConverter(){
        int val = Integer.parseInt(decimal);
        StringBuilder sb = new StringBuilder();
        while(val>0) {
            if (val >= 1000) {
                sb.append("M");
                val = val-1000;
            }
            else if(val >= 500){
                if(val >= 900){
                    sb.append("CM");
                    val-=900;
                }
                else {
                    sb.append("D");
                    val = val - 500;
                }
            }
            else if(val >= 100){
                if(val >= 400){
                    sb.append("CD");
                    val-=400;
                }
                else {
                    sb.append("C");
                    val = val - 100;
                }
            }
            else if(val >= 50){
                if(val >= 90){
                    sb.append("XC");
                    val-=90;
                }
                else {
                    sb.append("L");
                    val = val - 50;
                }
            }
            else if(val >= 10){
                if(val >= 40){
                    sb.append("XL");
                    val-=40;
                }
                else {
                    sb.append("X");
                    val = val - 10;
                }
            }
            else if(val >= 5){
                if(val == 9){
                    sb.append("IX");
                    val-=9;
                }
                else {
                    sb.append("V");
                    val = val - 5;
                }
            }
            else if(val >= 1){
                if(val == 4){
                    sb.append("IV");
                    val-=4;
                }
                else {
                    sb.append("I");
                    val = val - 1;
                }
            }
        }
        setNumeral(sb.toString());
        return numeral;
    }

    public String getDecimal() {
        return decimal;
    }

    public void setDecimal(String decimal) {
        this.decimal = decimal;
    }

    public String getNumeral() {
        return numeral;
    }

    public void setNumeral(String numeral) {
        this.numeral = numeral;
    }
}
