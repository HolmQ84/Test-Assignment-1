public class RomanNumeralConverter {

    public static String convertToRomanNumber(int number) {
        int value = number;
        String returnString = "";
        do {
            if (value > 899) {
                if (value >= 1000) {
                    returnString += "M";
                    value -= 1000;
                } else {
                    returnString += "CM";
                    value -= 900;
                }
            } else if (value > 399) {
                if (value >= 500) {
                    returnString += "D";
                    value -= 500;
                } else {
                    returnString += "CD";
                    value -= 400;
                }
            } else if (value > 89) {
                if (value >= 100) {
                    returnString += "C";
                    value -= 100;
                } else {
                    returnString += "XC";
                    value -= 90;
                }
            } else if (value > 39) {
                if (value >= 50) {
                    returnString += "L";
                    value -= 50;
                } else {
                    returnString += "XL";
                    value -= 40;
                }
            } else if (value > 9) {
                returnString += "X";
                value -= 10;
            }
        } while (value >= 10);
        if (value == 9) {
            returnString += "IX";
        } else if (value == 8) {
            returnString += "VIII";
        } else if (value == 7) {
            returnString += "VII";
        } else if (value == 6) {
            returnString += "VI";
        } else if (value == 5) {
            returnString += "V";
        } else if (value == 4) {
            returnString += "IV";
        } else if (value == 3) {
            returnString += "III";
        } else if (value == 2) {
            returnString += "II";
        } else if (value == 1) {
            returnString += "I";
        }
        return returnString;
    }
}
