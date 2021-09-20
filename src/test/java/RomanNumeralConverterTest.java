import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralConverterTest {

    @Test
    @DisplayName("Convert From Numbers to Roman Numerals")
    void convertToRomanNumber() {
        assertAll(
                () -> assertEquals("XVII", RomanNumeralConverter.convertToRomanNumber(17)),
                () -> assertEquals("XXXVIII", RomanNumeralConverter.convertToRomanNumber(38)),
                () -> assertEquals("LXII", RomanNumeralConverter.convertToRomanNumber(62)),
                () -> assertEquals("LXXIV", RomanNumeralConverter.convertToRomanNumber(74)),
                () -> assertEquals("C", RomanNumeralConverter.convertToRomanNumber(100)),
                () -> assertEquals("CXLIV", RomanNumeralConverter.convertToRomanNumber(144)),
                () -> assertEquals("CCXCIX", RomanNumeralConverter.convertToRomanNumber(299)),
                () -> assertEquals("DCCLXXVII", RomanNumeralConverter.convertToRomanNumber(777)),
                () -> assertEquals("M", RomanNumeralConverter.convertToRomanNumber(1000)));
    }
}