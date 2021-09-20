public class DegreeConverter {

    public static double convertFahrenheitToCelcius(double fahrenheitNumber) {
        double number = (fahrenheitNumber-32)/1.8;
        return Math.round(number*100.0) / 100.0;
    }

    public static double convertCelciusToFahrenheit(double celciusNumber) {
        double number = (celciusNumber*1.8)+32;
        return Math.round(number*100.0) / 100.0;
    }
}
