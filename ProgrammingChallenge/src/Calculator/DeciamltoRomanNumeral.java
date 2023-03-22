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
                sb.append("D");
                val = val-500;
            }
            else if(val >= 100){
                sb.append("C");
                val = val-100;
            }
            else if(val >= 50){
                sb.append("L");
                val = val-50;
            }
            else if(val >= 10){
                sb.append("X");
                val = val-10;
            }
            else if(val >= 5){
                sb.append("V");
                val = val-5;
            }
            else if(val >= 1){
                sb.append("I");
                val = val-1;
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
