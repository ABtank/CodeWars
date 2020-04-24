import org.junit.Test;
import ru.abramov.codewars.CountString;

import static org.junit.Assert.assertEquals;

public class CountStringTest {
    @Test
    public void sampleTests() {
        assertEquals("taxi", CountString.high("man i need a taxi up to ubud"));
        assertEquals("volcano", CountString.high("what time are we climbing up to the volcano"));
        assertEquals("semynak", CountString.high("take me to semynak"));
        assertEquals("szlsa", CountString.high("szlsa me to qsexk"));
    }
}