import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DegreeConverterTest {

    @Test
    @DisplayName("Convert from Fahrenheit to Celcius")
    void convertFahrenheitToCelcius() {
        assertAll(
                () -> assertEquals(-273.15, DegreeConverter.convertFahrenheitToCelcius(-459.67)),
                () -> assertEquals(-40.0, DegreeConverter.convertFahrenheitToCelcius(-40.0)),
                () -> assertEquals(-17.78, DegreeConverter.convertFahrenheitToCelcius(0)),
                () -> assertEquals(0, DegreeConverter.convertFahrenheitToCelcius(32)),
                () -> assertEquals(37, DegreeConverter.convertFahrenheitToCelcius(98.6)),
                () -> assertEquals(100, DegreeConverter.convertFahrenheitToCelcius(212)));
    }

    @Test
    @DisplayName("Convert from Celcius to Fahrenheit")
    void convertCelciusToFahrenheit() {
        assertAll(
                () -> assertEquals(-459.67, DegreeConverter.convertCelciusToFahrenheit(-273.15)),
                () -> assertEquals(-40.0, DegreeConverter.convertCelciusToFahrenheit(-40.0)),
                () -> assertEquals(0, DegreeConverter.convertCelciusToFahrenheit(-17.78)),
                () -> assertEquals(32, DegreeConverter.convertCelciusToFahrenheit(0)),
                () -> assertEquals(98.6, DegreeConverter.convertCelciusToFahrenheit(37)),
                () -> assertEquals(212, DegreeConverter.convertCelciusToFahrenheit(100)));
    }
}