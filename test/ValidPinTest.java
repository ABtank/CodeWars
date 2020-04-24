import org.junit.Test;
import ru.abramov.codewars.ValidPin;

import static org.junit.Assert.assertEquals;

public class ValidPinTest {
    @Test
    public void validPins() {
        assertEquals(true, ValidPin.validatePin("1234"));
        assertEquals(true, ValidPin.validatePin("0000"));
        assertEquals(true, ValidPin.validatePin("1111"));
        assertEquals(true, ValidPin.validatePin("123456"));
        assertEquals(true, ValidPin.validatePin("098765"));
        assertEquals(true, ValidPin.validatePin("000000"));
        assertEquals(true, ValidPin.validatePin("090909"));
    }

    @Test
    public void nonDigitCharacters() {
        assertEquals(false, ValidPin.validatePin("a234"));
        assertEquals(false, ValidPin.validatePin(".234"));
    }

    @Test
    public void invalidLengths() {
        assertEquals(false, ValidPin.validatePin("1"));
        assertEquals(false, ValidPin.validatePin("12"));
        assertEquals(false, ValidPin.validatePin("123"));
        assertEquals(false, ValidPin.validatePin("12345"));
        assertEquals(false, ValidPin.validatePin("1234567"));
        assertEquals(false, ValidPin.validatePin("-1234"));
        assertEquals(false, ValidPin.validatePin("+123"));
        assertEquals(false, ValidPin.validatePin("1.234"));
        assertEquals(false, ValidPin.validatePin("00000000"));
    }
}