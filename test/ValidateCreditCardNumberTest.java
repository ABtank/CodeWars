import org.junit.Test;
import static org.junit.Assert.assertEquals;
import ru.abramov.codewars.ValidateCreditCardNumber;

public class ValidateCreditCardNumberTest {

    @Test
    public void test891() {
        assertEquals(false, ValidateCreditCardNumber.validate("891"));
        assertEquals(false, ValidateCreditCardNumber.validate("1238"));
        assertEquals(true, ValidateCreditCardNumber.validate("4111111111111111"));
        assertEquals(true, ValidateCreditCardNumber.validate("2626262626262626"));
        assertEquals(false, ValidateCreditCardNumber.validateOne("891"));
        assertEquals(false, ValidateCreditCardNumber.validateOne("1238"));
        assertEquals(true, ValidateCreditCardNumber.validateOne("4111111111111111"));
        assertEquals(true, ValidateCreditCardNumber.validateOne("2626262626262626"));

    }
}
